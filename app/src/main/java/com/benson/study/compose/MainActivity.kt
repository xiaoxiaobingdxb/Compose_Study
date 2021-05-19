package com.benson.study.compose

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import com.benson.study.compose.demo.DemoActivity
import com.benson.study.compose.demo.LayoutActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                Button(onClick = {
                    startActivity(Intent(this@MainActivity, DemoActivity::class.java))
                }) {
                    Text(text = "Demo")
                }
                Button(onClick = {
                    startActivity(Intent(this@MainActivity, LayoutActivity::class.java))
                }) {
                    Text(text = "Layout")
                }
            }
        }
    }
}