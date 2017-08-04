package com.patxi.ugoin

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import com.patxi.ugoin.activity.ActivityFragment
import com.patxi.ugoin.followers.FollowersFragment
import com.patxi.ugoin.profile.ProfileFragment
import com.patxi.ugoin.session.SessionFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_session -> {
                viewPager.setCurrentItem(0, false)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_activity -> {
                viewPager.setCurrentItem(1, false)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_followers -> {
                viewPager.setCurrentItem(2, false)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_profile -> {
                viewPager.setCurrentItem(3, false)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (application as App).component.inject(this)
        setContentView(R.layout.activity_main)
        viewPager.setOnTouchListener({ _, _ ->
            true
        })
        val viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewPagerAdapter.addFragment(SessionFragment())
        viewPagerAdapter.addFragment(ActivityFragment())
        viewPagerAdapter.addFragment(FollowersFragment())
        viewPagerAdapter.addFragment(ProfileFragment())
        viewPager.adapter = viewPagerAdapter
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

    }
}
