package com.raj.social.registry;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.social.security.SocialAuthenticationServiceRegistry;
import org.springframework.social.security.provider.SocialAuthenticationService;

public class AppSocialAuthenticationServiceRegistry extends SocialAuthenticationServiceRegistry {

    private List<SocialAuthenticationService<?>> authenticationServices;

    public AppSocialAuthenticationServiceRegistry(final List<SocialAuthenticationService<?>> authenticationServices) {
        this.authenticationServices = authenticationServices;
    }

    @SuppressWarnings("rawtypes")
	@PostConstruct
    public void init() {
        if (authenticationServices != null) {
            for (SocialAuthenticationService authenticationService : authenticationServices) {
                super.addAuthenticationService(authenticationService);
            }
        }
    }

}
