package com.example.activity7_roomsiswa.navigasi

interface DestinasiNavigasi {
    /**
     * Nama unik untuk menentukan jalur bagi composable
     */
    val route: String

    /**
     * String resource id yang berisi judul yang akan ditampilkan di layar halaman
     */
    val titleRes: Int
}