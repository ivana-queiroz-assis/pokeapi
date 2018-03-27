package br.com.ivana.pokeapi.model;

import javax.persistence.Embeddable;

@Embeddable
public class Pokemon {

	@Override
	public String toString() {
		return "Pokemon [url=" + url + ", name=" + name + "]";
	}
	private String url;
	private String name;
	
	public Pokemon() {
		super();
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Pokemon(String url, String name) {
		super();
		this.url = url;
		this.name = name;
	}
	
}
