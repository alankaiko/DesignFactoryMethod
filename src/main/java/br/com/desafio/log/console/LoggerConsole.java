package br.com.desafio.log.console;

import br.com.desafio.log.Log;
import br.com.desafio.log.LogPrinterInterface;

public class LoggerConsole extends Log{

	@Override
	protected LogPrinterInterface CriarLogger() {
		return new PrintConsole();
	}

}
