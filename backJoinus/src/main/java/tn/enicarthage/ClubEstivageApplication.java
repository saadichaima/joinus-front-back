package tn.enicarthage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tn.enicarthage.entities.Client;
import tn.enicarthage.entities.Hebergement;
import tn.enicarthage.entities.Restauration;
import tn.enicarthage.repositories.ClientRepository;
import tn.enicarthage.repositories.HebergementRepository;
import tn.enicarthage.repositories.ReservationRepository;
import tn.enicarthage.repositories.RestaurationRepository; 

@SpringBootApplication
public class ClubEstivageApplication implements CommandLineRunner {

	@Autowired
	private ClientRepository  clientRepository ;
	@Autowired
	private HebergementRepository hebergementRepository;
	@Autowired
	private ReservationRepository ReservationRepository;
	
	private 	RestaurationRepository RestaurationRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ClubEstivageApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
	    Client client=new Client ( "nomClient1",  "adresse", " email", "tel");
		//clientRepository.save(client);
		clientRepository.findAll().forEach(c->{
			System.out.println(c.getNomClient());

		});
		//Hebergement hebergement=new Hebergement("typesafae","nomHebergement","description","emplacement","disponible","fff", 3000);
	       //hebergementRepository.save(hebergement);

		//reservationRepository.save(new Reservation("nomReservation",2, 1, client, hebergement));
		//Restauration restauration =new Restauration("typeRestauration", "nomRestauration", "typeRepas", "description" ,"nomPhoto",  70);
		//restaurationRepository.save(new Restauration("typeRestauration", "nomRestauration", "typeRepas", "description" ,"nomPhoto",  70));
		hebergementRepository.findAll().forEach(h->{
			System.out.println(h.getNomHebergement());

		}); 
		
	/*	roleRepository.save(new Role ( "admin"));
		roleRepository.save(new Role ( "client"));
		roleRepository.findAll().forEach(r->{
			System.out.println(r.getNomRole());

		});*/
		

	}
}
