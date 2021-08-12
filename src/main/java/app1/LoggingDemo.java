package app1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingDemo {
	private static Logger Logger= LogManager.getLogger(LoggingDemo.class);
	public static void main(String[] args) {
		//System.out.println();//never use this
				Logger.fatal("fatal message");
				Logger.debug("this is a debug message");
				Logger.info("Info message");
				Logger.error("error message");
				Logger.trace("trace");
	}

}
