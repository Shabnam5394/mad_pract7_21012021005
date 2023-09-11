package com.example.mad_pract7_21012021005

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class youtube : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        val webView = findViewById<WebView>(R.id.webView)
        webView.settings.javaScriptEnabled = true
        webView.loadUrl("https://www.youtube.com/")


    }
}