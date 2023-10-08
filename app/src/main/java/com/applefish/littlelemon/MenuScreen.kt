package com.applefish.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.applefish.littlelemon.data.Categories
import com.applefish.littlelemon.data.Dish
import com.applefish.littlelemon.data.dishes


@Composable
@Preview
fun MenuListScreen(){
    Column (modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        LazyRow {
            items(Categories) { category ->
                CategoryButton(category  = category)
            }
        }

        Divider(modifier = Modifier.padding(8.dp),
            color = Color.Gray,
            thickness = 1.dp
        )

        LazyColumn{
            items(dishes) { dish ->
                MenuDish(dish  = dish)
            }
        }
    }


}


@Composable
fun MenuDish(dish: Dish) {
    Card(colors = CardDefaults.cardColors(Color.White)) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)){
            Column {
                Text(
                    text = dish.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = dish.description,
                    color= Color.Gray,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(vertical = 5.dp)
                        .fillMaxWidth(0.75f)
                )
                Text(
                    text = dish.price,
                    color= Color.Gray,
                    fontWeight = FontWeight.Bold
                )

            }
            Image(painter = painterResource(id = dish.image) , contentDescription = "Greek Salad Image")

        }
    }

    Divider(modifier = Modifier.padding(start = 8.dp, end = 8.dp),
        color = Color.LightGray,
        thickness = 1.dp
    )
}


@Composable
@Preview
fun PrefiewCategoryButton(){
    CategoryButton(category = "Cat")
}


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
fun PreviewMenuDish(){
    MenuDish(dishes[0])
}