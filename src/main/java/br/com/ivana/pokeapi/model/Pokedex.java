package br.com.ivana.pokeapi.model;

import java.util.Arrays;

import javax.persistence.Embedded;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pokedex {

	
	private Integer count;
	private String previous;	
	@Embedded
	private Pokemon[] results;
	
	
	
	public Pokemon[] getResults() {
		return results;
	}
	@Override
	public String toString() {
		return "Pokedex [count=" + count + ", previous=" + previous + ", results=" + getResults()[1].toString() + "]";
	}
	public void setResults(Pokemon[] results) {
		this.results = results;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Pokedex() {
		super();
	}
	public Pokedex(Integer count, String previous, Pokemon[] results) {
		super();
		this.count = count;
		this.previous = previous;
		this.results = results;
	}
	
	public String getPrevious() {
		return previous;
	}
	public void setPrevious(String previous) {
		this.previous = previous;
	}
}
