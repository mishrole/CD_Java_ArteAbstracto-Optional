package com.codingdojo.arteabstracto.model;

public class Pintura extends Arte {
	private String tipo;
	
	public Pintura(String titulo, String autor, String descripcion, String tipo) {
		super();
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setDescripcion(descripcion);
		this.setTipo(tipo);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void verArte() {
		System.out.println("Título: " + this.getTitulo() + "\nAutor: " + this.getAutor() + "\nDescripción: " + this.getDescripcion() + "\nTipo: " + this.getTipo() + "\n- - -");
	}
	
}
