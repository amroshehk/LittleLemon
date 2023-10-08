package com.applefish.littlelemon

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.littlelemon.LowerPanel


@Composable
fun HomeScreen(navHostController: NavHostController) {
    Column {
/*        Column (modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Home Screen", fontSize = 32.sp)
            Button(
                onClick = { navHostController.navigate(Menu.route) },
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFF4CE14))
            ) {
                Text(
                    text = stringResource(id = R.string.order),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF333333)
                )
            }
        }*/

        UpperPanel(navHostController)
        LowerPanel()

    }

}

@Preview
@Composable
fun HomeScreenPreview() {

    Column {
        val navHostController = rememberNavController()
        HomeScreen(navHostController)
    }
}