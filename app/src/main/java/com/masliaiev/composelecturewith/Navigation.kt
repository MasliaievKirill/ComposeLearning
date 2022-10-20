package com.masliaiev.composelecturewith

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.masliaiev.composelecturewith.first_screen.FirstScreen
import com.masliaiev.composelecturewith.second_screen.SecondScreen
import com.masliaiev.composelecturewith.third_screen.ThirdScreen

@Composable
fun AppNavigation(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "first_screen"
) {

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {

        composable("first_screen") {
            FirstScreen(
                onNavigateToCounter = { navController.navigate("second_screen") },
                onNavigateToList = { navController.navigate("third_screen") }
            )
        }

        composable("second_screen") {
            SecondScreen()
        }

        composable("third_screen") {
            ThirdScreen()
        }
    }
}