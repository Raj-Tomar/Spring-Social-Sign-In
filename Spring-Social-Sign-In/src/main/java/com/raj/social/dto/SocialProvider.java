package com.raj.social.dto;

public enum SocialProvider {

    FACEBOOK("facebook"), TWITTER("twitter"), LINKEDIN("linkedin"), GOOGLE("google"), NONE("local");

    private String providerType;

    /**
     * @return
     */
    public String getProviderType() {
        return providerType;
    }

    /**
     * @param providerType
     */
    SocialProvider(final String providerType) {
        this.providerType = providerType;
    }

}
