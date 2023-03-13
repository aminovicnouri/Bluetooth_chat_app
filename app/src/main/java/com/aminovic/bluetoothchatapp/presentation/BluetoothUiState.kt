package com.aminovic.bluetoothchatapp.presentation

import com.aminovic.bluetoothchatapp.domai.chat.BluetoothDevice

data class BluetoothUiState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList(),
)
