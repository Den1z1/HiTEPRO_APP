package com.example.hitepro_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_scripts.*

class ScriptsActivity : AppCompatActivity() {
    var tabLayout: TabLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scripts)


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