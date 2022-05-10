package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebDriver;

//import basicpak.Student;

public class webBrowser
{
	
	
public static WebDriver openBrowser(String url)
{
	System.setProperty("webdriver.chrome.driver","D:\\Java3\\Driver_New\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	//System.setProperty("webdriver.chrome.driver", "Library//chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
	//driver.get("https://maven.apache.org/plugins/maven-compiler-plugin/examples/set-compiler-source-and-target.html");
	driver.get(url);
	driver.manage().window().maximize();
	return driver;

}
public static void verifyTitle(WebDriver driver, String exptitle)
{
	String acttitle=driver.getTitle();
	if(acttitle.equals(exptitle))
	{
		System.out.println("pass");
	}
	else
		System.out.println("Fail");

}
//public static void main(String[] args) {
////Student st= new Student(12, "f");
////Student newst=st.getStudent();
////System.out.println(newst);
//	WebDriver op = new WebDriver("");
//
//}
}
