package com.magicwithcode.thrillio.dao;

import com.magicwithcode.thrillio.DataStore;
import com.magicwithcode.thrillio.entities.Bookmark;

public class BookmarkDao {

    public Bookmark[][] getBookmarks(){
        return DataStore.getBookmarks();
    }

}
