package com.patxi.ugoin.ui

import android.support.v7.app.AppCompatActivity
import com.patxi.ugoin.App

abstract class BaseActivity : AppCompatActivity()

val BaseActivity.app: App get() = application as App