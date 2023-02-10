package it.S5L5WP.BE0622WJH.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.S5L5WP.BE0622WJH.entity.Prenotazione;

@Service
public class PrenotazioneService {

	@Autowired
	private PrenotazioneRepository repo;
	
	public void insert(Prenotazione e) {
		repo.save(e);
	}
}
