package com.magicwithcode.thrillio.controllers;

import com.magicwithcode.thrillio.entities.Bookmark;
import com.magicwithcode.thrillio.entities.User;
import com.magicwithcode.thrillio.managers.BookmarkManager;

public class BookmarkController {

    private static BookmarkController instance = null;

    private BookmarkController(){}

    public static BookmarkController getInstance(){
        if(null == instance){
            return new BookmarkController();
        }
        return instance;
    }


    public void saveUserBookmark(User user, Bookmark bookmark) {
        BookmarkManager.getInstance().saveUserBookmark(user, bookmark);
    }
}
