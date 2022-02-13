package br.mygain.moneyearningforecast.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.mygain.moneyearningforecast.model.Costs;
@Repository
public interface CostsRepository extends JpaRepository<Costs, Integer> {

}
