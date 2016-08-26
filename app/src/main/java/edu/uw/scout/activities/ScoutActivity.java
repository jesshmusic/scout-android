package edu.uw.scout.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import com.basecamp.turbolinks.TurbolinksAdapter;

import edu.uw.scout.utils.UserPreferences;

/**
 * Created by ezturner on 8/26/16.
 */
public class ScoutActivity extends AppCompatActivity implements TurbolinksAdapter{

    /**
     * The key used for retrieval and storing of turbolinks URLs in Intents
     */
    public static final String INTENT_URL_KEY = "__intent_url_key__";

    protected UserPreferences userPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        userPreferences = UserPreferences.getInstance();
    }

    @Override
    public void onPageFinished() {

    }

    @Override
    public void onReceivedError(int errorCode) {

    }

    @Override
    public void pageInvalidated() {

    }

    @Override
    public void requestFailedWithStatusCode(int statusCode) {

    }

    @Override
    public void visitCompleted() {

    }

    @Override
    public void visitProposedToLocationWithAction(String location, String action) {

    }

}
