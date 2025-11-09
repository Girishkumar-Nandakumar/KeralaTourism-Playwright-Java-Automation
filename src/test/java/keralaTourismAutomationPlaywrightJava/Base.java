package keralaTourismAutomationPlaywrightJava;
import com.microsoft.playwright.*;
import org.testng.annotations.*;


public class Base {
	    protected Playwright playwright;
	    protected Browser browser;
	    protected Page page;
	    protected String BASE_URL = "https://hashirakb.github.io/Kerala-Tourism-Website/";
	    
	    @BeforeClass
	    public void setup() {
	        playwright = Playwright.create();
	        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	        page = browser.newPage();
	    }

	    @AfterClass
	    public void tearDown() {
	        browser.close();
	        playwright.close();
	    }
	}