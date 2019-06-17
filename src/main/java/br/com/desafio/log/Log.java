package br.com.desafio.log;

import java.text.DateFormat;
import java.util.Date;

public abstract class Log {
	protected abstract LogPrinterInterface CriarLogger();

	public void CriarLog(String mensagem) {
		Date data = new Date();
		String dataformatada = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(data);
		String horaformatada = java.text.DateFormat.getTimeInstance(DateFormat.MEDIUM).format(data);
		
		
		CriarLogger().Print(dataformatada, horaformatada,  mensagem);
	}

}
