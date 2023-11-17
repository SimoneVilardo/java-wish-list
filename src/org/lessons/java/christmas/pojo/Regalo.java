package org.lessons.java.christmas.pojo;

public class Regalo {
	
	String nome;
	String destinatario;
	
	public Regalo(String nome, String destinatario) {
		
		
		setNome(nome);
		setDestinatario(destinatario);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
}
