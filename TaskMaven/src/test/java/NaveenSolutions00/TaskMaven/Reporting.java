package NaveenSolutions00.TaskMaven;


import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter{
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;


	@BeforeTest
	public void startreports()
	{
		htmlReporter=new ExtentSparkReporter("extentreport.html");
		reports=new ExtentReports();
		reports.attachReporter(htmlReporter);

		//add environment details 

		reports.setSystemInfo("Machine","testpc1");
		reports.setSystemInfo("OS","Windows 11");
		reports.setSystemInfo("Browser","Chrome");

		//configuration for look and feel 

		htmlReporter.config().setDocumentTitle("extent Report demo");
		htmlReporter.config().setReportName("test report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE,MMMM dd,yyyy,hh:mm a '('zzz')'");

	}
	@Test	
	public void launchBrowserandnavigatePage()
	{
		//create test
		test = reports.createTest("Browser launched and open url");
		Assert.assertTrue(true);//test passed

	}

	@Test	
	public void verifytitle()
	{
		//create test
		test = reports.createTest("verify title of the page ");
		Assert.assertTrue(true);//test passed

	}

	@Test	
	public void verfiyLogo()
	{
		//create test
		test = reports.createTest("verify logo");
		Assert.assertTrue(true);//test passed

	}

	@Test	
	public void verifyEmail()
	{
		//create test
		test = reports.createTest("verify Email ");
		throw new SkipException("skipping this test cases with exception");
	}

	@Test	
	public void verifyUsername()
	{
		//create test
		test = reports.createTest("verifyUsername");
		Assert.assertTrue(true);//test passed


	}
	@AfterMethod
	public void gettestresults(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL,MarkupHelper.createLabel(result.getName()+"fail",ExtentColor.RED ));

		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS,MarkupHelper.createLabel(result.getName()+"Pass",ExtentColor.GREEN));	
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP,MarkupHelper.createLabel(result.getName()+"skip",ExtentColor.YELLOW));	
		}
	}
	

}

