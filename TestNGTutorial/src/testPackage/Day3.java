package testPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {

	@BeforeSuite
	public void firstCenturion()
	{
		System.out.println("First man standing");
	}
	
	@BeforeMethod
	public void beforeEveryMethod()
	{
		System.out.println("Entering gates...");
	}
	
	@BeforeClass
	public void beforeEveryClass()
	{
		System.out.println("Entered gates...");
	}
	
	@Test
	public void webLoginCarLoan1()
	{
		System.out.println("Welcome to Hispania");
	}
	
	@Test
	public void webLoginCarLoan2()
	{
		System.out.println("Welcome to Spain");
	}
	
	@Test
	public void webLoginCarLoan3()
	{
		System.out.println("Welcome to Argentina");
	}
	
	@Parameters({"URL"})
	@Test
	public void mobileSigninCarLoan(String urlName)
	{
		System.out.println("Welcome to Carthage");
		System.out.println(urlName);
	}
	
	@Test(dataProvider="getData")
	public void mobileSignoutCarLoan(String userName, String password)
	{
		System.out.println("Welcome to Carthage");
		System.out.println(userName + " " + password);
	}
	
	@Test
	public void mobileLoginCarLoan()
	{
		System.out.println("Welcome to Carthage");
	}
	
	@Test(dependsOnMethods= {"webLoginCarLoan", "mobileSignoutCarLoan"})
	public void loginAPICarLoan()
	{
		System.out.println("Welcome to Macedonia");
	}
	
	@AfterClass
	public void afterEveryClass()
	{
		System.out.println("Left gates...");
	}
	
	//User name and password combinations for 3 users
	@DataProvider
	public Object[][] getData()
	{
		//Number of data sets are rows and each combination in a set are columns
		Object[][] data=new Object[3][2];
		//1st set
		data[0][0]="Viking1";
		data[0][1]="eagle1";
		
		//2nd set
		data[1][0]="Viking2";
		data[1][1]="eagle2";
				
		//3rd set
		data[2][0]="Viking3";
		data[2][1]="eagle3";
		
		return data;
	}
}
