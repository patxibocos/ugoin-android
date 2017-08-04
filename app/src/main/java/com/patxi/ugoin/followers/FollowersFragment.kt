package com.patxi.ugoin.followers

import com.patxi.ugoin.BaseFragment
import com.patxi.ugoin.R
import javax.inject.Inject

class FollowersFragment : BaseFragment(), FollowersContract.View {

    @Inject override lateinit var presenter: FollowersContract.Presenter

    override fun injectDependencies() {

    }

    override fun getLayout() = R.layout.followers

}