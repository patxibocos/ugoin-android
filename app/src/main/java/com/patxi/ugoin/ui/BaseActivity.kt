package com.patxi.ugoin.ui

import android.app.Activity
import com.patxi.ugoin.App

abstract class BaseActivity : Activity()

val BaseActivity.app: App get() = application as App