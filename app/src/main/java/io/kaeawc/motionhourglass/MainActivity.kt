package io.kaeawc.motionhourglass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        start_button?.setOnClickListener {
            motion_scene?.setTransition(R.id.full_1, R.id.empty_1)
            motion_scene?.progress = 0f
            motion_scene?.transitionToEnd()
        }
    }
}
