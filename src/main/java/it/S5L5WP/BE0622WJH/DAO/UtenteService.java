package it.S5L5WP.BE0622WJH.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.S5L5WP.BE0622WJH.entity.Utente;

@Service
public class UtenteService {

	@Autowired
	private UtenteRepository repo;
	
	public void insert(Utente e) {
		repo.save(e);
	}
}
