package com.applefish.littlelemon

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@Composable
fun BottomNavigation(navHostController: NavHostController){
val destinationsList = listOf<Destinations>(Home,
    Menu)
    val selectedIndex = rememberSaveable() {
        mutableStateOf(0)
    }
    NavigationBar () {
        destinationsList.forEachIndexed { index, destinations ->
            NavigationBarItem(
                label = { Text(text = destinations.route)},
                icon = { Icon(imageVector = destinations.icon , contentDescription =destinations.title )},
                selected = index == selectedIndex.value,
                onClick = {
                    selectedIndex.value = index
                    navHostController.navigate(destinationsList[selectedIndex.value].route) {
                        popUpTo(Home.route)
                    }

                }
            )

        }
    }
}

@Composable
@Preview
fun BottomNavigationPreview(){
    val navHostController = rememberNavController()
    BottomNavigation(navHostController = navHostController)
}