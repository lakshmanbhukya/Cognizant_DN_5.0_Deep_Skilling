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
//		addCountry(new Country("LK","Lakshman"));
//		updateCountry("LK","Lakshman Singh Naik Bhukya");
//		findCountryByID("LK");
//		deleteCountry("LK");


	}
	private static  void getAllCountries() {
		LOGGER.info("start getAllCountries");
		List<Country> list=countryService.getAllCountries();
		for(Country country:list){
			LOGGER.info(country.toString());
		}
	}
	private static void  addCountry(Country country) {
		LOGGER.info("start addCountry");
		countryService.addCountry(country);
		LOGGER.info(country.toString());
	}
	private static void findCountryByID(String code) {
		LOGGER.info("start findbyId");
		countryService.findByID(code);
		LOGGER.info(countryService.findByID(code).toString());

	}
	private static void updateCountry(String code,String name){
		LOGGER.info("start updateCountry");
		countryService.updateCountryByID(code,name);
		LOGGER.info(countryService.toString());
	}
	private static void deleteCountry(String code){
		LOGGER.info("start deleteCountry");
		countryService.deleteCountryByID(code);
		LOGGER.info(countryService.toString());
	}

}
