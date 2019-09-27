package iraboo.example.fivesomegolf

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ToggleButton
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var h1Weight = 1

        editText10.setOnClickListener {

            if(editText10.isChecked) {
                editText10.setBackgroundColor(Color.rgb(255,0,0))
                h1Weight = 2 }
            else {
                //editText10.setBackgroundColor(Color.rgb(255,255,255))
                editText10.setBackgroundResource(R.drawable.customerborder2)
                h1Weight = 1 }
        }

        resultButton.setOnClickListener {

            var p1Score = 0
            var p2Score = 0


            var h2Weight = 2
            var h3Weight = 1
            var h4Weight = 2
            var h5Weight = 1
            var h6Weight = 2
            var h7Weight = 1
            var h8Weight = 2
            var h9Weight = 1
            var h10Weight = 2
            var h11Weight = 1
            var h12Weight = 2
            var h13Weight = 1
            var h14Weight = 2
            var h15Weight = 1
            var h16Weight = 2
            var h17Weight = 1
            var h18Weight = 2



            var p1Sum = 0

            p1Score = editText11.text.toString().toInt() + editText21.text.toString().toInt() +
                    editText31.text.toString().toInt() + editText41.text.toString().toInt() +
                    editText51.text.toString().toInt() + editText61.text.toString().toInt() +
                    editText71.text.toString().toInt() + editText81.text.toString().toInt() +
                    editText91.text.toString().toInt() + editText101.text.toString().toInt() +
                    editText111.text.toString().toInt() + editText121.text.toString().toInt() +
                    editText131.text.toString().toInt() + editText141.text.toString().toInt() +
                    editText151.text.toString().toInt() + editText161.text.toString().toInt() +
                    editText171.text.toString().toInt() + editText181.text.toString().toInt()

            p2Score = editText12.text.toString().toInt() + editText22.text.toString().toInt() +
                    editText32.text.toString().toInt() + editText42.text.toString().toInt() +
                    editText52.text.toString().toInt() + editText62.text.toString().toInt() +
                    editText72.text.toString().toInt() + editText82.text.toString().toInt() +
                    editText92.text.toString().toInt() + editText102.text.toString().toInt() +
                    editText112.text.toString().toInt() + editText122.text.toString().toInt() +
                    editText132.text.toString().toInt() + editText142.text.toString().toInt() +
                    editText152.text.toString().toInt() + editText162.text.toString().toInt() +
                    editText172.text.toString().toInt() + editText182.text.toString().toInt()

            p1Sum = h1Weight*(editText11.text.toString().toInt()) + h2Weight*(editText21.text.toString().toInt()) +
                    h3Weight*(editText31.text.toString().toInt()) + h4Weight*(editText41.text.toString().toInt()) +
                    h5Weight*(editText51.text.toString().toInt()) + h6Weight*(editText61.text.toString().toInt()) +
                    h7Weight*(editText71.text.toString().toInt()) + h8Weight*(editText81.text.toString().toInt()) +
                    h9Weight*(editText91.text.toString().toInt()) + h10Weight*(editText101.text.toString().toInt()) +
                    h11Weight*(editText111.text.toString().toInt()) + h12Weight*(editText121.text.toString().toInt()) +
                    h13Weight*(editText131.text.toString().toInt()) + h14Weight*(editText141.text.toString().toInt()) +
                    h15Weight*(editText151.text.toString().toInt()) + h16Weight*(editText161.text.toString().toInt()) +
                    h17Weight*(editText171.text.toString().toInt()) + h18Weight*(editText181.text.toString().toInt())




            editText191.text = p1Score.toString()
            editText192.text = p2Score.toString()
            editText201.text = p1Sum.toString()

        }
    }
}

