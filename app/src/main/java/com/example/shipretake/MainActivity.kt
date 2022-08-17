package com.example.shipretake

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.category_layout_viewholder.*

class MainActivity : AppCompatActivity() {

    var categories = arrayOf("Java", "PHP", "Kotlin", "Javascript", "Python", "Swift")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var aa = ArrayAdapter(
            this,
            R.layout.category_layout_viewholder,
            R.id.categoryNameTVSpinner,
            categories
        )
        aa.setDropDownViewResource(R.layout.category_layout_viewholder)

        with(categorySpinner)
        {
            adapter = aa
            setSelection(0, false)
//            onItemSelectedListener = this@MainActivity
            prompt = "Select your favourite language"
            gravity = Gravity.CENTER

        }
    }


}