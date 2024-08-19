package com.explore.musicplayer.presentation.view;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;

import com.explore.musicplayer.R;
import com.explore.musicplayer.databinding.ActivityMainBinding;
import com.explore.musicplayer.presentation.adapter.TabPagerAdapter;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TabPagerAdapter tabPagerAdapter = new TabPagerAdapter(this);
        activityMainBinding.tabViewPager.setAdapter(tabPagerAdapter);

        new TabLayoutMediator(activityMainBinding.tabLayout, activityMainBinding.tabViewPager, ((tab, position) -> {
            switch (position) {
                case 0:
                    Drawable playDrawable = AppCompatResources.getDrawable(this, android.R.drawable.ic_media_play);
                    tab.setIcon(playDrawable);
                    tab.setText("Playing");
                    break;
                case 1:
                    Drawable browseDrawable = AppCompatResources.getDrawable(this, android.R.drawable.ic_menu_search);
                    tab.setIcon(browseDrawable);
                    tab.setText("Browse");
                    break;
            }
        }
        )).attach();
    }
}