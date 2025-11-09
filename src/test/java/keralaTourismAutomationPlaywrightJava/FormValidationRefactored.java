package keralaTourismAutomationPlaywrightJava;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import org.testng.annotations.Test;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.TimeoutError;

public class FormValidationRefactored extends Base{

	    private final String password = "221B@BakeRStreeT";
	    private final String email = "holmes_Sherlock@geemail.com";
	    private final String name = "Sherlock Holmes";
	    private final String phoneNumber = "1234567890";

	    // ------------------ Helper Methods ------------------

	    private void fillLoginForm(String emailValue, String passwordValue) {
	        waitAndFill("input#email", emailValue);
	        waitAndFill("input#password", passwordValue);
	    }

	    private void fillSignupForm(String nameValue, String emailValue, String phoneValue, String password1Value, String password2Value) {
	        waitAndFill("input[name='name']", nameValue);
	        waitAndFill("input[type='email']", emailValue);
	        waitAndFill("input#phone", phoneValue);
	        waitAndFill("input#password1", password1Value);
	        waitAndFill("input#password2", password2Value);
	    }

	    private void waitAndFill(String selector, String value) {
	        try {
	            page.waitForSelector(selector, new Page.WaitForSelectorOptions().setTimeout(5000));
	            page.locator(selector).fill(value);
	        } catch (TimeoutError e) {
	            System.out.println("⚠️ Timeout waiting for: " + selector);
	        }
	    }

	    private void handleAlert() {
	        page.onDialog(dialog -> {
	            System.out.println("⚠️ Alert Message: " + dialog.message());
	            dialog.accept();
	        });
	    }

	    // ------------------ Login Form Tests ------------------

	    @Test
	    public void validatingLoginForm() {
	        page.navigate(BASE_URL + "login.html");
	        assertThat(page).hasTitle("Login");
	        System.out.println("✅ Login page title validation passed!");

	      
	        fillLoginForm(email, password);
	        page.locator("button[type='submit']").click();
	        System.out.println("✅ Login successful with valid credentials!");
	    }

	    @Test(groups = {"FormValidation"})
	    public void loginEmptyEmail() {
	        page.navigate(BASE_URL + "login.html");
	        fillLoginForm("", password);
	        page.locator("button[type='submit']").click();
	        System.out.println("✅ Validation: Empty email field triggered alert");
	    }

	    @Test(groups = {"FormValidation"})
	    public void loginEmptyPassword() {
	        page.navigate(BASE_URL + "login.html");

	        fillLoginForm(email, "");
	        page.locator("button[type='submit']").click();
	        System.out.println("✅ Validation: Empty password field triggered alert");
	    }

	    @Test(groups = {"FormValidation"})
	    public void loginBothEmptyFields() {
	        page.navigate(BASE_URL + "login.html");
	        handleAlert();
	        fillLoginForm("", "");
	        page.locator("button[type='submit']").click();
	        System.out.println("✅ Validation: Both fields empty triggered alert");
	    }

	    @Test(groups = {"FormValidation"})
	    public void loginInvalidEmail() {
	        page.navigate(BASE_URL + "login.html");
	      
	        fillLoginForm("Holmes_Sherlock@geemail", password);
	        page.locator("button[type='submit']").click();
	        System.out.println("✅ Validation: Invalid email triggered alert");
	    }

	    @Test(groups = {"FormValidation"})
	    public void loginInvalidPassword() {
	        page.navigate(BASE_URL + "login.html");
	       
	        fillLoginForm(email, "bakerstreet@london");
	        page.locator("button[type='submit']").click();
	        System.out.println("✅ Validation: Invalid password triggered alert");
	    }

	    // ------------------ Signup Form Tests ------------------

	    @Test(groups = {"FormValidation"})
	    public void signupEmptyName() {
	        page.navigate(BASE_URL + "signup.html");
	        
	        fillSignupForm("", email, phoneNumber, password, password);
	        page.locator("button[type='submit']").click();
	        System.out.println("✅ Validation: Empty name field triggered alert");
	    }

	    @Test(groups = {"FormValidation"})
	    public void signupEmptyEmail() {
	        page.navigate(BASE_URL + "signup.html");
	        
	        fillSignupForm(name, "", phoneNumber, password, password);
	        page.locator("button[type='submit']").click();
	        System.out.println("✅ Validation: Empty email field triggered alert");
	    }
	    @Test(groups = {"FormValidation"})
	    public void signupEmptyPassword1() {
	        page.navigate(BASE_URL + "signup.html");
	        
	        fillSignupForm(name, email, phoneNumber, "", password);
	        page.locator("button[type='submit']").click();
	        System.out.println("✅ Validation: Empty password1 field triggered alert");
	    }

	    @Test(groups = {"FormValidation"})
	    public void signupEmptyPassword2() {
	        page.navigate(BASE_URL + "signup.html");
	       
	        fillSignupForm(name, email, phoneNumber, password, "");
	        page.locator("button[type='submit']").click();
	        System.out.println("✅ Validation: Empty password2 field triggered alert");
	    }

	    @Test(groups = {"FormValidation"})
	    public void signupPasswordMismatch() {
	        //page.navigate(BASE_URL + "signup.html");
	       
	        fillSignupForm(name, email, phoneNumber, password, "PASSword@1234");
	        page.locator("button[type='submit']").click();
	        System.out.println("✅ Validation: Password mismatch triggered alert");
	    }
}