package com.xianwei.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var foodArray = arrayListOf("Chinese", "Hamburger", "pizza", "Starbucks")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_decider.setOnClickListener {
            val index = Random().nextInt(foodArray.count())
            tv_food_name.setText(foodArray[index])
        }

        btn_add_food.setOnClickListener {
            val newFood = et_add_food.text.toString()
            foodArray.add(newFood)
            et_add_food.text.clear()
        }
    }
}
