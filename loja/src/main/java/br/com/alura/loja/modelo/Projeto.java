package br.com.alura.loja.modelo;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

public class Projeto {
	private long id;
	private String nome;
	private int anoDeInicio;
	
	public Projeto() {
	}

	public Projeto(long id, String nome, int anoDeInicio) {
		super();
		this.id = id;
		this.nome = nome;
		this.anoDeInicio = anoDeInicio;
	}
	
	public int getAnoDeInicio() {
		return anoDeInicio;
	}
	
	public long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String toXml() {
		return new XStream().toXML(this);
	}

	public String toJSON() {
		return new Gson().toJson(this);
	}
}
