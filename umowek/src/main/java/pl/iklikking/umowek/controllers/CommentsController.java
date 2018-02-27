package pl.iklikking.umowek.controllers;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.iklikking.umowek.services.IssuesService;

//Obs³uguje zg³oszenia do serwisu samochodowego
@Controller //To oznacza , ¿e dany bean pe³ni funkcje kontrolera
@RequestMapping("/comment/**") 
public class CommentsController {
	
	private IssuesService issuesService ;
	
	
    @Autowired
	public CommentsController(IssuesService issuesService) {
		super();
		this.issuesService = issuesService;
	}



	@RequestMapping("/{name:[a-z]+}{idComment:\\d+}/**")
	@ResponseBody //Nasza metoda zwraca bezpoœrednio treœæ odpowiedzi która ma zostaæ przekazana do przegl¹darki
	public String test(@PathVariable("name") String name , @PathVariable("idComment") String idComment) { //Zwracany jest ³añcuch String 
		return name + "wartosc ;" +idComment ;
	}
		
	}


