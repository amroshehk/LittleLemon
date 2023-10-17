package com.applefish.littlelemon

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.applefish.littlelemon.ui.theme.LittleLemonColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {

    val  context = LocalContext.current
    var username by remember {
        mutableStateOf(TextFieldValue(""))
    }

    var password by remember {
        mutableStateOf(TextFieldValue(""))
    }
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.littlelemonlogo),
            contentDescription = stringResource(
                id = R.string.description
            ),
            modifier = Modifier.padding(10.dp)
        )

        TextField(
            value = username,
            onValueChange = {username = it},
            label = { Text(text = stringResource(id = R.string.username)) },
            modifier = Modifier.padding(10.dp))
        TextField(value = password,
            onValueChange = {password = it},
            label = { Text(text = stringResource(id = R.string.password)) },
            visualTransformation = PasswordVisualTransformation(),
            shape = RoundedCornerShape(0.dp),
            modifier = Modifier.padding(10.dp)
        )

        Button(
            onClick = {
                Log.d("AAA", "${username.text}")
                Log.d("AAA", "${password.text}")

                if (username.text == "Darian" && password.text == "littlelemon")
                    Toast.makeText(context, "Welcome to Little Lemon!", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(context, "Invalid credentials. Please try again.", Toast.LENGTH_SHORT).show()
            },
            colors = ButtonDefaults.buttonColors(LittleLemonColor.green),
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier.padding(10.dp)
        ) {
            Text(text = stringResource(id = R.string.login))
        }
    }
}


@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}