package com.example.hitepro_app.ScriptsActivityAndFragments

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.example.hitepro_app.MainActivityAndFragments.MainActivity
import com.example.hitepro_app.R
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_scripts.*

class ScriptsActivity : AppCompatActivity() {
    var tabLayout: TabLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scripts)

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR)

        backClick()
        tabLayoutFun()

    }


    fun backClick(){
        comeBackButton.setOnClickListener(){
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    fun tabLayoutFun(){
        tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        tabLayout!!.addTab(tabLayout!!.newTab().setText("Активные"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("Неактивные"))
        tabLayout!!.addOnTabSelectedListener(object :TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tabLayout!!.selectedTabPosition == 1){
                    val action = ScriptsMainFragment1Directions.actionScriptsMainFragment1ToScriptsMainFragment2(false)
                    findNavController(R.id.navScriptsHostFragment).navigate(action)
                }else {
                    val action = ScriptsMainFragment2Directions.actionScriptsMainFragment2ToScriptsMainFragment1(false)
                    findNavController(R.id.navScriptsHostFragment).navigate(action)
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }
            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })
    }
}