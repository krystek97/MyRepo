package pl.iklikking.umowek;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import pl.iklikking.umowek.services.IssuesService;
import pl.iklikking.umowek.services.WebIssuesService;

//Nazwa Klasy konfiguracyjnej kt�ra b�dzie konfigurowa�a nasz kontekst stringowy//
@Configuration
@ComponentScan("pl.iklikking.umowek.controllers")
@EnableWebMvc //Pozwoli nam korzysta� z bardziej zaawansowanych zagadnie� frameworka MVC
public class UmowekWebConfiguration {

	@Bean
	public IssuesService issueService() {
		return new WebIssuesService() ;
	}
}
