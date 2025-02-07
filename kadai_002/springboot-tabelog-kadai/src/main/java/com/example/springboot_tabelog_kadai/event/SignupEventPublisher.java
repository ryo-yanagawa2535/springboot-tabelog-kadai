package com.example.springboot_tabelog_kadai.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.example.springboot_tabelog_kadai.entity.User;

@Component
public class SignupEventPublisher {
    private final ApplicationEventPublisher applicationEventPublisher;
    
    public SignupEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;                
    }
    
    public void publishSignupEvent(User user, String requestUrl) {
        applicationEventPublisher.publishEvent(new SignupEvent(this, user, requestUrl));
    }

}
