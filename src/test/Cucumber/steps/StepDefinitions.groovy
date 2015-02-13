import com.test.Pages.LoginPage
import cucumber.api.groovy.EN
import geb.Browser


EN.Given (~/Navigate to Login Page./){ ->
    theBrowser = new Browser()
    theBrowser.to LoginPage

}

EN.When(~/provide valid Username and Password./){ ->

    emailId << "vicky.008@gmail.com"
    password << "sample"
    btnSignIn.click()
}

EN.Then(~/Validate the user is logged in./){ ->
    println("Hi You logged in.")
}