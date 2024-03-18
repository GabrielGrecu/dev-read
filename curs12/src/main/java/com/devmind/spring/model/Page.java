package com.devmind.spring.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Page {

    private String description;

//    @Autowired
//    private Contact contact;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public Contact getContact() {
//        return contact;
//    }
//
//    public void setContact(Contact contact) {
//        this.contact = contact;
//    }
}
