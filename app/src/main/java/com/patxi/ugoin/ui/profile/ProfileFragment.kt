package com.patxi.ugoin.ui.profile

import android.os.Bundle
import android.preference.PreferenceFragment
import com.patxi.ugoin.R
import javax.inject.Inject

class ProfileFragment : PreferenceFragment(), ProfileContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addPreferencesFromResource(R.xml.preferences)
    }

    @Inject override lateinit var presenter: ProfileContract.Presenter

}