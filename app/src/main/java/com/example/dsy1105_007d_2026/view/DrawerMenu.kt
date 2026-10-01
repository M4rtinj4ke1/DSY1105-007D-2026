package com.example.dsy1105_007d_2026.view

import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Fastfood
import androidx.compose.material.icons.filled.Grass
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material.icons.filled.LunchDining
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun DrawerMenu(
    username:String,
    navController: NavController
)
{//Inicio drawer
    Column(modifier= Modifier.fillMaxSize())
    {//iniccio columna

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .background(MaterialTheme.colorScheme.primary)
        )// Fin Box
        {// inicio contenido
            Text(
              text="Categorias  Usuario: $username",
                style= MaterialTheme.typography.headlineSmall,
                color=MaterialTheme.colorScheme.onPrimary,
                modifier= Modifier
                    .align(Alignment.BottomStart)
            )//fin texto

        }// fin contenido

        //Items

        LazyColumn(modifier=Modifier.weight(1f)){

            item{ //item 1
                NavigationDrawerItem(
                    label = {Text("Hanburguesa BBQ")},
                    selected=false,
                    onClick = {/*  accion */},
                    icon={Icon(Icons.Default.LunchDining, contentDescription="BBQ")}
                )//Fin Navigation
            } //fin item 1


            item{ //item 1
                NavigationDrawerItem(
                    label = {Text("Hanburguesa Veggie")},
                    selected=false,
                    onClick = {/*  accion */},
                    icon={Icon(Icons.Default.Grass
                        , contentDescription="Veggie")}
                )//Fin Navigation
            } //fin item 2

            item{ //item 1
                NavigationDrawerItem(
                    label = {Text("Hamburguesa Picante")},
                    selected=false,
                    onClick = {/*  accion */},
                    icon={Icon(Icons.Default.LocalFireDepartment
                        , contentDescription="Picante")}
                )//Fin Navigation
            } //fin item 3


            item{ //item 1
                NavigationDrawerItem(
                    label = {Text("Hamburguesa Clasica")},
                    selected=false,
                    onClick = {/*  accion */
                    val nombre= Uri.encode("Hamburguesa Clasica")
                    val precio="5000"

                    navController.navigate("ProductoFormScreen/$nombre/$precio")

                    },
                    icon={Icon(Icons.Default.Fastfood
                        , contentDescription="Clasica")}
                )//Fin Navigation
            } //fin item 4



        }//Fin Lazy

    }//fin iniccio columna


}//fin Inicio drawer


@Preview(showBackground = true)
@Composable

fun DrawerMenuPreview(){
    val navController= rememberNavController()
    DrawerMenu(username = "Usuario Prueba",navController=navController )
}


