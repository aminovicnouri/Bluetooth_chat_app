package com.aminovic.bluetoothchatapp.di

import android.content.Context
import com.aminovic.bluetoothchatapp.data.chat.AndroidBluetoothController
import com.aminovic.bluetoothchatapp.domai.chat.BluetoothController
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesBluetoothController(@ApplicationContext context: Context): BluetoothController {
        return AndroidBluetoothController(context = context)
    }
}