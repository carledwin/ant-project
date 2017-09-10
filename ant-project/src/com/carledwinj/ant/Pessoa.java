package com.carledwinj.ant;

import com.thoughtworks.xstream.XStream;

public class Pessoa {

	private String nome;
	private int idade;
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		
		XStream xs = new XStream();
		return xs.toXML(this) ;
	}
}
