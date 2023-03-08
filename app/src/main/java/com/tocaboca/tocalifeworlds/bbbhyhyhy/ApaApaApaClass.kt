package com.tocaboca.tocalifeworlds.bbbhyhyhy

import android.app.Application
import com.my.tracker.MyTracker
import com.onesignal.OneSignal

class ApaApaApaClass:Application() {

    companion object {
        var ju5uj5ujuj: HashMap<String, String> = HashMap()
        val onennenesss = "8baea810-1f06-423f-a67e-162b1512b54f"
        val agthyhyhyhyMyTracker = "39973920476358010487"
    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        rfgjgtjiigtgtjigtijgti()
        val gtkogtkogtkogt = MyTracker.getTrackerConfig()
        gtkogtkogtkogt.isTrackingLaunchEnabled = true
        MyTracker.initTracker(agthyhyhyhyMyTracker, this)
    }

    private fun rfgjgtjiigtgtjigtijgti() {
        OneSignal.setAppId(onennenesss)
    }
}