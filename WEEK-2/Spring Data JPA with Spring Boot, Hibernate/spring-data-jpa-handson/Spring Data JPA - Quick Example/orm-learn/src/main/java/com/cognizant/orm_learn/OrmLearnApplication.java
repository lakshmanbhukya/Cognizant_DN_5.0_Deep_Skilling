package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.logging.Logger;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER = Logger.getLogger
			(OrmLearnApplication.class.getName());
	private static CountryService countryService;
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(OrmLearnApplication.class, args);
		countryService = context.getBean(CountryService.class);
		LOGGER.info("Inside main method");
		getAllCountries();

	}
	private static  void getAllCountries() {
		LOGGER.info("start getAllCountries");
		List<Country> list=countryService.getAllCountries();
		for(Country country:list){
			LOGGER.info(country.toString());
		}
	}

}
