package com.example.springsocial.security.oauth2.user;

import java.util.Map;

public class LinkedinOAuth2UserInfo extends OAuth2UserInfo {

    public LinkedinOAuth2UserInfo(Map<String, Object> attributes) {
        super(attributes);
    }

    @Override
    public String getId() {
        return attributes.get("id").toString();
    }

    @Override
    public String getName() {
        return (String) attributes.get("localizedFirstName") + (String) attributes.get("localizedLastName");
    }

    @Override
    public String getEmail() {
        return (String) attributes.get("email");
    }

    @Override
    public String getImageUrl() {
        return (String)attributes.get("profilePicture");
    }
}
