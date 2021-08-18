package BrowserStack;
import java.util.List;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class testSelenium {
	   public void extractDataWithSelenium(String url) { 
		    System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		     
		      WebDriver driver=new ChromeDriver();
		      driver.get(url);
		      
		     try {
		      Thread.sleep(5000);
		      
		      
		      List<WebElement> details = driver.findElements(By.xpath("//div[@data-testid='post_message']"));
		      List<WebElement> id = driver.findElements(By.xpath("//a[@class='_3hg- _42ft']"));
		     
		      for(int i=0; i<id.size(); i++) {
		    	  
		    	   String text = details.get(i).getText();
		    	   String postid = id.get(i).getAttribute("href");
		    	  
		    	  System.out.println(i+1 + " Content: " + text);
		    	  System.out.println(i+1 + "Post ID: "+ postid);
			      System.out.println("\n--------------------------------------------------------------------- \n");
		     
		      }
		      
		      driver.close();
		         
		          } catch (InterruptedException e) {
		      e.printStackTrace();
		          }
}
	   public static void main(String[] args){ 
		   testSelenium test = new testSelenium(); 
		      test.extractDataWithSelenium("https://www.facebook.com/pg/bittoonfunny/posts/"); 
		     
		   } 
		}
