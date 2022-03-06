package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val s:Student = Student(id = "W123456",name = "Abu")
        binding.student = s

        binding.btnUpdate.setOnClickListener(){

            s.name="Alex"

            binding.apply {
                invalidateAll()
            }
        }

        //binding.tvStudentName.text = s.id
        //binding.tvStudentID.text = "s.name
        //val tvName:TextView=findViewById(R.id.)
    }
}