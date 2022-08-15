package com.example.hieuungnutbamgda

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.hieuungnutbamgda.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var m1Anim: Animation
    private lateinit var m2Anim: Animation
    private lateinit var m3Anim: Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        m1Anim = AnimationUtils.loadAnimation(
            baseContext,
            R.anim.toa
        )
        m2Anim = AnimationUtils.loadAnimation(
            baseContext,
            R.anim.rotate
        )
        m3Anim = AnimationUtils.loadAnimation(
            baseContext,
            R.anim.rotate2
        )
        binding.btnToa.startAnimation(m1Anim)
        binding.xoay.startAnimation(m2Anim)
//        binding.xoay2.startAnimation(m3Anim)
    }
}