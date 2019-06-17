package br.com.desafio.main;

import javax.swing.JOptionPane;

import br.com.desafio.calculo.CalcularImposto;
import br.com.desafio.log.xml.LoggerXml;

public class Principal {

	public static void main(String[] args) {
		CalcularImposto calc = new CalcularImposto(new LoggerXml());

		String valor = JOptionPane
				.showInputDialog("Digite ai o valor do produto para calculo de Icms");
		calc.IcmsCliFinal(Double.parseDouble(valor));

		System.out.println("Finalizado");
	}

}
