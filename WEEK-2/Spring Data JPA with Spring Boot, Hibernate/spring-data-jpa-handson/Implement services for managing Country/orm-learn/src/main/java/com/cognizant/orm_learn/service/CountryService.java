package com.cognizant.orm_learn.service;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    @Transactional
    public void updateCountryByID(String id,String name){
        Optional<Country> country = countryRepository.findById(id);
        country.ifPresent(value -> value.setName(name));
    }

    public Optional<Country> findByID(String id){
        Optional<Country> country = countryRepository.findById(id);
        return country;
    }

    @Transactional
    public void deleteCountryByID(String id){
        countryRepository.deleteById(id);
    }

}
