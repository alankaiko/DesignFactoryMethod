package br.com.desafio.log.txt;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import br.com.desafio.log.LogPrinterInterface;

public class PrintTXT implements LogPrinterInterface {
	
	public void Print(String... mensagem) {
		try {
			FileWriter arq = new FileWriter("c:\\logimposto.txt");
			PrintWriter gravarArq = new PrintWriter(arq);

			for(String a : mensagem)
				gravarArq.println(a);

			arq.close();
		} catch (IOException e) {
			System.out.println("erroooooooo");
		}

	}

}
