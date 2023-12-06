package com.example.activity7_roomsiswa.navigasi

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.activity7_roomsiswa.ui.halaman.DestinasiEntry
import com.example.activity7_roomsiswa.ui.halaman.DestinasiHome
import com.example.activity7_roomsiswa.ui.halaman.EntrySiswaScreen
import com.example.activity7_roomsiswa.ui.halaman.HomeScreen

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    NavHost(
        navController=navController,
        startDestination = DestinasiHome.route,
        modifier = Modifier
    ){
        composable(DestinasiHome.route){
            HomeScreen(navigateToItemEntry = { navController.navigate(DestinasiEntry.route) })
        }
        composable(DestinasiEntry.route){
            EntrySiswaScreen(navigateBack = { navController.popBackStack() })
        }
    }
}