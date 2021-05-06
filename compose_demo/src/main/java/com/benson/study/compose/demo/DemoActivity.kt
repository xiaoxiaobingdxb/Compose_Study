package com.benson.study.compose.demo

import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview

class DemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            myText("Compose Demo")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("dxb", "onDestory")
    }
}

@Composable
fun myText(text: String) {
    Text(text)
}

@Composable
@Preview(showBackground = true, showDecoration = true)
fun PreviewMyText() {
    myText("preview my text")
}
