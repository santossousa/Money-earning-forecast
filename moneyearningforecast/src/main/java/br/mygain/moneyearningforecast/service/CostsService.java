package br.mygain.moneyearningforecast.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.mygain.moneyearningforecast.model.Costs;
import br.mygain.moneyearningforecast.repository.CostsRepository;

@Service
public class CostsService {
	
	@Autowired
	private CostsRepository costRepository;
	private static CostsService costsService = null;
	
	public static synchronized CostsService getInstance() {
		if(Objects.isNull(costsService)) {
			costsService =  new CostsService();
		}
		return costsService;
	}
	public void create(Costs costs) throws NullPointerException {

		costRepository.save(costs);

	}
	
}
