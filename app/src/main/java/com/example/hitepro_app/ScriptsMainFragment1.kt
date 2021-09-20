package com.example.hitepro_app

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import android.widget.Toast
import kotlinx.android.synthetic.main.scripts_fragment_main1.*


class ScriptsMainFragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.scripts_fragment_main1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dialog = CustomDialogFragment()


        val scriptsActivity = activity
        val popupMenu: PopupMenu = PopupMenu(scriptsActivity,additional)
        popupMenu.inflate(R.menu.a_scripts_settings_menu)


        popupMenu.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.wtScript -> {
                    Toast.makeText(scriptsActivity, "Нажмите на отключить сценарий, чтобы посмотреть на Custom view", Toast.LENGTH_LONG).show()
                }
                R.id.disScript -> {
                    dialog.show(scriptsActivity!!.supportFragmentManager, "customDialog")

                }
                R.id.histEvents -> {
                    Toast.makeText(scriptsActivity, "Нажмите на отключить сценарий, чтобы посмотреть на Custom view", Toast.LENGTH_LONG).show()
                }
            }
            false
        }

        additionalButton.setOnClickListener(){
            popupMenu.show()
        }

    }
}