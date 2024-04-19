package com.app.melvin

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.app.melvin.ui.theme.MelvinTheme
import com.melvin.myapplication.R

class ImageActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Picha()
            }
        }
    }

@Preview(showBackground = true)

@Composable
fun Picha() {

    Column(

        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        val ww = LocalContext.current
        Text(text = "IMAGES BUTTON",
            modifier = Modifier
                .clickable{
                    ww.startActivity(Intent(ww,MainActivity::class.java))
                })


        Image(painter = painterResource(id = R.drawable.mm), contentDescription = "null")
    }


}
