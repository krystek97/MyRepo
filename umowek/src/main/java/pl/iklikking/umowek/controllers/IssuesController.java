package pl.iklikking.umowek.controllers;

import java.util.Locale;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.iklikking.umowek.services.IssuesService;

//Obs�uguje zg�oszenia do serwisu samochodowego
@Controller //To oznacza , �e dany bean pe�ni funkcje kontrolera
@RequestMapping("/issue/**") 
public class IssuesController {
	
	private IssuesService issuesService ;
	
	
    @Autowired
	public IssuesController(IssuesService issuesService) {
		super();
		this.issuesService = issuesService;
	}



	@RequestMapping("/**")
	@ResponseBody //Nasza metoda zwraca bezpo�rednio tre�� odpowiedzi kt�ra ma zosta� przekazana do przegl�darki
	public String test(Locale locale) { //Zwracany jest �a�cuch String 
		return "Mapowanie /**" ; 
	}
	
	@RequestMapping(path = "/piwko/**" , method = RequestMethod.GET)
	@ResponseBody //Nasza metoda zwraca bezpo�rednio tre�� odpowiedzi kt�ra ma zosta� przekazana do przegl�darki
	public String testIssue(Locale locale) { //Zwracany jest �a�cuch String 
		return "Mapowanie GET " ;
	}
	
	
	@RequestMapping(path = "/piwko/tyskie/{test}/{idIssue}/**" , method = RequestMethod.GET)
	@ResponseBody
	public String testIssue5(@PathVariable("idIssue")  String idIssue , @PathVariable("test") Optional<String> xx ) {
    return "Wartosc zmiennej = "+idIssue+""+xx.orElse("puste");
	}
	}
	


