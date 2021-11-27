package com.dominiks.recordkeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dominiks.recordkeeper.databinding.ActivityEditCyclingRecordBinding

class EditCyclingRecordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditCyclingRecordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditCyclingRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val record = intent.getStringExtra("Record")
        title = "$record Record"
    }
}