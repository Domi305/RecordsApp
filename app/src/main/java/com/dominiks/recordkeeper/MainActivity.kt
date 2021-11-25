package com.dominiks.recordkeeper

import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.dominiks.recordkeeper.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonCycling.setOnClickListener {
            binding.bottomNav
        }

        binding.buttonRunning.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
            }
        })

        /*binding.buttonCycling.setOnClickListener(this)
        binding.buttonRunning.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if (view?.id == R.id.button_cycling) {
            Toast.makeText(this, "I have clicked on the cycling button", Toast.LENGTH_LONG).show()
        } else if (view?.id == R.id.button_running) {
            Toast.makeText(this, "I have clicked on the running button", Toast.LENGTH_LONG).show()
        }*/

    }

    private fun onRunningClicked() {
        supportFragmentManager.commit {
            replace(R.id.frame_content, RunningFragment())
        }
    }

    private fun onCyclingClicked() {
        supportFragmentManager.commit {
            replace(R.id.frame_content, CyclingFragment())
        }
    }
}