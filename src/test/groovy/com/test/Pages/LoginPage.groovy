package com.test.Pages

import geb.Page

/**
 * Created with IntelliJ IDEA.
 * User: vjeyar
 * Date: 2/12/15
 * Time: 11:41 AM
 * To change this template use File | Settings | File Templates.
 */
class LoginPage extends Page{

    static url = "/"

    static at = {
        waitFor {
            emailId.displayed
            password.displayed
        }
    }

    static content = {
        emailId {$("#Email")}
        password {$("#Passwd")}
        btnSignIn {$("#signIn")}
    }
}
