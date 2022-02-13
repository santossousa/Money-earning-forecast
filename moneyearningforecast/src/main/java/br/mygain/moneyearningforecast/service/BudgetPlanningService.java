package br.mygain.moneyearningforecast.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.mygain.moneyearningforecast.model.BudgetPlanning;
import br.mygain.moneyearningforecast.repository.BudgetPlanningRepository;

@Service
public class BudgetPlanningService {
	@Autowired
	private BudgetPlanningRepository budgetPlanningRepository;
	private static BudgetPlanningService budgetPlanningService = null;

	public static synchronized BudgetPlanningService getInstance() {
		if (Objects.isNull(budgetPlanningService)) {

			budgetPlanningService = new BudgetPlanningService();
		}
		return budgetPlanningService;
	}

	public void create(BudgetPlanning budfetPlanning) throws NullPointerException {

		budgetPlanningRepository.save(budfetPlanning);

	}
	public List<BudgetPlanning> getBudgetPlanningAll() {
		return budgetPlanningRepository.findAll();
	}
	
}
