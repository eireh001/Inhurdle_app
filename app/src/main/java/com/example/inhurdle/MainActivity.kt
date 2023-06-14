package com.example.inhurdle

import android.content.Intent
import android.media.MediaPlayer
import android.media.SoundPool
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val use : ImageButton
        val mediaPlayer = MediaPlayer.create(this, R.raw.use)

        use = findViewById(R.id.Use_btn)
        use.setOnClickListener { mediaPlayer.start() }
    }
}