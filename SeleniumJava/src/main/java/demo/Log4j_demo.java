package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j_demo {

	private static Logger logger = LogManager.getLogger();
	
	public static void main(String[] args) {
		
		logger.trace("This is a trace message");
		logger.info("This is an information message");
		logger.error("This is an error message");
		logger.warn("This is a warning message");
		logger.fatal("This is a fatal message");
		

	}

}
