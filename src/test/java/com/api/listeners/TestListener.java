package com.api.listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.config.Loggers;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.apache.logging.log4j.*;

public class TestListener implements ITestListener {
	
	private static final Logger logger= LogManager.getLogger(TestListener.class);

	public void onTestStart(ITestResult result) {
		logger.info("Started!!!"+result.getMethod().getMethodName());
		
	}

	public void onTestFailure(ITestResult result) {
		
		logger.error("Failed!!!"+result.getMethod().getDescription());
	}

	public void onTestSuccess(ITestResult result) {
		logger.info("Passed!!"+result.getMethod().getMethodName());
		}

	public void onTestSkipped(ITestResult result) {
		logger.info("Skipped!!!"+result.getMethod().getMethodName());
	}

	public void onFinish(ITestContext context) {
		logger.info("Test Suite Completed");	}

}
