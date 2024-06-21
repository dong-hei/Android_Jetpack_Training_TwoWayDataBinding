package com.dk.twowaydatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.dk.twowaydatabinding.databinding.ActivityMainBinding

/**
 * 양방향 데이터 결합
 *ㄴ 데이터 - 뷰를 직접 연결해서 서로에게 영향을 준다.
 * 
 * 1. 기존 방식 
 * 2. 양방향 데이터 결합 방식 -> VM <-> Activity(연결만 하는 역할) <-> XML
 * ㄴ 실제로는 VM <-> XML 이런 느낌
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var vm : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        vm = ViewModelProvider(this)[MainViewModel::class.java]

        // 사용할 수 있게 연결
        binding.vm = vm
        binding.lifecycleOwner = this


    //        setContentView(R.layout.activity_main)

        //1. 기존 방식
//        var age = 0
//
//        val ageArea = findViewById<TextView>(R.id.ageArea)
//        val plusBtn = findViewById<Button>(R.id.plusBtn)
//
//        plusBtn.setOnClickListener {
//            age++
//            ageArea.text = age.toString()
//        }



    }
}