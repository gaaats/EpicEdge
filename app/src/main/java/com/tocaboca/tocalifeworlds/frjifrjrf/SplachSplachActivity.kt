package com.tocaboca.tocalifeworlds.frjifrjrf

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.facebook.applinks.AppLinkData
import com.tocaboca.tocalifeworlds.R
import com.tocaboca.tocalifeworlds.bbbhyhyhy.ApaApaApaClass
import com.tocaboca.tocalifeworlds.bbbhyhyhy.ApaApaApaClass.Companion.ju5uj5ujuj
import com.tocaboca.tocalifeworlds.bgbhhyhy.IJjfijijrfjrf
import com.tocaboca.tocalifeworlds.bhyhyhy.Jfdjf
import com.tocaboca.tocalifeworlds.frgtgtgt.VeboboboboboActivity2
import com.tocaboca.tocalifeworlds.grfhughugt.SecondSecoondActivity
import com.tocaboca.tocalifeworlds.gtjigtjigt.GammymymymActivity2
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class SplachSplachActivity : AppCompatActivity() {
    private var bnyjuji2ki2ik: CompositeDisposable? = null

    private fun onResponse(response: Jfdjf) {
        ju5uj5ujuj["AppsCh"] = response.epicapps
        ju5uj5ujuj["GeoHose"] = response.epicgeo
        ju5uj5ujuj["View"] = response.epicview


        startActivity(Intent(this, SecondSecoondActivity::class.java))
        finish()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splach_splach)

        val frjirfjjgtijigt = IJjfijijrfjrf()


        val fvrfgjtgtjigtgt = getSharedPreferences("ActivityPREF", MODE_PRIVATE)
        if (fvrfgjtgtjigtgt.getBoolean("activity_exec", false)) {
            val cffrrfgrfgtgtgt = getSharedPreferences("NEWPR", Context.MODE_PRIVATE)
            val vffrbfrygfrgyrf =  cffrrfgrfgtgtgt.getString("ENTRY_CODE", "0")
            if (vffrbfrygfrgyrf == "web"){
                startActivity(Intent(this, VeboboboboboActivity2::class.java))
                finish()
            } else {
                startActivity(Intent(this, GammymymymActivity2::class.java))
                finish()
            }
        } else {
            val gtojgfjrfhuifrhfr = fvrfgjtgtjigtgt.edit()
            gtojgfjrfhuifrhfr.putBoolean("activity_exec", true)
            gtojgfjrfhuifrhfr.apply()


            getttdepapappde(this)


            bnyjuji2ki2ik = CompositeDisposable()

            val ju59ki5ki5k9ik = Retrofit.Builder()
                .baseUrl("http://epicedge.xyz/")
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(IJjfijijrfjrf.PForfrkrfkof::class.java)

            bnyjuji2ki2ik?.add(
                ju59ki5ki5k9ik.gogogtadatata()
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(Schedulers.io())
                    .subscribe({ response -> onResponse(response) }, { t -> onFailure(t) })
            )
        }
    }
    private fun onFailure(t: Throwable) {
        Toast.makeText(this,t.message, Toast.LENGTH_SHORT).show()
    }

    fun getttdepapappde(ju59ki59ik5ikik: Context) {

        AppLinkData.fetchDeferredAppLinkData(
            ju59ki59ik5ikik
        ) {
            if (it == null){

            }
            if (it!!.targetUri == null){

            }
            val dephyoujojuo = it!!.targetUri?.host.toString()
            ju5uj5ujuj["FBData"] = dephyoujojuo
        }
    }

}