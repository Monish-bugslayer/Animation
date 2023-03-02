package com.example.animation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.commit
import kotlinx.android.synthetic.main.*
import kotlinx.android.synthetic.main.fragment_disply.*


class DisplayFragment : Fragment() {
    private val termsAndConditions: TermsAndConditions= TermsAndConditions()
    private val homeFragment:Home=Home()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_disply, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        return_to_home.setOnClickListener {
            fragmentManager?.commit {
                setCustomAnimations(
                    androidx.transition.R.anim.abc_slide_in_bottom, androidx.transition.R.anim.abc_slide_in_bottom)
                replace(R.id.fragment_container_view,homeFragment)
                addToBackStack(null)
            }
        }

        //go to terms and conditions
        to_terms_and_condition.setOnClickListener {
            fragmentManager?.commit {
                setCustomAnimations(androidx.transition.R.anim.abc_slide_in_bottom, androidx.transition.R.anim.abc_slide_in_bottom)
                replace(R.id.fragment_container_view,termsAndConditions)
                addToBackStack(null)
            }
        }


    }
    override fun onDestroyView() {
        println("display fragment Destroyed view 1 ")
        super.onDestroyView()


    }

    override fun onResume() {
        println(" display fragment Resumed ")
        super.onResume()
    }
    //1
    override fun onAttach(context: Context) {
        println("display fragment Attach 1")
        super.onAttach(context)
    }

    override fun onDestroy() {
        println("display fragment destroy 1")
        super.onDestroy()
    }

    override fun onDetach() {
        println("display fragment Detach 1")
        super.onDetach()
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        println("display fragment OnViewStateRestored 1")
    }

    override fun onStop() {
        super.onStop()
        println("display fragment OnStop ")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        println("display fragment SavedInstanceState 1")
    }

    override fun onStart() {
        super.onStart()
        println("display fragment Fragment 1 started")
    }

}