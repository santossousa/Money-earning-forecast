package br.mygain.moneyearningforecast.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.mygain.moneyearningforecast.model.BudgetPlanning;
@Repository
public interface BudgetPlanningRepository extends JpaRepository<BudgetPlanning,Integer> {

}
