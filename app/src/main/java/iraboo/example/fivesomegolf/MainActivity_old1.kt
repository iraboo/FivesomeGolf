package iraboo.example.fivesomegolf

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ToggleButton
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity_old1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var hWeight = IntArray(18,{1})

        var p1ScoreTable = IntArray(18,{0})
        var p2ScoreTable = IntArray(18,{0})
        var p3ScoreTable = IntArray(18,{0})
        var p4ScoreTable = IntArray(18,{0})
        var p5ScoreTable = IntArray(18,{0})


        editText10.setOnClickListener {

            if(editText10.isChecked) {
                editText10.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[0] = 2 }
            else {
                editText10.setBackgroundResource(R.drawable.customerborder2)
                hWeight[0] = 1 }
        }

        editText20.setOnClickListener {

            if(editText10.isChecked) {
                editText20.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[1] = 2 }
            else {
                editText20.setBackgroundResource(R.drawable.customerborder2)
                hWeight[1] = 1 }
        }

        editText30.setOnClickListener {

            if(editText10.isChecked) {
                editText30.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[2] = 2 }
            else {
                editText30.setBackgroundResource(R.drawable.customerborder2)
                hWeight[2] = 1 }
        }

        editText40.setOnClickListener {

            if(editText40.isChecked) {
                editText40.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[3] = 2 }
            else {
                editText40.setBackgroundResource(R.drawable.customerborder2)
                hWeight[3] = 1 }
        }

        editText50.setOnClickListener {

            if(editText50.isChecked) {
                editText50.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[4] = 2 }
            else {
                editText50.setBackgroundResource(R.drawable.customerborder2)
                hWeight[4] = 1 }
        }

        editText60.setOnClickListener {

            if(editText60.isChecked) {
                editText60.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[5] = 2 }
            else {
                editText60.setBackgroundResource(R.drawable.customerborder2)
                hWeight[5] = 1 }
        }

        editText70.setOnClickListener {

            if(editText70.isChecked) {
                editText70.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[6] = 2 }
            else {
                editText70.setBackgroundResource(R.drawable.customerborder2)
                hWeight[6] = 1 }
        }

        editText80.setOnClickListener {

            if(editText80.isChecked) {
                editText80.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[7] = 2 }
            else {
                editText80.setBackgroundResource(R.drawable.customerborder2)
                hWeight[7] = 1 }
        }

        editText90.setOnClickListener {

            if(editText90.isChecked) {
                editText90.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[8] = 2 }
            else {
                editText90.setBackgroundResource(R.drawable.customerborder2)
                hWeight[8] = 1 }
        }

        editText100.setOnClickListener {

            if(editText100.isChecked) {
                editText100.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[9] = 2 }
            else {
                editText100.setBackgroundResource(R.drawable.customerborder2)
                hWeight[9] = 1 }
        }

        editText110.setOnClickListener {

            if(editText110.isChecked) {
                editText110.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[10] = 2 }
            else {
                editText110.setBackgroundResource(R.drawable.customerborder2)
                hWeight[10] = 1 }
        }

        editText120.setOnClickListener {

            if(editText120.isChecked) {
                editText120.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[11] = 2 }
            else {
                editText120.setBackgroundResource(R.drawable.customerborder2)
                hWeight[11] = 1 }
        }

        editText130.setOnClickListener {

            if(editText130.isChecked) {
                editText130.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[12] = 2 }
            else {
                editText130.setBackgroundResource(R.drawable.customerborder2)
                hWeight[12] = 1 }
        }

        editText140.setOnClickListener {

            if(editText140.isChecked) {
                editText140.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[13] = 2 }
            else {
                editText140.setBackgroundResource(R.drawable.customerborder2)
                hWeight[13] = 1 }
        }

        editText150.setOnClickListener {

            if(editText150.isChecked) {
                editText150.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[14] = 2 }
            else {
                editText150.setBackgroundResource(R.drawable.customerborder2)
                hWeight[14] = 1 }
        }

        editText160.setOnClickListener {

            if(editText160.isChecked) {
                editText160.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[15] = 2 }
            else {
                editText160.setBackgroundResource(R.drawable.customerborder2)
                hWeight[15] = 1 }
        }

        editText170.setOnClickListener {

            if(editText170.isChecked) {
                editText170.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[16] = 2 }
            else {
                editText170.setBackgroundResource(R.drawable.customerborder2)
                hWeight[16] = 1 }
        }

        editText180.setOnClickListener {

            if(editText180.isChecked) {
                editText180.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[17] = 2 }
            else {
                editText180.setBackgroundResource(R.drawable.customerborder2)
                hWeight[17] = 1 }
        }

        editText190.setOnClickListener {

            var p1Score = editText00.text.toString().toInt()
            var p2Score = editText00.text.toString().toInt()
            var p3Score = editText00.text.toString().toInt()
            var p4Score = editText00.text.toString().toInt()
            var p5Score = editText00.text.toString().toInt()

            p1ScoreTable[0] = editText11.text.toString().toInt()
            p1ScoreTable[1] = editText21.text.toString().toInt()
            p1ScoreTable[2] = editText31.text.toString().toInt()
            p1ScoreTable[3] = editText41.text.toString().toInt()
            p1ScoreTable[4] = editText51.text.toString().toInt()
            p1ScoreTable[5] = editText61.text.toString().toInt()
            p1ScoreTable[6] = editText71.text.toString().toInt()
            p1ScoreTable[7] = editText81.text.toString().toInt()
            p1ScoreTable[8] = editText91.text.toString().toInt()
            p1ScoreTable[9] = editText101.text.toString().toInt()
            p1ScoreTable[10] = editText111.text.toString().toInt()
            p1ScoreTable[11] = editText121.text.toString().toInt()
            p1ScoreTable[12] = editText131.text.toString().toInt()
            p1ScoreTable[13] = editText141.text.toString().toInt()
            p1ScoreTable[14] = editText151.text.toString().toInt()
            p1ScoreTable[15] = editText161.text.toString().toInt()
            p1ScoreTable[16] = editText171.text.toString().toInt()
            p1ScoreTable[17] = editText181.text.toString().toInt()

            p2ScoreTable[0] = editText12.text.toString().toInt()
            p2ScoreTable[1] = editText22.text.toString().toInt()
            p2ScoreTable[2] = editText32.text.toString().toInt()
            p2ScoreTable[3] = editText42.text.toString().toInt()
            p2ScoreTable[4] = editText52.text.toString().toInt()
            p2ScoreTable[5] = editText62.text.toString().toInt()
            p2ScoreTable[6] = editText72.text.toString().toInt()
            p2ScoreTable[7] = editText82.text.toString().toInt()
            p2ScoreTable[8] = editText92.text.toString().toInt()
            p2ScoreTable[9] = editText102.text.toString().toInt()
            p2ScoreTable[10] = editText112.text.toString().toInt()
            p2ScoreTable[11] = editText122.text.toString().toInt()
            p2ScoreTable[12] = editText132.text.toString().toInt()
            p2ScoreTable[13] = editText142.text.toString().toInt()
            p2ScoreTable[14] = editText152.text.toString().toInt()
            p2ScoreTable[15] = editText162.text.toString().toInt()
            p2ScoreTable[16] = editText172.text.toString().toInt()
            p2ScoreTable[17] = editText182.text.toString().toInt()

            p3ScoreTable[0] = editText13.text.toString().toInt()
            p3ScoreTable[1] = editText23.text.toString().toInt()
            p3ScoreTable[2] = editText33.text.toString().toInt()
            p3ScoreTable[3] = editText43.text.toString().toInt()
            p3ScoreTable[4] = editText53.text.toString().toInt()
            p3ScoreTable[5] = editText63.text.toString().toInt()
            p3ScoreTable[6] = editText73.text.toString().toInt()
            p3ScoreTable[7] = editText83.text.toString().toInt()
            p3ScoreTable[8] = editText93.text.toString().toInt()
            p3ScoreTable[9] = editText103.text.toString().toInt()
            p3ScoreTable[10] = editText113.text.toString().toInt()
            p3ScoreTable[11] = editText123.text.toString().toInt()
            p3ScoreTable[12] = editText133.text.toString().toInt()
            p3ScoreTable[13] = editText143.text.toString().toInt()
            p3ScoreTable[14] = editText153.text.toString().toInt()
            p3ScoreTable[15] = editText163.text.toString().toInt()
            p3ScoreTable[16] = editText173.text.toString().toInt()
            p3ScoreTable[17] = editText183.text.toString().toInt()

            p4ScoreTable[0] = editText14.text.toString().toInt()
            p4ScoreTable[1] = editText24.text.toString().toInt()
            p4ScoreTable[2] = editText34.text.toString().toInt()
            p4ScoreTable[3] = editText44.text.toString().toInt()
            p4ScoreTable[4] = editText54.text.toString().toInt()
            p4ScoreTable[5] = editText64.text.toString().toInt()
            p4ScoreTable[6] = editText74.text.toString().toInt()
            p4ScoreTable[7] = editText84.text.toString().toInt()
            p4ScoreTable[8] = editText94.text.toString().toInt()
            p4ScoreTable[9] = editText104.text.toString().toInt()
            p4ScoreTable[10] = editText114.text.toString().toInt()
            p4ScoreTable[11] = editText124.text.toString().toInt()
            p4ScoreTable[12] = editText134.text.toString().toInt()
            p4ScoreTable[13] = editText144.text.toString().toInt()
            p4ScoreTable[14] = editText154.text.toString().toInt()
            p4ScoreTable[15] = editText164.text.toString().toInt()
            p4ScoreTable[16] = editText174.text.toString().toInt()
            p4ScoreTable[17] = editText184.text.toString().toInt()

            p5ScoreTable[0] = editText15.text.toString().toInt()
            p5ScoreTable[1] = editText25.text.toString().toInt()
            p5ScoreTable[2] = editText35.text.toString().toInt()
            p5ScoreTable[3] = editText45.text.toString().toInt()
            p5ScoreTable[4] = editText55.text.toString().toInt()
            p5ScoreTable[5] = editText65.text.toString().toInt()
            p5ScoreTable[6] = editText75.text.toString().toInt()
            p5ScoreTable[7] = editText85.text.toString().toInt()
            p5ScoreTable[8] = editText95.text.toString().toInt()
            p5ScoreTable[9] = editText105.text.toString().toInt()
            p5ScoreTable[10] = editText115.text.toString().toInt()
            p5ScoreTable[11] = editText125.text.toString().toInt()
            p5ScoreTable[12] = editText135.text.toString().toInt()
            p5ScoreTable[13] = editText145.text.toString().toInt()
            p5ScoreTable[14] = editText155.text.toString().toInt()
            p5ScoreTable[15] = editText165.text.toString().toInt()
            p5ScoreTable[16] = editText175.text.toString().toInt()
            p5ScoreTable[17] = editText185.text.toString().toInt()


            for ( i in p1ScoreTable.indices) {
                p1Score = p1Score + p1ScoreTable[i]
            }

            for ( i in p2ScoreTable.indices) {
                p2Score = p2Score + p2ScoreTable[i]
            }

            for ( i in p3ScoreTable.indices) {
                p3Score = p3Score + p3ScoreTable[i]
            }

            for ( i in p4ScoreTable.indices) {
                p4Score = p4Score + p4ScoreTable[i]
            }

            for ( i in p5ScoreTable.indices) {
                p5Score = p5Score + p5ScoreTable[i]
            }


            editText191.text = p1Score.toString()
            editText192.text = p2Score.toString()
            editText193.text = p3Score.toString()
            editText194.text = p4Score.toString()
            editText195.text = p5Score.toString()
        }

        editText200.setOnClickListener {

            var p1Sum = 0
            var p2Sum = 0
            var p3Sum = 0
            var p4Sum = 0
            var p5Sum = 0


            for ( i in hWeight.indices) {
                p1Sum = p1Sum + hWeight[i]*p1ScoreTable[i]
            }

            for ( i in hWeight.indices) {
                p2Sum = p2Sum + hWeight[i]*p2ScoreTable[i]
            }

            for ( i in hWeight.indices) {
                p3Sum = p3Sum + hWeight[i]*p3ScoreTable[i]
            }

            for ( i in hWeight.indices) {
                p4Sum = p4Sum + hWeight[i]*p4ScoreTable[i]
            }

            for ( i in hWeight.indices) {
                p5Sum = p5Sum + hWeight[i]*p5ScoreTable[i]
            }


            editText201.text = p1Sum.toString()
            editText202.text = p2Sum.toString()
            editText203.text = p3Sum.toString()
            editText204.text = p4Sum.toString()
            editText205.text = p5Sum.toString()

        }

        resultButton.setOnClickListener {

        }
    }
}

