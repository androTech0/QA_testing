package com.mohammedalgorrah.similarpictuersgame.testclasses

import android.content.Context
import android.net.ConnectivityManager

class WifiTest {
    fun connection(context: Context): Boolean {
        val connectionManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        return connectionManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI)!!.isConnected
    }
}
