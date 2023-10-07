package com.applefish.littlelemon

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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


val categories = listOf<String>("Lunch","Dinner","Main","Dessert")

@Composable
fun CategoryButton(category: String) {
    Button(onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(containerColor= Color.LightGray),
        shape = RoundedCornerShape(40),
        modifier = Modifier.padding(5.dp)
    ) {
        Text(text = category,
            color = Color.Black)
    }
}

@Composable
@Preview
fun PrefiewCategoryButton(){
    CategoryButton(category = "Cat")
}

@Composable
@Preview
fun ListOfCategory(){
    Row {
        categories.forEach {
            CategoryButton(category =it)
        }
    }

}





