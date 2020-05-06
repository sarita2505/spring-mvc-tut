package com.spring.model;

import java.beans.PropertyEditorSupport;

public class UserNamePropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String username) throws IllegalArgumentException {
        if(username.contains("mr.")||username.contains("ms.")) {
        setValue(username);
        }
        else {
            username="mr."+username;
            setValue(username);
        }
    }
}
