package br.com.desafio.calculo;

import br.com.desafio.log.Log;

public class CalcularImposto {
	private Log loggger;

	public CalcularImposto(Log logger) {
		this.loggger = logger;
	}

	public void IcmsCliFinal(double valor) {
		double res = (valor * 17) / 100;
		CriaMensagem(res);
	}

	public void IcmsCliIntermediario(double valor) {
		double res = (valor * 12) / 100;
		CriaMensagem(res);
	}

	private void CriaMensagem(double res) {
		loggger.CriarLog("Valor do Imposto: " + res);
	}
}
