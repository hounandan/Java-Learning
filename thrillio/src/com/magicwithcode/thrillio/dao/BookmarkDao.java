package com.magicwithcode.thrillio.dao;

import com.magicwithcode.thrillio.DataStore;
import com.magicwithcode.thrillio.entities.Bookmark;
import com.magicwithcode.thrillio.entities.UserBookMark;

public class BookmarkDao {

    public Bookmark[][] getBookmarks(){
        return DataStore.getBookmarks();
    }

    public void saveUserBookmark(UserBookMark userBookMark) {

        DataStore.add(userBookMark);

    }
}
