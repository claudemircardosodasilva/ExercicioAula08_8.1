package Exercicio8_1;

public class Teste {
	public static void main(String[] args) {
		
	NoticiarioAssina noticiario = new NoticiarioAssina();
	new Consumidor("Dr Claudemir", noticiario, null);
	noticiario.notificaNoticia("Nova noticia", 1, 2, "Alguns Topicos interessantes!");
	new Consumidor("Thais", noticiario, null);
	noticiario.notificaNoticia("Noticia mais nova ainda", 2, 2, "Alguns Topico ruim");
	
	
	}
}
