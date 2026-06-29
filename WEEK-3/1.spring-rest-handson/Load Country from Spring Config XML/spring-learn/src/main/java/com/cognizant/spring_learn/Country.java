package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {

    private static final Logger logger = LoggerFactory.getLogger(Country.class);

    private String code;
    private String name;


    public Country() {
        logger.debug("Inside Country Constructor.");
    }

    public void callCountry() {
        logger.info("Calling Country");
    }

   
    public String getName() {
        logger.debug("Inside getName()");
        return name;
    }

    public void setName(String name) {
        logger.debug("Inside setName() -> {}", name);
        this.name = name;
    }

    public String getCode() {
        logger.debug("Inside getCode()");
        return code;
    }

    public void setCode(String code) {
        logger.debug("Inside setCode() -> {}", code);
        this.code = code;
    }

    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
}