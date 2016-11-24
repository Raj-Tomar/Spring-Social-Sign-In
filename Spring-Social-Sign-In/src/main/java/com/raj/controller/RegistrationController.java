/*package com.raj.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.WebRequest;

*//**
 * @author Raj Tomar
 *//*
@Controller
@SessionAttributes("user")
public class RegistrationController {

    private static final Logger LOGGER = Logger.getLogger(RegistrationController.class);

    protected static final String ERROR_CODE_EMAIL_EXIST = "NotExist.user.email";
    protected static final String MODEL_NAME_REGISTRATION_DTO = "user";
    protected static final String VIEW_NAME_REGISTRATION_PAGE = "user/registrationForm";
    
    *//**
     * Renders the registration page.
     *//*
    @GetMapping(value = "/user/register")
    public String showRegistrationForm(WebRequest request, Model model) {
        LOGGER.debug("Rendering registration page.");

        return VIEW_NAME_REGISTRATION_PAGE;
    }
   
}
*/