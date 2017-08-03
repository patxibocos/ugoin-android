package com.patxi.ugoin

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class BaseFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        injectDependencies()
        return inflater!!.inflate(getLayout(), container, false)
    }

    abstract fun injectDependencies()

    @LayoutRes abstract fun getLayout(): Int

}