package com.patxi.ugoin.ui.profile

import android.os.Bundle
import android.support.v7.preference.PreferenceFragmentCompat
import com.patxi.ugoin.R
import javax.inject.Inject

class ProfileFragment : PreferenceFragmentCompat(), ProfileContract.View {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.preferences);
    }

    @Inject override lateinit var presenter: ProfileContract.Presenter

}