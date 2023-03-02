package com.example.animation

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import kotlinx.android.synthetic.main.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val home=Home()
//        if(savedInstanceState==null){
//            supportFragmentManager.beginTransaction().
//            add(R.id.fragment_container_view,home).commit()
//        }
    }
    override fun onStart() {
        super.onStart()
        Log.d("OnStart","Activity starts")
    }

    override fun onResume() {
        super.onResume()
        Log.d("OnResume","Activity resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.d("OnPause","Activity paused")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("OnDestroy","Activity destroy")
    }

    override fun onStop() {
        super.onStop()
        Log.d("OnStop","Activity stops")
    }

}