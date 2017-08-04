package com.patxi.ugoin.ui.profile

import com.patxi.ugoin.BaseFragment
import com.patxi.ugoin.R
import javax.inject.Inject

class ProfileFragment : BaseFragment(), ProfileContract.View {

    @Inject override lateinit var presenter: ProfileContract.Presenter

    override fun injectDependencies() {

    }

    override fun getLayout() = R.layout.profile

}