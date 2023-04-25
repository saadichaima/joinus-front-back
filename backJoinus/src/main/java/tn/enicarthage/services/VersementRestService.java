package tn.enicarthage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.entities.Client;
import tn.enicarthage.entities.Versement;
import tn.enicarthage.repositories.ClientRepository;
import tn.enicarthage.repositories.VersementRepository;

@RestController
@CrossOrigin("*")
public class VersementRestService {

	@Autowired
	private VersementRepository  versementRepository ;

	@RequestMapping(value="/versements",method=RequestMethod.GET)
	public List<Versement> getVersement(){
		return versementRepository.findAll();
		
	}
	
	
	@RequestMapping(value="/versement/{id}",method=RequestMethod.GET)
	public Versement getVersement(@PathVariable Long id){
		return versementRepository.findOne(id);
		
	}
	
	
	
	
}
