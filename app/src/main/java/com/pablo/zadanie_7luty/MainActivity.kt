package com.pablo.zadanie_7luty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var seekBar_horizontal_red = findViewById<SeekBar>(R.id.seekBar_horizontal_red)
        var seekBar_horizontal_green = findViewById<SeekBar>(R.id.seekBar_horizontal_green)
        var seekBar_horizontal_blue = findViewById<SeekBar>(R.id.seekBar_horizontal_blue)

        var seekBar_vertical_red = findViewById<SeekBar>(R.id.seekBar_vertical_red)
        var seekBar_vertical_green = findViewById<SeekBar>(R.id.seekBar_vertical_green)
        var seekBar_vertical_blue = findViewById<SeekBar>(R.id.seekBar_vertical_blue)

        var progressBar_horizontal = findViewById<ProgressBar>(R.id.progressBar_horizontal)
        var progressBar_vertical = findViewById<ProgressBar>(R.id.progressBar_vertical)

        var picture_red = findViewById<ImageView>(R.id.imageView_red)
        var picture_green = findViewById<ImageView>(R.id.imageView_green)
        var picture_blue = findViewById<ImageView>(R.id.imageView_blue)

        findViewById<Button>(R.id.btn_reset).setOnClickListener {
            seekBar_horizontal_red.setProgress(50)
            seekBar_horizontal_green.setProgress(50)
            seekBar_horizontal_blue.setProgress(50)

            seekBar_vertical_red.setProgress(50)
            seekBar_vertical_green.setProgress(50)
            seekBar_vertical_blue.setProgress(50)

            var horizontal_progress = (seekBar_horizontal_red.progress + seekBar_horizontal_green.progress + seekBar_horizontal_blue.progress) / 3
            progressBar_horizontal.setProgress(horizontal_progress)

            var vertical_progress = (seekBar_vertical_red.progress + seekBar_vertical_green.progress + seekBar_vertical_blue.progress) / 3
            progressBar_vertical.setProgress(vertical_progress)
        }
    }
}