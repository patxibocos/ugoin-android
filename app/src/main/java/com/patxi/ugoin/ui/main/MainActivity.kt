package com.patxi.ugoin.ui.main

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.patxi.ugoin.App
import com.patxi.ugoin.FragmentStateManager
import com.patxi.ugoin.R
import com.patxi.ugoin.di.components.DaggerAppComponent
import com.patxi.ugoin.di.components.DaggerMainComponent
import com.patxi.ugoin.di.modules.MainModule
import com.patxi.ugoin.di.modules.NetModule
import com.patxi.ugoin.ui.profile.ProfileFragment
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Retrofit
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainContract.View {

    @Inject override lateinit var presenter: MainContract.Presenter
    @Inject lateinit var retrofit: Retrofit

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_session -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_activity -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_followers -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_profile -> {
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val appComponent = DaggerAppComponent.builder().netModule(NetModule("http://www.google.es")).build()
        appComponent.inject(this)
        DaggerMainComponent.builder().mainModule(MainModule(this)).appComponent(appComponent).build().inject(this)
        //(application as App).component.inject(this)
        val fragmentStateManager = object : FragmentStateManager(content, supportFragmentManager) {
            override fun getItem(position: Int): Fragment {
                return ProfileFragment()
            }
        }
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

    }
}