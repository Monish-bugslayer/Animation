package com.example.animation

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import com.example.animation.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.*
import kotlinx.android.synthetic.main.fragment_home.*


class Home : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        animate_button.setOnClickListener {
            fragmentManager?.commit {
                replace(R.id.fragment_container_view,DisplayFragment())
                addToBackStack(null)
            }
        }
    }
    override fun onDestroyView() {
        println(" home Destroyed view  ")
        super.onDestroyView()


    }

    override fun onResume() {
        println(" home Resumed ")
        super.onResume()
    }
    //1
    override fun onAttach(context: Context) {
        println("home Attach ")
        super.onAttach(context)
    }

    override fun onDestroy() {
        println("home destroy ")
        super.onDestroy()
    }

    override fun onDetach() {
        println("home Detach ")
        super.onDetach()
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        println("home OnViewStateRestored ")
    }

    override fun onStop() {
        super.onStop()
        println("home OnStop ")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        println("home SavedInstanceState ")
    }

    override fun onStart() {
        super.onStart()
        println("home Fragment  started")
    }


}