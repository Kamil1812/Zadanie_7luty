package com.pablo.zadanie_7luty

import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity


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

        var horizontal_progress = (seekBar_horizontal_red.progress + seekBar_horizontal_green.progress + seekBar_horizontal_blue.progress) / 3
        progressBar_horizontal.setProgress(horizontal_progress)

        var vertical_progress = (seekBar_vertical_red.progress + seekBar_vertical_green.progress + seekBar_vertical_blue.progress) / 3
        progressBar_vertical.setProgress(vertical_progress)

        var picture_red = findViewById<ImageView>(R.id.imageView_red)
        var picture_green = findViewById<ImageView>(R.id.imageView_green)
        var picture_blue = findViewById<ImageView>(R.id.imageView_blue)

        var red_vertical_value = seekBar_vertical_red.progress - 50
        var green_vertical_value = seekBar_vertical_green.progress - 50
        var blue_vertical_value = seekBar_vertical_blue.progress - 50

        var red_horizontal_value = seekBar_horizontal_red.progress - 50
        var green_horizontal_value = seekBar_horizontal_green.progress - 50

        findViewById<Button>(R.id.btn_reset).setOnClickListener {
            seekBar_horizontal_red.setProgress(50)
            seekBar_horizontal_green.setProgress(50)
            seekBar_horizontal_blue.setProgress(50)

            seekBar_vertical_red.setProgress(50)
            seekBar_vertical_green.setProgress(50)
            seekBar_vertical_blue.setProgress(50)
        }

        val default = picture_blue.layoutParams.width

        // HORIZONTAL RED
        seekBar_horizontal_red?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {
                horizontal_progress  = (seekBar_horizontal_red.progress + seekBar_horizontal_green.progress + seekBar_horizontal_blue.progress) / 3
                progressBar_horizontal.setProgress(horizontal_progress)


                var red_horizontal_value = seekBar_horizontal_red.progress / 100f
                var layout = picture_red.layoutParams

                if(red_horizontal_value == 0f)
                {
                    layout.width = 1
                }
                else
                {
                    var value = default * red_horizontal_value * 2
                    layout.width = value.toInt()
                }
                picture_red.layoutParams = layout
            }

            override fun onStartTrackingTouch(seek: SeekBar) {

            }

            override fun onStopTrackingTouch(seek: SeekBar) {

            }
        })

        // HORIZONTAL GREEN
        seekBar_horizontal_green?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {
                horizontal_progress  = (seekBar_horizontal_red.progress + seekBar_horizontal_green.progress + seekBar_horizontal_blue.progress) / 3
                progressBar_horizontal.setProgress(horizontal_progress)

                var green_horizontal_value = seekBar_horizontal_green.progress / 100f
                var layout = picture_green.layoutParams

                if(green_horizontal_value == 0f)
                {
                    layout.width = 1
                }
                else
                {
                    var value = default * green_horizontal_value * 2
                    layout.width = value.toInt()
                }
                picture_green.layoutParams = layout
            }

            override fun onStartTrackingTouch(seek: SeekBar) {

            }

            override fun onStopTrackingTouch(seek: SeekBar) {

            }
        })

        // HORIZONTAL BLUE
        seekBar_horizontal_blue?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {
                horizontal_progress  = (seekBar_horizontal_red.progress + seekBar_horizontal_green.progress + seekBar_horizontal_blue.progress) / 3
                progressBar_horizontal.setProgress(horizontal_progress)

                var blue_horizontal_value = seekBar_horizontal_blue.progress / 100f
                var layout = picture_blue.layoutParams

                if(blue_horizontal_value == 0f)
                {
                    layout.width = 1
                }
                else
                {
                    var value = default * blue_horizontal_value * 2
                    layout.width = value.toInt()
                }
                picture_blue.layoutParams = layout
            }

            override fun onStartTrackingTouch(seek: SeekBar) {

            }

            override fun onStopTrackingTouch(seek: SeekBar) {

            }
        })

        // VERTICAL RED
        seekBar_vertical_red?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {
                vertical_progress = (seekBar_vertical_red.progress + seekBar_vertical_green.progress + seekBar_vertical_blue.progress) / 3
                progressBar_vertical.setProgress(vertical_progress)

                var red_vertical_value = seekBar_vertical_red.progress / 100f
                var layout = picture_red.layoutParams

                if(red_vertical_value == 0f)
                {
                    layout.height = 1
                }
                else
                {
                    var value = default * red_vertical_value * 2
                    layout.height = value.toInt()
                }
                picture_red.layoutParams = layout
            }

            override fun onStartTrackingTouch(seek: SeekBar) {

            }

            override fun onStopTrackingTouch(seek: SeekBar) {

            }
        })

        // VERTICAL GREEN
        seekBar_vertical_green?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {
                vertical_progress = (seekBar_vertical_red.progress + seekBar_vertical_green.progress + seekBar_vertical_blue.progress) / 3
                progressBar_vertical.setProgress(vertical_progress)

                var green_vertical_value = seekBar_vertical_green.progress / 100f
                var layout = picture_green.layoutParams

                if(green_vertical_value == 0f)
                {
                    layout.height = 1
                }
                else
                {
                    var value = default * green_vertical_value * 2
                    layout.height = value.toInt()
                }
                picture_green.layoutParams = layout
            }

            override fun onStartTrackingTouch(seek: SeekBar) {

            }

            override fun onStopTrackingTouch(seek: SeekBar) {

            }
        })

        // VERTICAL BLUE
        seekBar_vertical_blue?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {
                vertical_progress = (seekBar_vertical_red.progress + seekBar_vertical_green.progress + seekBar_vertical_blue.progress) / 3
                progressBar_vertical.setProgress(vertical_progress)

                var blue_vertical_value = seekBar_vertical_blue.progress / 100f
                var layout = picture_blue.layoutParams

                if(blue_vertical_value == 0f)
                {
                    layout.height = 1
                }
                else
                {
                    var value = default * blue_vertical_value * 2
                    layout.height = value.toInt()
                }
                picture_blue.layoutParams = layout
            }

            override fun onStartTrackingTouch(seek: SeekBar) {

            }

            override fun onStopTrackingTouch(seek: SeekBar) {

            }
            })
    }
}
