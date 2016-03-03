package org.gradle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogTest {
	private static Logger logger = LogManager.getLogger(LogTest.class.getName());

	public static void main(String[] args) {
			logger.warn("沒有個人資料!");
			logger.warn("測試Logstash");
			logger.info("No: row");
	}
}
