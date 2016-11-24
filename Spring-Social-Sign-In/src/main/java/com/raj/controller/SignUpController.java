/*package com.raj.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

*//**
 * @author Raj Tomar
 *//*
@Controller
public class SignUpController {

    private static final Logger LOGGER = Logger.getLogger(SignUpController.class);

    *//**
     * Redirects request forward to the registration page. This hack is required because
     * there is no way to set the sign in url to the SocialAuthenticationFilter class.
     * Another option is to move registration page to to url '/signup' but I did not
     * want to do that because that url looks a bit ugly to me.
     * @return
     *//*
    @GetMapping(value = "/signup")
    public String redirectRequestToRegistrationPage() {
        LOGGER.debug("Redirecting request to registration page.");

        return "redirect:/user/register";
    }

}
*/