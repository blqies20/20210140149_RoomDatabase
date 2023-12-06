package com.example.activity7_roomsiswa.model

import androidx.lifecycle.ViewModel
import com.example.activity7_roomsiswa.repositori.RepositoriSiswa

class EntryViewModel (private val repositoriSiswa: RepositoriSiswa): ViewModel() {

}
/**
 * Mewakili staus ui untuk siswa
 */
data class UIStateSiswa(
    val detailSiswa: DetailSiswa = DetailSiswa(),
    val isEntryValid: Boolean = false
)

data class DetailSiswa(
    val id: Int = 0,
    val name: String = "",
    val address: String = "",
    val phone: String = "",
)
