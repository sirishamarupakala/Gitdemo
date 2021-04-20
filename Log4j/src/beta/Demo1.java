package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.*;
public class Demo1 {
	
	
	private static Logger log=LogManager.getLogger(Demo1.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("debug");
		log.info("i am info");
		log.error("i am failure");
		log.fatal("i am fatal");
	}

}
