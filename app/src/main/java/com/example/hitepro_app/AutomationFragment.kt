package com.example.hitepro_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_automation.*

class AutomationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_automation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mainActivity = activity
        mainActivity!!.navBottom!!.visibility = View.VISIBLE

        clickView1.setOnClickListener(){
            val action = AutomationFragmentDirections.actionAutomationFragmentToActiveScriptsFragment("")
            findNavController().navigate(action)
        }

        clickView2.setOnClickListener(){

        }
    }
}