package com.example.webrtc.ventures.webrtc.webrtcroulette

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LobbyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lobby)
        val connectButton: Button = findViewById(R.id.connect_button)
        connectButton.setOnClickListener {
            startVideoCall()
        }

    }

    private fun startVideoCall() {
        startActivity(Intent(this, VideoCallActivity::class.java))
    }

}
