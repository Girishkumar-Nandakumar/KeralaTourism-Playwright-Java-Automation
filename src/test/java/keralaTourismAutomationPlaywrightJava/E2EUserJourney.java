package keralaTourismAutomationPlaywrightJava;

import org.testng.annotations.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
public class E2EUserJourney extends Base{

    private final String password = "221B@BakeRStreeT";
    private final String email = "holmes_Sherlock@geemail.com";
    private final String name = "Sherlock Holmes";
    private final String phoneNumber = "1234567890";
    

    @Test(priority = 1, groups = {"E2E"})
    public void verifyHomePageTitle() {
    	page.navigate(BASE_URL + "index.html"); 
    	assertThat(page).hasTitle("Kerala Tourism");
    	System.out.println("✅ Homepage title verified successfully!");
    }
    
    
    @Test(priority = 2, dependsOnMethods = "verifyHomePageTitle", groups = {"E2E"})
    public void performSignUp() {
    	
        page.navigate(BASE_URL + "signup.html");
        page.waitForLoadState();
        
        page.locator("//input[@name='name']").fill(name);
        page.locator("//input[@name='email']").fill(email);
        page.locator("//input[@id='phone']").fill(phoneNumber);
        page.locator("//input[@id='password1']").fill(password);
        page.locator("//input[@id='password2']").fill(password);
        page.locator("//button[@type='submit']").click();

        System.out.println("📝 Sign-up form submitted successfully!");

    }

    @Test(priority = 3, dependsOnMethods = "performSignUp", groups = {"E2E"})
    public void performLogin() {
    	
    	page.navigate(BASE_URL + "login.html");
    	page.waitForLoadState();
    	
    	page.locator("//input[@placeholder='Email']").fill(email);
    	page.locator("//input[@placeholder='Password']").fill(password);
    	page.locator("//button[@type='submit']").click();
    	
    	 System.out.println("📝 Login successfull!");
    }

    @Test(priority = 3, dependsOnMethods = "performSignUp", groups = {"E2E"})
    public void exploreDistricts() {
    	page.waitForLoadState();
        page.locator("//a[text()='read more..' and @href='palakkad.html']").click();
        assertThat(page).hasTitle("Palakkad");
        System.out.println("✅ Navigated to Palakkad page");

        page.goBack();

        page.waitForLoadState();
        page.locator("//a[text()='read more..' and @href='thrissur.html']").click();
        assertThat(page).hasTitle("Thrissur");
        System.out.println("✅ Navigated to Thrissur page");

        page.goBack();
        
        System.out.println("🌏 District navigation completed!");
    }
	
}
