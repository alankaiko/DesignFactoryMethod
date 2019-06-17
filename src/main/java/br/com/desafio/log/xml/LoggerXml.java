package br.com.desafio.log.xml;

import br.com.desafio.log.Log;
import br.com.desafio.log.LogPrinterInterface;

public class LoggerXml extends Log{

	@Override
	protected LogPrinterInterface CriarLogger() {
		return new PrintXml();
	}

}
