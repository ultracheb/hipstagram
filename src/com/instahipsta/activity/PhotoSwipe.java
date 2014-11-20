package com.instahipsta.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import com.instahipsta.R;
import com.instahipsta.fragment.PagerAdapter;

/**
 * @author Vladislove
 * @since 16.11.2014
 */
public class PhotoSwipe extends FragmentActivity{

    PagerAdapter mPagerAdapter;
    ViewPager mViewPager;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo_swipe_layout);
        init();
    }

    private void init(){
        mPagerAdapter = new PagerAdapter(getSupportFragmentManager(), 3);
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mPagerAdapter);
    }

}
