package spring_boot_project_artefact_id;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactService {
	@RequestMapping(value ="/contact", method=RequestMethod.GET)
	String list() {
		return "listing all contacts....";
	}
	
	
	
	@RequestMapping("/contact/{id}")
	String find(@PathVariable(value="id") long id) {
		return "get a product by id="+id;
	}
	
	@RequestMapping(value="/contact", method=RequestMethod.POST)
	String add(@RequestBody String contactData) {
		return "POST request with data sent in body: "+contactData;
	}
	
	@RequestMapping(value ="/contact_json", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	String listAsSJON() {
		return "['contact A', 'contact B','contact C']";
	}
	
	@RequestMapping(value ="/contact_xml", method=RequestMethod.GET, produces=MediaType.APPLICATION_XML_VALUE)
	String listAsSXML() {
		return "<?xml version=\"1.0\" ?><contacts><contact>contact A</contact><contact>contact B</contact></contacts>";
	}
	
	
	
}
