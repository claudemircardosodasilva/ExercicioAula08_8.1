package Exercicio8_1;
public class Consumidor {
	private NoticiarioAssina noticiario;
	private String nome;
	public Consumidor(String nome,NoticiarioAssina noticiario, Consumidor consumidor) {
		this.noticiario = noticiario;
		this.nome = nome;
		//this.noticiario.inscrever(consumidor)(this);
		this.noticiario.inscrever(this);
	}
	public void update() {
		System.out.println(nome+" Recebeu noticia: "+noticiario.getNoticia().toString());
	}
	
	public String getNome() {
		return this.nome;
	}

}
