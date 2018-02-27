package pl.iklikking.umowek;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pl.iklikking.umowek.services.AppIssuesService;
import pl.iklikking.umowek.services.IssuesService;
import pl.iklikking.umowek.services.WebIssuesService;

//Nazwa Klasy konfiguracyjnej która bêdzie konfigurowa³a nasz kontekst stringowy//
@Configuration
public class UmowekAppConfiguration {

	@Bean
	public IssuesService issueService() {
		return new AppIssuesService() ;
	}
}
