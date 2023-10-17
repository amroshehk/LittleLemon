package com.applefish.littlelemon

import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.applefish.littlelemon.ui.theme.LittleLemonColor

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun UpperPanel(navController: NavHostController) {
//    val normalClicks = remember { mutableStateOf(0) }
//    val longClicks = remember { mutableStateOf(0) }

    val context = LocalContext.current
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .background(LittleLemonColor.green)
            .fillMaxWidth()
            .padding(start = 12.dp, end = 12.dp, top = 16.dp, bottom = 16.dp)
    ) {
        Text(
            text = stringResource(id = R.string.little_lemon),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = LittleLemonColor.yellow,

            )
        Text(
            text = stringResource(id = R.string.chicago),
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            color = Color.White
        )
        Row(
            Modifier
                .fillMaxWidth()
                .padding(top = 18.dp),
            horizontalArrangement = Arrangement.Start
        ) {
            Text(
                text = stringResource(id = R.string.description_one),
                modifier = Modifier
                    .padding(bottom = 28.dp)
                    .fillMaxWidth(0.6f),
                color = Color.White,
                fontSize = 18.sp
            )
            Image(
                painter = painterResource(id = R.drawable.hero_image),
                contentDescription = stringResource(
                    id = R.string.description
                ),
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
            )
        }
        Button(
            onClick = {
                navController.navigate(Menu.route)
                Toast.makeText(context, "Order received. Thank you!", Toast.LENGTH_SHORT).show() },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(LittleLemonColor.yellow)
        ) {
            Text(
                text = stringResource(id = R.string.order),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = LittleLemonColor.charcoal
            )

//            Text(
//                text = "Normal: " + normalClicks.value.toString() + " Long: " + longClicks.value.toString(),
//                modifier = Modifier.combinedClickable(onClick = { normalClicks.value += 1 },
//                    onLongClick = { longClicks.value += 1 }))

        }
    }
}

@Composable
@Preview
fun PreviewUpperPanel(){

    val navHostController = rememberNavController()
    UpperPanel(navController = navHostController)
}
