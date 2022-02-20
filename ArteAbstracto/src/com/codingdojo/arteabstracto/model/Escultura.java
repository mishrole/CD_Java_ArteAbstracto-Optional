package com.codingdojo.arteabstracto.model;

public class Escultura extends Arte {
	private String material;
	
	public Escultura(String titulo, String autor, String descripcion, String material) {
		super();
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setDescripcion(descripcion);
		this.setMaterial(material);
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public void verArte() {
		System.out.println("Título: " + this.getTitulo() + "\nAutor: " + this.getAutor() + "\nDescripción: " + this.getDescripcion() + "\nMaterial: " + this.getMaterial() + "\n- - -");
	}

}
