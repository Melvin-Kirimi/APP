package com.app.melvin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.melvin.myapplication.R
import org.w3c.dom.Text


class InputActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          Input()
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Input() {

    Box {
        Image(

            painter = painterResource(id = R.drawable.qq), contentDescription = "",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )







        Column(
            modifier = Modifier
                .fillMaxSize(),


            horizontalAlignment = Alignment.CenterHorizontally

        ) {
//Each text-field requires its separate variable
            var name by remember {
                mutableStateOf(TextFieldValue(""))
            }
//        value is the name of the variable
            TextField(
                value = name,
                onValueChange = { name = it },
                label = { Text(text = "USERNAME") })

            Spacer(modifier = Modifier.height(20.dp))

            var phone by remember {
                mutableStateOf(TextFieldValue(""))
            }

            TextField(
                value = phone,
                onValueChange = { phone = it },
                label = { Text(text = "PHONE NUMBER") }


            )

            Spacer(modifier = Modifier.height(20.dp))

            var email by remember {
                mutableStateOf(TextFieldValue(""))
            }

            OutlinedTextField(
                value = email,
                onValueChange = { phone = it },
                label = { Text(text = "EMAIL") },
                leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "")},
                textStyle = TextStyle(Color.White),
                colors = TextFieldDefaults.outlinedTextFieldColors(

                    focusedBorderColor = Color.White,
                    unfocusedBorderColor = Color.White,
                    focusedLabelColor = Color.White,
                    unfocusedLabelColor = Color.White,
                    cursorColor = Color.White
                )


            )


        }


    }
}