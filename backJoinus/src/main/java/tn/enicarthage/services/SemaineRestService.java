package tn.enicarthage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.entities.Semaine;
import tn.enicarthage.repositories.SemaineRepository;

@RestController
@CrossOrigin("*")
public class SemaineRestService {

	@Autowired
	private SemaineRepository  semaineRepository ;

	@RequestMapping(value="/semaines",method=RequestMethod.GET)
	public List<Semaine> getSemaines(){
		return semaineRepository.findAll();
		
	}
	
	
	@RequestMapping(value="/semaines/{id}",method=RequestMethod.GET)
	public Semaine getSemaine(@PathVariable Long id){
		return semaineRepository.findOne(id);
		
	}
	
	@RequestMapping(value="/semaines",method=RequestMethod.POST)
	public Semaine save(@RequestBody Semaine s){
		return semaineRepository.save(s);
		
	}
	@RequestMapping(value="/semaines/{id}",method=RequestMethod.DELETE)
	public boolean  supprimer(@PathVariable Long id){
		semaineRepository.delete(id);
	    return true;
		
	}
}
