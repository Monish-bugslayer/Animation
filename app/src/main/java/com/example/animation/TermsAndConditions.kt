package com.example.animation

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import kotlinx.android.synthetic.main.fragment_terms_and_conditions.*


class TermsAndConditions : Fragment() {
    private val home:Home=Home()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_terms_and_conditions, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        aggrement_to_home_fragment.setOnClickListener {
            fragmentManager?.commit {
                setCustomAnimations(com.airbnb.lottie.R.anim.abc_popup_enter, com.airbnb.lottie.R.anim.abc_popup_exit)
                replace(R.id.fragment_container_view,home)
                /* while add the below process occur when we hit back button
                Terms and Conditions OnStop
I/System.out: home OnViewStateRestored
I/System.out: home Fragment  started
I/System.out: display fragment OnViewStateRestored 1
I/System.out: display fragment Fragment 1 started
I/System.out:  Terms and Conditions Destroyed view
I/System.out: Terms and Conditions destroy
I/System.out: Terms and Conditions Detach
I/System.out:  home Resumed
I/System.out:  display fragment Resumed */
                //while pressing during add function both the fragment will be starting but in replace function
                //only the necessary fragment will be started
                addToBackStack(null)
            }
        }
    }
    override fun onDestroyView() {
        println(" Terms and Conditions Destroyed view  ")
        super.onDestroyView()


    }

    override fun onResume() {
        println(" Terms and Conditions Resumed ")
        super.onResume()
    }
    //1
    override fun onAttach(context: Context) {
        println("Terms and Conditions Attach ")
        super.onAttach(context)
    }

    override fun onDestroy() {
        println("Terms and Conditions destroy ")
        super.onDestroy()
    }

    override fun onDetach() {
        println("Terms and Conditions Detach ")
        super.onDetach()
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        println("Terms and Conditions OnViewStateRestored ")
    }

    override fun onStop() {
        super.onStop()
        println("Terms and Conditions OnStop ")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        println("Terms and Conditions SavedInstanceState ")
    }

    override fun onStart() {
        super.onStart()
        println("Terms and Conditions Fragment  started")
    }

}