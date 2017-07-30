package com.patxi.ugoin.session

import android.support.v4.app.Fragment

class SessionFragment : Fragment(), SessionContract.View {

    override var presenter: SessionContract.Presenter? = null

    override fun toggleToRecording() {

    }
    
}