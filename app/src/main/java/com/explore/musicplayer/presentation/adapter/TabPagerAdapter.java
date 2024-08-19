package com.explore.musicplayer.presentation.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.explore.musicplayer.presentation.view.fragments.BrowseFragment;
import com.explore.musicplayer.presentation.view.fragments.PlayingFragment;

public class TabPagerAdapter extends FragmentStateAdapter {
    public TabPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                return BrowseFragment.newInstance();
            case 0:
            default:
                return PlayingFragment.newInstance();
        }

    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
