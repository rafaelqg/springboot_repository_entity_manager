package spring_boot_project_artefact_id;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductService {

	 @RequestMapping(value="/product", method=RequestMethod.GET)
	    public String getAll() {
	        return "listing all products...";
	    }
	 
	 @RequestMapping(value="/product/{id}",method=RequestMethod.GET)
	    public String getById(@PathVariable(value="id") long id) {
	        return "get a product by id="+id;
	    }
}
