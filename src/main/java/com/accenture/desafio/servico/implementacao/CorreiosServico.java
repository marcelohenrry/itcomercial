package com.accenture.desafio.servico.implementacao;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.accenture.desafio.modelo.Frete;
import com.accenture.desafio.servico.IClienteCorreios;
import com.accenture.desafio.util.Constante;

public class CorreiosServico implements IClienteCorreios {
	private static final Logger LOGGER = Logger.getLogger(CorreiosServico.class.getName());

	@Override
	public Frete custoEnvio(Frete frete) {
		StringBuilder url = new StringBuilder();
		url.append("http://ws.correios.com.br/calculador/CalcPrecoPrazo.aspx?sCepOrigem=");
		url.append(frete.getCepOrigem());
		url.append("&sCepDestino=");
		url.append(frete.getCepDestino());
		url.append("&nVlPeso=");
		url.append(frete.getPeso());
		url.append(
				"&nVlComprimento=30&nVlAltura=2&nVlLargura=15&nVlDiametro=0.0&nCdFormato=1&sCdMaoPropria=N&sCdAvisoRecebimento=N&nVlValorDeclarado=0,00&nCdServico=04510&nCdEmpresa=&sDsSenha=&StrRetorno=xml");
		HttpURLConnection connection = null;
		try {
			URL urlNet = new URL(url.toString());
			connection = (HttpURLConnection) urlNet.openConnection();
			InputStream resultato = connection.getInputStream();

			DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
			Document document = documentBuilder.parse(resultato);
			Element raiz = document.getDocumentElement();

			NodeList valor = raiz.getElementsByTagName("Valor");
			NodeList prazoEntrega = raiz.getElementsByTagName("PrazoEntrega");

			Element eValor = (Element) valor.item(0);
			Element ePrazoEntrega = (Element) prazoEntrega.item(0);

			frete.setValor(Constante.converterParaDouble(eValor.getTextContent()));
			frete.setPrazoEntrega(Constante.converterParaShort(ePrazoEntrega.getTextContent()));
			return frete;
		} catch (MalformedURLException e) {
			LOGGER.log(Level.SEVERE, "Erro no serviço dos correios ".concat(e.getMessage()));
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "Erro no serviço dos correios ".concat(e.getMessage()));
		} catch (ParserConfigurationException e) {
			LOGGER.log(Level.SEVERE, "Erro no serviço dos correios ".concat(e.getMessage()));
		} catch (SAXException e) {
			LOGGER.log(Level.SEVERE, "Erro no serviço dos correios ".concat(e.getMessage()));
		}
		return null;
	}

}
