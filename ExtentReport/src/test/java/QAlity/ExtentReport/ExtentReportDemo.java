//package QAlity.ExtentReport;
//
//import org.checkerframework.common.reflection.qual.NewInstance;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//
//public class ExtentReportDemo {
//	
//	ExtentReports extentReports;
//	
//	@BeforeTest
//	public void config() {
//		
//		//("user.dir")+"\\reports\\index.html"
//		
//		String path = System.getProperty("user.dir") + "ExtentReport/reports/index.html";
//		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
//		reporter.config().setReportName("Web Automation Report");
//		reporter.config().setDocumentTitle("Test Result");
//		
//		extentReports = new ExtentReports();
//		extentReports.attachReporter(reporter);
//		extentReports.setSystemInfo("Tester" , "Abdrahamane Keita");
//	}
//	
//	
//	@Test
//	public void initialDemo() {
//		
//		extentReports.createTest("Initial Demo");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/");
//		System.out.println(driver.getTitle());
//		extentReports.flush();
//		
//		//driver.close();
//	}
//
//}
