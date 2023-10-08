package com.applefish.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.applefish.littlelemon.ui.theme.LittleLemonTheme
import com.applefish.littlelemon.ui.theme.Pink80
import com.applefish.littlelemon.ui.theme.Purple80
import com.applefish.littlelemon.ui.theme.PurpleGrey80
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LittleLemonTheme {
        Greeting("Android")
    }
}



@Composable
@Preview
fun DrawerContent() {
    val configuration = LocalConfiguration.current
    Surface() {
        val menuPadding = 8.dp
        Column {
            Text(
                "Appetizers",
                modifier = Modifier
                    .weight(0.25f)
                    .background(Purple80)
                    .padding(menuPadding)
                    .fillMaxWidth()
            )
            Text(
                "Salads",
                modifier = Modifier
                    .weight(0.25f)
                    .padding(menuPadding)
                    .fillMaxWidth()
            )
            Text(
                "Drinks",
                modifier = Modifier
                    .weight(0.25f)
                    .background(Pink80)
                    .padding(menuPadding)
                    .fillMaxWidth()
            )
            Text(
                "Mains",
                modifier = Modifier
                    .weight(0.25f)
                    .background(PurpleGrey80)
                    .padding(menuPadding)
                    .fillMaxWidth()
            )
        }
    }
}

@Composable
@Preview
fun LazyGrid(){
    LazyVerticalGrid(columns = GridCells.Fixed (2)) {
        items(500){number ->
            MyGridCell()
        }
    }
}

@Composable
fun MyGridCell() {
    Card(
        elevation = CardDefaults.cardElevation(16.dp),
        modifier = Modifier.padding(8.dp)
    ) {
        Box(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.greeksalad),
                contentDescription = "Greek Salad",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.fillMaxWidth()
            )
            Text(
                text = "Greek Salad",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .align(Alignment.TopStart)

            )
            Text(
                text = "$12.99",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .background(Color.White)
                    .padding(start = 4.dp, end = 4.dp)
                    .align(Alignment.BottomEnd)

            )
        }
    }
}