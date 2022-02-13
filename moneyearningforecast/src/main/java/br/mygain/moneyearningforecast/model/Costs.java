package br.mygain.moneyearningforecast.model;

import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Costs {
	@Id
	@GeneratedValue( strategy= GenerationType.AUTO)
	private int id;
	private HashMap<String, Double> costsFixed = new HashMap<>();
	
	private HashMap<String,Double> costsVariable = new HashMap<>();

	
	
	public Costs() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public HashMap<String, Double> getCostsFixed() {
		return costsFixed;
	}


	public void setCostsFixed(HashMap<String, Double> costsFixed) {
		this.costsFixed = costsFixed;
	}


	public HashMap<String, Double> getCostsVariable() {
		return costsVariable;
	}


	public void setCostsVariable(HashMap<String, Double> costsVariable) {
		this.costsVariable = costsVariable;
	}


	

}
