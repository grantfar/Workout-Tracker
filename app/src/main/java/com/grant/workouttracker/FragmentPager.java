package com.grant.workouttracker;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentPager extends FragmentPagerAdapter {
    private Context context;
    public FragmentPager(Context context, FragmentManager fragmentManager){
        super(fragmentManager);
        this.context = context;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Workout();
            case 1:
                return new Excercise();
            case 2:
                return new Tracking();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int pos)
    {
        switch (pos){
            case 0:
                return context.getResources().getString(R.string.workouts);
            case 1:
                return context.getResources().getString(R.string.exercises);
            case 2:
                return context.getResources().getString(R.string.tracking);
            default:
                return null;
        }
    }
}
