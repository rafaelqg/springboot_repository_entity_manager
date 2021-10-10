package spring_boot_project_artefact_id;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActorService {
	
	@Autowired 
	ActorRepository actorRepository;
	
	@PersistenceContext
	private EntityManager entityManager;
	 String output="";
	 
	@RequestMapping("/actors")
	String list() {
		List<Actor> list=actorRepository.findAll();
		String output="";
		for(Actor actor: list) {
			output+=actor.getFirstName()+" "+actor.getLastName()+"<br />";
					
		}
		return output;
	}
	
	@RequestMapping("/native_query")
	String nativeQuery() {
		String queryStr="SELECT first_name, last_name FROM actor where actor_id<?;";
       
		try{
            Query query=entityManager.createNativeQuery(queryStr);
            query.setParameter(1, 10);
            List<Object[]> list=query.getResultList();
            list.stream().forEach((record) -> {
                String firstName = (String) record[0];
                String lastName = (String) record[1];
                output+= firstName+" "+lastName+"<br />";
            });
            return output+="List: "+String.valueOf(list.size());
        } catch(Exception e) {
            e.printStackTrace();
        }
        return "";
	}
		
}
