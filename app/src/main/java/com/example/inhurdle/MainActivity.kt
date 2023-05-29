package com.example.inhurdle

import android.content.Intent
import android.media.SoundPool
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    private lateinit var soundPool : SoundPool
    private var soundId : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val use : ImageButton
        use = findViewById<ImageButton>(R.id.Use_btn)

        setUse()
        use.setOnClickListener {
            playUse()
        }
    }

    private fun playUse() {
        soundPool.play(soundId!!, 1.0f, 1.0f, 0, 0, 1.0f)
    }

    private fun setUse() {
        soundPool = SoundPool.Builder().setMaxStreams(1).build()
        soundId = soundPool.load(this, R.raw.use, 1)

    }
}