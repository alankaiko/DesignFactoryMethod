package br.com.desafio.log.xml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import br.com.desafio.log.LogPrinterInterface;

public class PrintXml implements LogPrinterInterface{

	public void Print(String... mensagem) {
		XStream xstream = new XStream(new DomDriver());
		xstream.toXML(mensagem);
		
		System.out.println(xstream);
	}

}
