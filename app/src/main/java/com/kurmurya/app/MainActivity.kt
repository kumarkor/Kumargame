
package com.kurmurya.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(30, 30, 30, 30)
        layout.setBackgroundColor(Color.WHITE)

        val title = TextView(this)
        title.text = "WELCOME TO KURMURYA"
        title.textSize = 25f
        title.setTextColor(Color.BLACK)
        title.gravity = Gravity.CENTER

        val button = Button(this)
        button.text = "GET STARTED"

        button.setOnClickListener {
            Toast.makeText(this, "Welcome to KURMURYA!", Toast.LENGTH_SHORT).show()
        }

        layout.addView(title)
        layout.addView(button)

        setContentView(layout)
    }
}
