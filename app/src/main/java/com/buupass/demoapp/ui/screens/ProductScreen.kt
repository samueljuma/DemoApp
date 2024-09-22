package com.buupass.demoapp.ui.screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.buupass.demoapp.R
import com.buupass.demoapp.data.Product

@Composable
fun ProductScreen() {
    //context for the toast message
    val context = LocalContext.current

    //my products
    val product1 = Product("Product 1", R.drawable.juice1)
    val product2 = Product("Product 2", R.drawable.juice2)
    val product3 = Product("Product 3", R.drawable.juice3)
    val product4 = Product("Product 4", R.drawable.juice4)
    val product5 = Product("Product 5", R.drawable.juice5)
    val product6 = Product("Product 6", R.drawable.juice6)
    val product7 = Product("Product 7", R.drawable.juice1)
    val product8 = Product("Product 8", R.drawable.juice2)



    //list of products
    val products = mutableListOf(product1,product2,product3,product4, product5, product6, product7, product8)

//    for (i in 1..100) {
//        products.add("Product $i")
//    }

    //composable for the product list
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(items = products){ product->
            Card(
                modifier = Modifier
                    .padding(top = 4.dp, bottom = 4.dp)
                    .fillMaxWidth()
                    .clickable {
                        Toast.makeText(context, "You clicked $product", Toast.LENGTH_SHORT).show()
                    },
                elevation = CardDefaults.cardElevation(8.dp)
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .height(150.dp),
                ){
                    Image(
                        modifier = Modifier.fillMaxSize(),
                        painter = painterResource(id = product.image),
                        contentDescription = "Product Image",
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        modifier = Modifier.padding(16.dp)
                            .align(Alignment.TopStart),
                        text = product.title,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Blue
                    )
                }

            }

        }
    }

}
