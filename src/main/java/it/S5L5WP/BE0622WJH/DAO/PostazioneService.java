package it.S5L5WP.BE0622WJH.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.S5L5WP.BE0622WJH.entity.Postazione;

@Service
public class PostazioneService {

	@Autowired
	private PostazioneRepository repo;
	
	public void insert(Postazione e) {
		repo.save(e);
	}
}
