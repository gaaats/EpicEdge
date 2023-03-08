package com.tocaboca.tocalifeworlds.grfhughugt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.tocaboca.tocalifeworlds.R
import com.tocaboca.tocalifeworlds.bbbhyhyhy.ApaApaApaClass
import com.tocaboca.tocalifeworlds.bgbhhyhy.IJjfijijrfjrf
import com.tocaboca.tocalifeworlds.bgmmkhy.JIfjijrf
import com.tocaboca.tocalifeworlds.gtijgtjigtji.MainActivity
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class SecondSecoondActivity : AppCompatActivity() {
    private fun onFailure(t: Throwable) {

        Toast.makeText(this, t.message, Toast.LENGTH_SHORT).show()
    }

    private fun onResponse(response: JIfjijrf) {
        ApaApaApaClass.ju5uj5ujuj.put("GEO", response.countryCode)
        startActivity(Intent(this, MainActivity::class.java))
    }

    private var frirfrfgtgt: CompositeDisposable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_secoond)

        frirfrfgtgt = CompositeDisposable()


        val klo59ol5ol59ol = Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(IJjfijijrfjrf.Jjfrijjjrf::class.java)


        frirfrfgtgt?.add(
            klo59ol5ol59ol.gtoigtogtj()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({ response -> onResponse(response) }, { t -> onFailure(t) })
        )
    }
}