package com.github.kosher9.lastoptus.camera

import android.support.v4.app.FragmentActivity
import android.widget.Toast

fun FragmentActivity.showToast(text: String) {
    runOnUiThread { Toast.makeText(this, text, Toast.LENGTH_SHORT).show() }
}