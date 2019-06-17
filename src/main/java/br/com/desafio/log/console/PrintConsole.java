package br.com.desafio.log.console;

import br.com.desafio.log.LogPrinterInterface;

public class PrintConsole implements LogPrinterInterface{

	public void Print(String... mensagem) {
		for(String a : mensagem)
			System.out.println(a);		
	}

}
