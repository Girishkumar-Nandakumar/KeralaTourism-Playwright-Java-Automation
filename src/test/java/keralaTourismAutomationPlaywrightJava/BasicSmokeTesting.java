package keralaTourismAutomationPlaywrightJava;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class BasicSmokeTesting extends Base{
		
		@Test
	public void HomePageValidation() {
		
			System.out.println("Navigating to: " + BASE_URL + "index.html");
		page.navigate(BASE_URL + "index.html");
		
			assertThat(page).hasURL(BASE_URL + "index.html");
		System.out.println("✅ URL validation of home page passed!");	
		
			assertThat(page).hasTitle("Kerala Tourism");
		System.out.println("✅ Title validation of home page passed!");
		
			assertThat(page.locator("//img[@src='img/kerala-tourism-title.png']")).isVisible();
		System.out.println("✅ Logo is visible!");
		
			assertThat(page.locator("//nav[@class='navbar navbar-expand-lg']")).isVisible();
		System.out.println("✅ Navigation bar is visible!");
		
		System.out.println("🎉 Home page smoke test completed successfully!");
	}

		  @Test(priority = 2, groups = {"Smoke"})
	public void basicNavigationThroughMainMenu() {
			  
			page.navigate(BASE_URL + "index.html");
			page.waitForLoadState();
			
			page.locator("nav.navbar a[href='index.html']").click();
			assertThat(page).hasTitle("Kerala");
			System.out.println("✅ Home navigation validated!");

			page.waitForLoadState();

			
		    page.locator("nav.navbar a[href='about.html']").click();
		    assertThat(page.locator("h1")).containsText("At a glance");
		    System.out.println("✅ Explore navigation validated!");
		    
		    page.waitForLoadState();
		    
		    page.locator("nav.navbar a[href='login.html']").click();
		    assertThat(page.locator("h1")).containsText("Login");
		    System.out.println("✅ Login page navigation validated!");

		    page.waitForLoadState();

		    
		    page.locator("nav.navbar a[href='signup.html']").click();
		    assertThat(page.locator("h1")).containsText("Sign up");
		    System.out.println("✅ Sign up page navigation validated!");
		        
		System.out.println("🎉 Navigation Bar completed successfully!");
			  
		  }
		  
    @Test(priority = 3, groups = {"Smoke"})
	public void validatingExplorePage() {
		  page.navigate(BASE_URL + "about.html");
		  
			 assertThat(page).hasTitle("At a glance");
			 System.out.println("✅ Title validation of Explore page passed!");
			 assertThat(page).hasURL(BASE_URL + "about.html");
			 System.out.println("✅ URL validation of Explore page passed!");
		
			 page.locator("//a[text()='Places To Visit']").click();
			 
			 assertThat(page).hasTitle("Districts");
			 System.out.println("✅ Title validation of Districts page passed!");
			 assertThat(page).hasURL(BASE_URL + "districts.html");
			 System.out.println("✅ URL validation of Districts page passed!");
    }
    
    @DataProvider(name = "districtPages")
    public Object[][] getDistrictPages() {
        return new Object[][] {
            {"palakkad.html", "palakkad"},
            {"thrissur.html", "Thrissur"},
            {"malappuram.html", "malappuram"},
            {"trivandrum.html", "Trivandrum"},
            {"kollam.html", "kollam"},
            {"kozhikode.html", "kozhikode"},
            {"pathanamthitta.html", "Pathanamthitta"},
            {"wayanad.html", "wayanad"},
            {"alappuzha.html", "alappuzha"},
            {"kannur.html", "Kannur"},
            {"kottayam.html", "kottayam"},
            {"iduki.html", "Iduki"}, 
            {"ernakulam.html", "ernakulam"},
            {"kasargod.html", "Kasargod"}
        };
    }
    
    @Test(dataProvider = "districtPages", groups = {"Smoke"}, priority = 4)
    public void validateIndividualDistrictPages(String path, String ExpectedTitle) {
    	page.navigate(BASE_URL + path);
    	assertThat(page).hasTitle(ExpectedTitle);
    	System.out.println("✅ Title validation for " + ExpectedTitle + " page passed!");
    }
    
    @Test(priority = 5, groups = {"Smoke"})
    public void validatingLoginPage() {
        page.navigate(BASE_URL + "login.html");
        assertThat(page).hasTitle("Login");
        System.out.println("✅ Login page title validation passed!");
    }

    @Test(priority = 5, groups = {"Smoke"})
    public void validatingSignupPage() {
        page.navigate( BASE_URL + "signup.html");
        assertThat(page).hasURL(BASE_URL + "signup.html");
        System.out.println("✅ Signup page title validation passed!");
    }
}
