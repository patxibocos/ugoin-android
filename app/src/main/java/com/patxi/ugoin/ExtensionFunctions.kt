package com.patxi.ugoin

import android.app.Activity
import android.app.Fragment
import android.app.FragmentTransaction
import android.content.Intent
import android.content.SharedPreferences
import android.support.design.widget.Snackbar
import android.view.View

inline fun SharedPreferences.edit(func: SharedPreferences.Editor.() -> Unit) {
    val editor = edit()
    editor.func()
    editor.apply()
}

fun SharedPreferences.Editor.set(pair: Pair<String, String>) = putString(pair.first, pair.second)

inline fun android.app.FragmentManager.inTransaction(func: FragmentTransaction.() -> Unit) {
    val fragmentTransaction = beginTransaction()
    fragmentTransaction.func()
    fragmentTransaction.commit()
}

fun Activity.addFragment(fragment: Fragment, frameId: Int, addToBackStack: Boolean = true) {
    fragmentManager.inTransaction {
        add(frameId, fragment)
        if (addToBackStack) {
            addToBackStack(null)
        }
    }
}


fun Activity.replaceFragment(fragment: Fragment, frameId: Int) {
    fragmentManager.inTransaction { replace(frameId, fragment) }
}

inline fun <reified T : Activity> Activity.startActivity(clearCurrent: Boolean = false) {
    val intent = Intent(this, T::class.java)
    if (clearCurrent) {
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
    }
    startActivity(intent)
}

inline fun View.snack(message: String, length: Int = Snackbar.LENGTH_LONG, f: Snackbar.() -> Unit) {
    val snack = Snackbar.make(this, message, length)
    snack.f()
    snack.show()
}