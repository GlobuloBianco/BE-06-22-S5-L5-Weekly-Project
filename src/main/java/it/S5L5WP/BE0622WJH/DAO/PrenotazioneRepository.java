package it.S5L5WP.BE0622WJH.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import it.S5L5WP.BE0622WJH.entity.Prenotazione;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Integer> {
	List<Prenotazione> findById(int id);
	  
	@Query(value = "SELECT * FROM prenotazione", nativeQuery = true)
	List<Prenotazione> findAll();
	
	@Query(value = "SELECT * FROM prenotazione p INNER JOIN utente u ON p.utente_id = u.username WHERE u.nome_completo = :elemento", nativeQuery = true)
	List<Prenotazione> findByUser(@Param("elemento") String elemento);
}
