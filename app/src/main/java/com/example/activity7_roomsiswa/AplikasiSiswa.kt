package com.example.activity7_roomsiswa

import android.app.Application
import com.example.activity7_roomsiswa.repositori.ContainerApp
import com.example.activity7_roomsiswa.repositori.ContainerDataApp

class AplikasiSiswa : Application() {
    /**
     * AppContainer instance digunakan oleh kelas-kelas lainnya untu mendapatkan dependensi
     */
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}