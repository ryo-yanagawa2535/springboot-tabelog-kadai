package com.example.springboot_tabelog_kadai.event;

import org.springframework.context.ApplicationEvent;

import com.example.springboot_tabelog_kadai.entity.User;

import lombok.Getter;

@Getter
public class SignupEvent extends ApplicationEvent {
    private User user;
    private String requestUrl;        

    public SignupEvent(Object source, User user, String requestUrl) {
        super(source); //イベントの（ソース）とはpublisherクラスのインスタンスのこと
        
        this.user = user;        
        this.requestUrl = requestUrl;
    }

}
