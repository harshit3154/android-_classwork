package com.example.signature

import android.accessibilityservice.FingerprintGestureController.FingerprintGestureCallback
import android.content.Context
import android.hardware.fingerprint.FingerprintManager
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var signature_custome_view:SignatureCustomeView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val cb: Button = findViewById(R.id.clear)
        signature_custome_view = findViewById<View>(R.id.cd) as SignatureCustomeView
        cb.setOnClickListener() {
            signature_custome_view.clear()
        }
    }
}