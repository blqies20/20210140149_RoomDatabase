package com.example.activity7_roomsiswa.model

import androidx.lifecycle.ViewModel
import com.example.activity7_roomsiswa.data.Siswa
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
/** Fungsi untuk mengkonversi data input ke data dalam tabel sesuai jenis datanya **/
fun DetailSiswa.toSiswa(): Siswa = Siswa(
    id = id,
    nama = name,
    alamat = address,
    telpon = phone
)

fun Siswa.toUiStateSiswa(isEntryValid: Boolean = false): UIStateSiswa = UIStateSiswa(
    detailSiswa = this.toDetailSiswa(),
    isEntryValid = isEntryValid
)

fun Siswa.toDetailSiswa(): DetailSiswa = DetailSiswa(
    id = id,
    name = nama,
    address = alamat,
    phone = telpon
)