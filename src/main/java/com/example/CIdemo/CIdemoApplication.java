package com.example.CIdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CIdemoApplication {

  static Logger logger = LoggerFactory.getLogger(CIdemoApplication.class);

    public static void main(String[] args) {
        logger.info("---------------Starting CIdemo-------------------");
        SpringApplication.run(CIdemoApplication.class, args);
        System.out.println("--------------------------------Hello---------------------------------");
    }

}
