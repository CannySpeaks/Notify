package co.test.com;
import java.awt.List;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import zmq.socket.pubsub.Sub;

public class Page {
	public static void main(String[] args) {
		 
		Youtuber u1 = new Youtuber();
		User u2 = new Subscriber();
		String finalTime = "10:00:00";
		long difference ;
        Time t1 = Time.valueOf(finalTime);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
        Time t2 = Time.valueOf(dtf.format(now));

		
		ArrayList<String> video = new ArrayList();
		
		u1.setEmail("123@123.com");
		u1.setPageID("https://www.youtube.com/user/IGNentertainment/videos");
		u1.setUsername("EASports");
		u2.setEmail("234@234.com");
		System.out.println(u1.getEmail());
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samuel.Uche\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open website
		driver.get(u1.getPageID());
		 
		// Maximize browser
		driver.manage().window().maximize();
		//ArrayList <WebElement> value =  (ArrayList<WebElement>) driver.findElement(By.xpath("//ytd-grid-renderer"));
		ArrayList <String> videos = new ArrayList<>();
		/*String result = driver.findElement(By.xpath("//ytd-grid-renderer//ytd-grid-video-renderer[1]")).getText();
		String link = driver.findElement(By.xpath("//ytd-grid-renderer//ytd-grid-video-renderer[1]//a[1]")).getAttribute("href");*/
		String subcribers = driver.findElement(By.id("subscriber-count")).getText();
		System.out.println("The channel has " + subcribers);
		u1.setSubs(subcribers);
		
		/*while(t2.getTime() <= t1.getTime()) {
			String result = driver.findElement(By.xpath("//ytd-grid-renderer//ytd-grid-video-renderer[1]")).getText();
			String link = driver.findElement(By.xpath("//ytd-grid-renderer//ytd-grid-video-renderer[1]//a[1]")).getAttribute("href");
			//System.out.println(result + "\n\n" + "The href is " + link);
			if (videos.contains(link)) {
				System.out.println("Video already exists:");
			}else {
				videos.add(link);
				System.out.println("Video added to arraylist");
			}
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}*/
	}
}
