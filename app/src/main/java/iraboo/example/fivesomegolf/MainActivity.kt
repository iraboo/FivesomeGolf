package iraboo.example.fivesomegolf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        resultButton.setOnClickListener {

            var p1Score = 0
            //p1Score = h1p1EditText.text.toString().toInt() + h2p1EditText.text.toString().toInt()
            //scorep1TextView.text = p1Score.toString()

        }
    }
}
