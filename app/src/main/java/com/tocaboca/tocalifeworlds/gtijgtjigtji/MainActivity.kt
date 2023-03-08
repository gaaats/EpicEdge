package com.tocaboca.tocalifeworlds.gtijgtjigtji

import android.app.Application
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.tocaboca.tocalifeworlds.R
import com.tocaboca.tocalifeworlds.bbbhyhyhy.ApaApaApaClass.Companion.ju5uj5ujuj
import com.tocaboca.tocalifeworlds.vgtgthhy.FilterFillalalalActivity
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    fun tggtjiogtjiogtjoihy(gtjoigtjigtjigt: Application, gngtjiogtjgtji: Context){
        AppsFlyerLib.getInstance()
            .init("54rxRZp5nTzUsd8phwhwfD", rfjfoedifiuhdegyugfr, gtjoigtjigtjigt)
        AppsFlyerLib.getInstance().start(gngtjiogtjgtji)
    }

    private val rfjfoedifiuhdegyugfr  = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val gt59hy5hy59hy = Observable.just(data?.get("campaign").toString())
            val hy5ju5ju5uj5k9i: Observer<String> = object : Observer<String> {
                override fun onSubscribe(d: Disposable) {
                    Log.d("ObseObse","onSubscribe")
                }
                override fun onError(e: Throwable) {
                    Log.d("ObseObse","onError");
                }
                override fun onComplete() {
                    Log.d("ObseObse","onComplete");


                    startActivity(Intent(this@MainActivity, FilterFillalalalActivity::class.java))
                    finish()
                }
                override fun onNext(t: String) {
                    ju5uj5ujuj["AppsData"] = t
                    Log.d("ObseObse", ju5uj5ujuj["AppsData"].toString())
                }
            }
            gt59hy5hy59hy.subscribe(hy5ju5ju5uj5k9i)
        }
        override fun onConversionDataFail(error: String?) {
        }
        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {
        }
        override fun onAttributionFailure(error: String?) {
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(ju5uj5ujuj["AppsCh"] == "1") {
            tggtjiogtjiogtjoihy(application, this)
        } else {
            startActivity(Intent(this, FilterFillalalalActivity::class.java))
        }

        GlobalScope.launch {
            val hy9uj5ju599k5ki5k = AdvertisingIdClient.getAdvertisingIdInfo(applicationContext).id
            ju5uj5ujuj["GAID"] = hy9uj5ju599k5ki5k.toString()
        }

    }
}