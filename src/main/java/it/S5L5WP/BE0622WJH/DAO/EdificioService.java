package it.S5L5WP.BE0622WJH.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.S5L5WP.BE0622WJH.entity.Edificio;

@Service
public class EdificioService {

	@Autowired
	private EdificioRepository repo;
	
	public void insert(Edificio e) {
		repo.save(e);
	}
}
