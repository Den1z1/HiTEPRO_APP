package com.example.hitepro_app.MainActivityAndFragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hitepro_app.R
import com.example.hitepro_app.ScriptsActivityAndFragments.ScriptsActivity
import kotlinx.android.synthetic.main.main_fragment_automation.*

class MainAutomationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.main_fragment_automation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mainActivity = activity

        clickView1.setOnClickListener(){
            startActivity(Intent(mainActivity, ScriptsActivity::class.java))
        }

        clickView2.setOnClickListener(){

        }
    }
}