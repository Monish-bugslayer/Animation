package com.example.animation

import android.widget.Button

object ButtonAction {
    internal inline fun action(actionBody:()->Button){actionBody()}
}