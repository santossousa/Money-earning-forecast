package br.mygain.moneyearningforecast.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BudgetPlanning {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private double salary;

	@ManyToOne
	@JoinColumn(name = "budget_planning_id")
	private Costs Costs;

	public BudgetPlanning() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Costs getCosts() {
		return Costs;
	}

	public void setCosts(Costs costs) {
		Costs = costs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
