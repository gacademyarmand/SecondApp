package com.example.secondapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class FlightReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Log.i("Flight","receive a fight broadcast")
    }
}