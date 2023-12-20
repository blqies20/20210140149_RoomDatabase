package com.example.activity7_roomsiswa.ui.halaman

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.activity7_roomsiswa.R
import com.example.activity7_roomsiswa.model.EditViewModel
import com.example.activity7_roomsiswa.model.PenyediaViewModel
import com.example.activity7_roomsiswa.navigasi.DestinasiNavigasi
import com.example.activity7_roomsiswa.navigasi.SiswaTopAppbar
import kotlinx.coroutines.launch

object ItemEditDestination : DestinasiNavigasi{
    override val route = "item_edit"
    override val titleRes = R.string.edit_siswa
    const val itemIdArgs = "itemId"
    val routeWithArgs = "$route/{$itemIdArgs}"
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemEditScreen(
    navigateBack: () -> Unit,
    onNavigateUp: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: EditViewModel = viewModel(factory = PenyediaViewModel.Factory)
){
    val coroutineScope = rememberCoroutineScope()
    Scaffold(
        topBar = {
            SiswaTopAppbar(
                title = stringResource(id = ItemEditDestination.titleRes),
                canNavigateBack = true,
                navigateUp = onNavigateUp
            )},
        modifier = modifier
        ) {innerPadding ->
        EntrySiswaBody(
            uiStateSiswa = viewModel.siswaUiState,
            onSiswaValueChange = viewModel::updateUiState,
            onSaveClick = {
                coroutineScope.launch {
                viewModel.updateSiswa()
                navigateBack()
            } },
            modifier = Modifier.padding(innerPadding)
        )
    }
}