package com.example.myanaliticsappexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.huawei.hms.analytics.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bt1 = findViewById<Button>(R.id.btn1)
        val bt2 = findViewById<Button>(R.id.btn2)

        HiAnalyticsTools.enableLog()
        val instance = HiAnalytics.getInstance(applicationContext)


        bt1.setOnClickListener {
            btn1(instance)
        }

        bt2.setOnClickListener {
            btn2(instance)
        }
    }

    private fun btn1(instance: HiAnalyticsInstance) {
        var bundle = Bundle()
        bundle.putString("btn_1", "esta es una prueba")
        instance.onEvent("ID_Prueba1", bundle)
        Toast.makeText(this, "Acción 1", Toast.LENGTH_SHORT).show()
    }

    private fun btn2(instance: HiAnalyticsInstance) {
        var bundle = Bundle()
        bundle.putString("btn_1", "esta es una prueba")
        instance.onEvent("ID_Prueba2", bundle)
        Toast.makeText(this, "Acción 2", Toast.LENGTH_SHORT).show()
    }

}