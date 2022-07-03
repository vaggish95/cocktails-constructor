package com.cocktail.site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WebSiteApplication {

	@Bean
	public RestTemplate getRestTemplate (){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(WebSiteApplication.class, args);

		/* TO DO :
		1. Exceptions
		2. Logging
		3. Cover by tests
		5. Let user upload his own photo
		6. DTO and DAO

		 */
	}


}
