package com.magicwithcode.thrillio.managers;

import com.magicwithcode.thrillio.entities.User;

public class UserManager {

    private static UserManager userManager = null;

    private UserManager(){

    }

    public static UserManager getInstance(){
        if(null == userManager){
            return new UserManager();
        }
        return userManager;
    }

    public User createUser(long id, String email, String password,
                           String firstName, String lastName,
                           int gender, String userType){
        User user = new User();
        user.setId(id);
        user.setEmail(email);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setGender(gender);
        user.setUserType(userType);

        return user;
    }

}
