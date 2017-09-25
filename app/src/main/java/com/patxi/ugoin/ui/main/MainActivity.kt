package com.patxi.ugoin.ui.main

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import com.patxi.ugoin.R
import com.patxi.ugoin.di.components.DaggerMainComponent
import com.patxi.ugoin.di.modules.MainModule
import com.patxi.ugoin.ui.BaseActivity
import com.patxi.ugoin.ui.app
import kotlinx.android.synthetic.main.main.*
import javax.inject.Inject

class MainActivity : BaseActivity(), MainContract.View {

    @Inject override lateinit var presenter: MainContract.Presenter

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
        setContentView(R.layout.main)
        DaggerMainComponent.builder().appComponent(app.component).mainModule(MainModule(this)).build().inject(this)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
