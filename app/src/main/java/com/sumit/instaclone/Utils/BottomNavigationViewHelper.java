package com.sumit.instaclone.Utils;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.sumit.instaclone.AddPost.AddPostActivity;
import com.sumit.instaclone.Home.HomeActivity;
import com.sumit.instaclone.Notification.NotificationActivity;
import com.sumit.instaclone.Profile.ProfileActivity;
import com.sumit.instaclone.R;
import com.sumit.instaclone.Search.SearchActivity;

public class BottomNavigationViewHelper {

    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationView(BottomNavigationView bottomNavigationView) {
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");

    }

    public static void enableNavigation(final Context context, BottomNavigationView view) {
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.ic_house:
                        Intent intent1 = new Intent(context, HomeActivity.class).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);//ACTIVITY_NUM = 0
                        context.startActivity(intent1);
                        break;

                    case R.id.ic_search:
                        Intent intent2 = new Intent(context, SearchActivity.class).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);//ACTIVITY_NUM = 1
                        context.startActivity(intent2);
                        break;

                    case R.id.ic_circle:
                        Intent intent3 = new Intent(context, AddPostActivity.class).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);//ACTIVITY_NUM = 2
                        context.startActivity(intent3);
                        break;

                    case R.id.ic_alert:
                        Intent intent4 = new Intent(context, NotificationActivity.class).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);//ACTIVITY_NUM = 3
                        context.startActivity(intent4);
                        break;

                    case R.id.ic_android:
                        Intent intent5 = new Intent(context, ProfileActivity.class).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);//ACTIVITY_NUM = 4
                        context.startActivity(intent5);
                        break;
                }


                return false;
            }
        });

    }
}
