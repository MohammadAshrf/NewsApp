package com.example.newsapp.ui

import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface
import androidx.fragment.app.Fragment

fun Fragment.showMessage(
    message: String,
    posActionName: String? = null,
    posAction: DialogInterface.OnClickListener?=null,
    negActionName: String? = null,
    negAction: DialogInterface.OnClickListener?=null,

    ): AlertDialog {
    val dialogBuilder = AlertDialog.Builder(requireContext())
    dialogBuilder.setMessage(message)
    if (posActionName != null) {
        dialogBuilder.setPositiveButton(posActionName, posAction)
    }
    if (negActionName != null) {
        dialogBuilder.setNegativeButton(negActionName, negAction)
    }
    return dialogBuilder.show()
}

fun Activity.showMessage(
    message: String,
    posActionName: String? = null,
    posAction: DialogInterface.OnClickListener?=null,
    negActionName: String? = null,
    negAction: DialogInterface.OnClickListener?=null,

    ): AlertDialog {
    val dialogBuilder = AlertDialog.Builder(this)
    dialogBuilder.setMessage(message)
    if(posActionName!=null){
    dialogBuilder.setPositiveButton(posActionName,posAction)
    }
    if (negActionName!=null){
        dialogBuilder.setNegativeButton(negActionName,negAction)
    }
    return dialogBuilder.show()
}