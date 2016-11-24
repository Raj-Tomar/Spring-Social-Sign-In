package com.raj.social.registry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionSignUp;
import org.springframework.social.connect.UserProfile;

import com.raj.social.dto.LocalUser;
import com.raj.social.dto.SocialProvider;
import com.raj.social.dto.UserRegistrationForm;
import com.raj.social.service.UserService;
import com.raj.social.util.SecurityUtil;


/**
 * If no local user associated with the given connection then
 * connection signup will create a new local user from the given connection.
 *
 */
public class AppConnectionSignUp implements ConnectionSignUp {

    @Autowired
    private UserService userService;

    @Override
    public String execute(final Connection<?> connection) {
        UserRegistrationForm userDetails = toUserRegistrationObject(connection.getKey().getProviderUserId(), SecurityUtil.toSocialProvider(connection.getKey().getProviderId()), connection.fetchUserProfile());
        LocalUser user = (LocalUser) userService.registerNewUser(userDetails);
        return user.getUserId();
    }

    private UserRegistrationForm toUserRegistrationObject(final String userId, final SocialProvider socialProvider, final UserProfile userProfile) {
        return UserRegistrationForm.getBuilder()
                .addUserId(userId)
                .addFirstName(userProfile.getName())
                .addEmail(userProfile.getEmail())
                .addPassword(userProfile.getName())
                .addSocialProvider(socialProvider).build();
    }

}
