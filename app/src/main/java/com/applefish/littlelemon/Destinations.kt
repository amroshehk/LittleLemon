package com.applefish.littlelemon

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.ui.graphics.vector.ImageVector

interface Destinations {
    val route: String
    val icon:ImageVector
    val title:String
}


object Home : Destinations {
    override val route: String = "Home"
    override val icon = Icons.Filled.Home
    override val title: String = "Home"
}

object Menu : Destinations {
    override val route: String = "Menu"
    override val icon = Icons.Filled.Menu
    override val title: String = "Menu"
}