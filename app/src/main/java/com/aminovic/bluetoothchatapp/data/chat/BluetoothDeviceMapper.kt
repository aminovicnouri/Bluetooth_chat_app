package com.aminovic.bluetoothchatapp.data.chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.aminovic.bluetoothchatapp.domai.chat.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return  BluetoothDeviceDomain(
        name = name,
        address = address
    )
}