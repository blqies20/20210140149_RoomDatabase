package com.example.activity7_roomsiswa.model

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.activity7_roomsiswa.AplikasiSiswa

/**
 * Fungsi ekstensi query object [*Application] dan mengembalikan sebuah instance dari [*AplikasiSiswa].
 */
fun CreationExtras.aplikasiSiswa():AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)