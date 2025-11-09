package keralaTourismAutomationPlaywrightJava;

import org.testng.annotations.Test;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitUntilState;

public class PerformanceTestUsingPageLoadTime extends Base{
	
	    @Test
	    public void measurePageLoadTime() {
	        String[] urls = {
	            BASE_URL + "index.html",
	            BASE_URL + "about.html",
	            BASE_URL + "districts.html",
	            BASE_URL + "login.html",
	            BASE_URL + "signup.html"
	        };

	        System.out.println("\n🚀 Starting Page Load Performance Test\n");

	        for (String url : urls) {
	            System.out.println("Navigating to: " + url);

	            long start = System.currentTimeMillis();
	            page.navigate(url, new Page.NavigateOptions().setWaitUntil(WaitUntilState.LOAD));
	            long finish = System.currentTimeMillis();

	            long totalTime = finish - start;

	            // ✅ Categorize performance
	            if (totalTime < 1500) {
	                System.out.println("✅ Fast: " + totalTime + " ms\n");
	            } else if (totalTime < 3000) {
	                System.out.println("⚠️ Moderate: " + totalTime + " ms\n");
	            } else {
	                System.out.println("❌ Slow: " + totalTime + " ms\n");
	            }
	        }

	        System.out.println("🎯 Page Load Performance Test Completed!\n");
	    }	
}
