package com.example.CIdemo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CIdemoApplicationTests {
  static Logger logger = LoggerFactory.getLogger(CIdemoApplication.class);

	@Test
	void contextLoads() {
    logger.info("This is a test file");
	}

}
