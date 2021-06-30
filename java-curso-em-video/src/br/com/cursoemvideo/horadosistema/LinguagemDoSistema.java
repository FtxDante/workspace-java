package br.com.cursoemvideo.horadosistema;

import java.util.Locale;
import java.awt.Toolkit;
import java.awt.Dimension;

public class LinguagemDoSistema {

	public static void main(String[] args) {
		
		Locale idioma = Locale.getDefault();
		System.out.println(idioma.getDisplayLanguage().replace('p','P') + " - " + idioma.getDisplayCountry());
		
		Toolkit tela = Toolkit.getDefaultToolkit();
		Dimension d = tela.getScreenSize();
		
		System.out.println(d.width + "x" + d.height);
		
	}
	
}
