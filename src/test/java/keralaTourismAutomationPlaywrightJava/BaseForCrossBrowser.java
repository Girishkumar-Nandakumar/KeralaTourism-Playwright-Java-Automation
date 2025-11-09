package keralaTourismAutomationPlaywrightJava;

import org.testng.annotations.*;
import com.microsoft.playwright.*;

public class BaseForCrossBrowser {

	    protected static Playwright playwright;
	    protected static Browser browser;
	    protected static BrowserContext context;
	    protected static Page page;

	    protected static final String BASE_URL = "https://hashirakb.github.io/Kerala-Tourism-Website/";

	    @Parameters({"browser"})
	    @BeforeClass(alwaysRun = true)
	    public void setUp(@Optional("chromium") String browserName) {
	        System.out.println("\n🚀 Launching test in browser: " + browserName.toUpperCase());

	        playwright = Playwright.create();

	        BrowserType.LaunchOptions launchOptions = new BrowserType.LaunchOptions().setHeadless(false);

	        switch (browserName.toLowerCase()) {
	            case "firefox":
	                browser = playwright.firefox().launch(launchOptions);
	                break;
	            case "webkit":
	                browser = playwright.webkit().launch(launchOptions);
	                break;
	            default:
	                browser = playwright.chromium().launch(launchOptions);
	                break;
	        }

	        context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1920, 1080));
	        page = context.newPage();
	        page.navigate(BASE_URL + "index.html");
	    }

	    @AfterClass(alwaysRun = true)
	    public void tearDown() {
	        System.out.println("🧹 Closing browser and cleaning up...");
	        if (context != null) context.close();
	        if (browser != null) browser.close();
	        if (playwright != null) playwright.close();
	    }
	}
