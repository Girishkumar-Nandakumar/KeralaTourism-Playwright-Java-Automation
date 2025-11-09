package keralaTourismAutomationPlaywrightJava;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ResponsiveUITesting extends Base{

	    @DataProvider(name = "screenResolutions")
	    public Object[][] screenResolutions() {
	        return new Object[][]{
	            {1920, 1080, "Desktop"},
	            {1024, 768, "Tablet"},
	            {375, 667, "Mobile iPhone"},
	            {360, 800, "Mobile Android"}
	        };
	    }

	    @Test(dataProvider = "screenResolutions", groups = {"Responsive"})
	    public void verifyResponsiveLayouts(int width, int height, String deviceType) {
	        System.out.println("\n📱 Checking layout for: " + deviceType + " (" + width + "x" + height + ")");

	        try (Playwright playwright = Playwright.create()) {
	            Browser browser = playwright.chromium().launch(
	                new BrowserType.LaunchOptions().setHeadless(false)
	            );

	            BrowserContext context = browser.newContext(
	                new Browser.NewContextOptions()
	                    .setViewportSize(width, height)
	            );

	            Page page = context.newPage();
	            page.navigate(BASE_URL + "index.html");

	            assertThat(page).hasTitle("Kerala Tourism");

	            System.out.println("✅ " + deviceType + " layout loaded successfully (" + width + "x" + height + ")");
	            
	            page.screenshot(new Page.ScreenshotOptions().setPath(java.nio.file.Paths.get("screenshots/" + deviceType + ".png")));

	            browser.close();
	        }
	    }
	}
