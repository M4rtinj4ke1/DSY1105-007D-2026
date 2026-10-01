package com.example.dsy1105_007d_2026.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.dsy1105_007d_2026.ui.home.MuestraDatosScreen
import com.example.dsy1105_007d_2026.ui.theme.HomeScreen
import com.example.dsy1105_007d_2026.view.DrawerMenu

@Composable
fun AppNav(){
    val navController= rememberNavController()

    NavHost(navController=navController, startDestination = "login"){
        composable("login"){
            HomeScreen(navController=navController)
        }// fin composable

        composable(
            //route="muestraDatos/{username}",
            route="DrawerMenu/{username}",

            arguments = listOf(
                navArgument("username"){
                    type= NavType.StringType
                }
            )//fin list
        )//fin composable
        {// inicio back
            backStackEntry ->
            val username=backStackEntry.arguments?.getString("username").orEmpty()

            //MuestraDatosScreen(username=username,navController=navController)

            DrawerMenu(username=username,navController=navController)
        }//termino back


    } // fin Navhost
}//fin AppNav