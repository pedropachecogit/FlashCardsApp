package com.app.flashcards;

import android.app.Application;

import com.app.flashcards.utils.LocalStorage;
import com.app.flashcards.utils.UIUtils;

/**
 * Tripango Application Class
 * <p/>
 * Created by Pedro Pacheco on 11/16/2015.
 */
public class FlashCardsApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    /**
     * Convenience method to instantiate singleton helper classes.
     */
    private void initSingletons() {
        LocalStorage.init(this);
        UIUtils.init(this);
    }
}
