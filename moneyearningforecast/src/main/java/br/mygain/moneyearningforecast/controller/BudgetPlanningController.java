package br.mygain.moneyearningforecast.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.mygain.moneyearningforecast.model.BudgetPlanning;
import br.mygain.moneyearningforecast.service.BudgetPlanningService;

@CrossOrigin	
@RestController
@RequestMapping(path = "/api/mygain/moneyearningforecast/budgetplannin")
public class BudgetPlanningController {
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<BudgetPlanning>> getBudgetPlanningAll(){
		return new ResponseEntity<List<BudgetPlanning>>(BudgetPlanningService.getInstance().getBudgetPlanningAll(),HttpStatus.OK);
	}

}
