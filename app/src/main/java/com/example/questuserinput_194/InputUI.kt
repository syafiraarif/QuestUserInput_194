package com.example.questuserinput_194

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable

fun FormInputan (modifier : Modifier){

    var textNama by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
    var textStatus by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }

    var nama by remember { mutableStateOf("") }
    var jenis by remember { mutableStateOf("") }
    var status by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }

    val genderList = listOf("Laki-laki","Perempuan")
    val statusList = listOf("Janda","Lajang","Duda")



}