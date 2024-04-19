package com.app.melvin

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.melvin.ui.theme.MelvinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            
            Greeting()
       
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Greeting() {
    Column(
        modifier = Modifier

            .background(Color.LightGray)
            .fillMaxHeight()
            .fillMaxWidth(),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally


    ) {
//Styling of the column are placed in the brackets
        Text(
            "WELCOME USER", color = Color.DarkGray,
            modifier = Modifier.background(Color.Red)
        )
        Text(text = "Our first android project", color = Color.Blue)

        Text(text = "Where do we proceed after this", color = Color.Magenta)
        Text(text = "Having a rough day", fontSize = 20.sp, fontFamily = FontFamily.Serif)

//        sp is for fonts while dp is for height and width


        Spacer(modifier = Modifier.height(40.dp))


        Row() {
            Text(text = "Home")

            Spacer(modifier = Modifier.width(10.dp))

            Text(text = "About")

            Spacer(modifier = Modifier.width(10.dp))


            Text(text = "Settings")
        }


        val about = LocalContext.current

        Button(onClick = {
            about.startActivity(Intent(about,AboutActivity::class.java))

        }) {
            Text(text = "About page")

        }



        val inp = LocalContext.current
        Text(text = "INPUT",
            modifier = Modifier
                .clickable{
                    inp.startActivity(Intent(inp, InputActivity2::class.java))
                })

        val qq = LocalContext.current
        Text(text = "Phone number",
            modifier = Modifier
                .clickable{
                    qq.startActivity(Intent(qq, MainActivity::class.java))
                })









    }


}





