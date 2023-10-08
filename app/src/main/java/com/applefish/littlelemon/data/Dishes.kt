package com.applefish.littlelemon.data

import com.applefish.littlelemon.R

data class Dish(
    val name: String,
    val price: String,
    val description: String,
    val image: Int
)

val dishes = listOf<Dish>(
    Dish(name ="Greeek Salad",price ="12.99$", description = "The famous Greek salad of crispy lettuce, peppers, olives, our Chicago ..",image = R.drawable.greeksalad)
    ,Dish(name ="Greeek Salad",price ="12.99$", description = "The famous Greek salad of crispy lettuce, peppers, olives, our Chicago ..",image = R.drawable.greeksalad)
    ,Dish(name ="Greeek Salad",price ="12.99$", description = "The famous Greek salad of crispy lettuce, peppers, olives, our Chicago ..",image = R.drawable.greeksalad)
    ,Dish(name ="Greeek Salad",price ="12.99$", description = "The famous Greek salad of crispy lettuce, peppers, olives, our Chicago ..",image = R.drawable.greeksalad)
)