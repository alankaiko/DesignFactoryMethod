package br.com.desafio.log.txt;

import br.com.desafio.log.Log;
import br.com.desafio.log.LogPrinterInterface;

public class LoggerTXT extends Log {

	@Override
	protected LogPrinterInterface CriarLogger() {
		return new PrintTXT();
	}

}
