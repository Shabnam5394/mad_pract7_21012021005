package com.example.mad_pract7_21012021005

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Initialize VideoView and set video source
        val videoView = findViewById<VideoView>(R.id.videoView)
        val videoPath = "https://www.youtube.com/watch?v=RmYyHadWyRE"
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(Uri.parse(videoPath))
        videoView.requestFocus()
        videoView.start()

    }


    fun switchToYoutube(view: View) {
        val intent = Intent(this, youtube::class.java)
        startActivity(intent)
    }

}