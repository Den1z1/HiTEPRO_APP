package com.example.hitepro_app

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.navBottom)
        val navController = findNavController(R.id.navHostFragment)
        bottomNavigationView.setupWithNavController(navController)

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR)
        
    }

    override fun onSaveInstanceState(outState: Bundle) {
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.navBottom)
        outState.putInt("opened_fragment", bottomNavigationView.getCurrentItem())
        super.onSaveInstanceState(outState)
    }
}