package com.RRS.Utilities;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.commons.lang3.RandomUtils;

public class RndGenerators {
	public static Logger log = LogManager.getLogger(RndGenerators.class);
	
	public String RndEmail() {
		String RndEmailName=RandomStringUtils.randomAlphabetic(8);
		String RndFullEmail=RndEmailName+"@gmail.com";
		log.info("Random Generated Email is: "+RndFullEmail);
		return RndFullEmail;
	}
	
	public String RndString(int Count) {
		String RndString=RandomStringUtils.randomAlphabetic(Count);
		log.info("Random Generated String is: "+RndString);
		return RndString;
	}
	
	public int RndInteger(int MinNumber, int MaxNumber) {
		int RndInt=RandomUtils.nextInt(MinNumber, MaxNumber);
		log.info("Random Generated Integer with given range is: "+RndInt);
		return RndInt;
	}

}
