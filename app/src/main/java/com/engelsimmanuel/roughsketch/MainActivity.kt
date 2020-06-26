package com.engelsimmanuel.roughsketch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        info_text.text =
            "0 to 9999 is quite a large range. You may need to wait up to 10 seconds.\nAvoid pressing the button multiple times during computation. You may crash the system.\nAfter computation, scroll down to see the rest of the numbers."

        run_button.setOnClickListener {
            show_text.text = ""
            for (i in 0 until 10000) {
                show_text.append("$i\n")
            }

        }

    }
}
