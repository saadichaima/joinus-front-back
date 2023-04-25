package tn.enicarthage.repositories;

import java.util.List;

import javax.persistence.Query;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.enicarthage.entities.Semaine;

public interface SemaineRepository extends JpaRepository<Semaine,Long>  {

	
	
	
}
