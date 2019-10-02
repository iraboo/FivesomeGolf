package iraboo.example.fivesomegolf

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ToggleButton
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity_old : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var h1Weight = 1
        var h2Weight = 1
        var h3Weight = 1
        var h4Weight = 1
        var h5Weight = 1
        var h6Weight = 1
        var h7Weight = 1
        var h8Weight = 1
        var h9Weight = 1
        var h10Weight = 1
        var h11Weight = 1
        var h12Weight = 1
        var h13Weight = 1
        var h14Weight = 1
        var h15Weight = 1
        var h16Weight = 1
        var h17Weight = 1
        var h18Weight = 1

        var p1Score = 0
        var p2Score = 0
        var p3Score = 0
        var p4Score = 0
        var p5Score = 0

        var p1Sum = 0
        var p2Sum = 0
        var p3Sum = 0
        var p4Sum = 0
        var p5Sum = 0

        editText10.setOnClickListener {

            if(editText10.isChecked) {
                editText10.setBackgroundColor(Color.rgb(255,153,153))
                h1Weight = 2 }
            else {
                editText10.setBackgroundResource(R.drawable.customerborder2)
                h1Weight = 1 }
        }

        editText20.setOnClickListener {

            if(editText20.isChecked) {
                editText20.setBackgroundColor(Color.rgb(255,153,153))
                h2Weight = 2 }
            else {
                editText20.setBackgroundResource(R.drawable.customerborder2)
                h2Weight = 1 }
        }

        editText30.setOnClickListener {

            if(editText30.isChecked) {
                editText30.setBackgroundColor(Color.rgb(255,153,153))
                h3Weight = 2 }
            else {
                editText30.setBackgroundResource(R.drawable.customerborder2)
                h3Weight = 1 }
        }

        editText40.setOnClickListener {

            if(editText40.isChecked) {
                editText40.setBackgroundColor(Color.rgb(255,153,153))
                h4Weight = 2 }
            else {
                editText40.setBackgroundResource(R.drawable.customerborder2)
                h4Weight = 1 }
        }

        editText50.setOnClickListener {

            if(editText50.isChecked) {
                editText50.setBackgroundColor(Color.rgb(255,153,153))
                h5Weight = 2 }
            else {
                editText50.setBackgroundResource(R.drawable.customerborder2)
                h5Weight = 1 }
        }

        editText60.setOnClickListener {

            if(editText60.isChecked) {
                editText60.setBackgroundColor(Color.rgb(255,153,153))
                h6Weight = 2 }
            else {
                editText60.setBackgroundResource(R.drawable.customerborder2)
                h6Weight = 1 }
        }

        editText70.setOnClickListener {

            if(editText70.isChecked) {
                editText70.setBackgroundColor(Color.rgb(255,153,153))
                h7Weight = 2 }
            else {
                editText70.setBackgroundResource(R.drawable.customerborder2)
                h7Weight = 1 }
        }

        editText80.setOnClickListener {

            if(editText80.isChecked) {
                editText80.setBackgroundColor(Color.rgb(255,153,153))
                h8Weight = 2 }
            else {
                editText80.setBackgroundResource(R.drawable.customerborder2)
                h8Weight = 1 }
        }

        editText90.setOnClickListener {

            if(editText90.isChecked) {
                editText90.setBackgroundColor(Color.rgb(255,153,153))
                h9Weight = 2 }
            else {
                editText90.setBackgroundResource(R.drawable.customerborder2)
                h9Weight = 1 }
        }

        editText100.setOnClickListener {

            if(editText100.isChecked) {
                editText100.setBackgroundColor(Color.rgb(255,153,153))
                h10Weight = 2 }
            else {
                editText100.setBackgroundResource(R.drawable.customerborder2)
                h10Weight = 1 }
        }

        editText110.setOnClickListener {

            if(editText110.isChecked) {
                editText110.setBackgroundColor(Color.rgb(255,153,153))
                h11Weight = 2 }
            else {
                editText110.setBackgroundResource(R.drawable.customerborder2)
                h11Weight = 1 }
        }

        editText120.setOnClickListener {

            if(editText120.isChecked) {
                editText120.setBackgroundColor(Color.rgb(255,153,153))
                h12Weight = 2 }
            else {
                editText120.setBackgroundResource(R.drawable.customerborder2)
                h12Weight = 1 }
        }

        editText130.setOnClickListener {

            if(editText130.isChecked) {
                editText130.setBackgroundColor(Color.rgb(255,153,153))
                h13Weight = 2 }
            else {
                editText130.setBackgroundResource(R.drawable.customerborder2)
                h13Weight = 1 }
        }

        editText140.setOnClickListener {

            if(editText140.isChecked) {
                editText140.setBackgroundColor(Color.rgb(255,153,153))
                h14Weight = 2 }
            else {
                editText140.setBackgroundResource(R.drawable.customerborder2)
                h14Weight = 1 }
        }

        editText150.setOnClickListener {

            if(editText150.isChecked) {
                editText150.setBackgroundColor(Color.rgb(255,153,153))
                h15Weight = 2 }
            else {
                editText150.setBackgroundResource(R.drawable.customerborder2)
                h15Weight = 1 }
        }

        editText160.setOnClickListener {

            if(editText160.isChecked) {
                editText160.setBackgroundColor(Color.rgb(255,153,153))
                h16Weight = 2 }
            else {
                editText160.setBackgroundResource(R.drawable.customerborder2)
                h16Weight = 1 }
        }

        editText170.setOnClickListener {

            if(editText170.isChecked) {
                editText170.setBackgroundColor(Color.rgb(255,153,153))
                h17Weight = 2 }
            else {
                editText170.setBackgroundResource(R.drawable.customerborder2)
                h17Weight = 1 }
        }

        editText180.setOnClickListener {

            if(editText180.isChecked) {
                editText180.setBackgroundColor(Color.rgb(255,153,153))
                h18Weight = 2 }
            else {
                editText180.setBackgroundResource(R.drawable.customerborder2)
                h18Weight = 1 }
        }

        editText190.setOnClickListener {



            p1Score = editText00.text.toString().toInt() +
                    editText11.text.toString().toInt() + editText21.text.toString().toInt() +
                    editText31.text.toString().toInt() + editText41.text.toString().toInt() +
                    editText51.text.toString().toInt() + editText61.text.toString().toInt() +
                    editText71.text.toString().toInt() + editText81.text.toString().toInt() +
                    editText91.text.toString().toInt() + editText101.text.toString().toInt() +
                    editText111.text.toString().toInt() + editText121.text.toString().toInt() +
                    editText131.text.toString().toInt() + editText141.text.toString().toInt() +
                    editText151.text.toString().toInt() + editText161.text.toString().toInt() +
                    editText171.text.toString().toInt() + editText181.text.toString().toInt()

            p2Score = editText00.text.toString().toInt() +
                    editText12.text.toString().toInt() + editText22.text.toString().toInt() +
                    editText32.text.toString().toInt() + editText42.text.toString().toInt() +
                    editText52.text.toString().toInt() + editText62.text.toString().toInt() +
                    editText72.text.toString().toInt() + editText82.text.toString().toInt() +
                    editText92.text.toString().toInt() + editText102.text.toString().toInt() +
                    editText112.text.toString().toInt() + editText122.text.toString().toInt() +
                    editText132.text.toString().toInt() + editText142.text.toString().toInt() +
                    editText152.text.toString().toInt() + editText162.text.toString().toInt() +
                    editText172.text.toString().toInt() + editText182.text.toString().toInt()

            p3Score = editText00.text.toString().toInt() +
                    editText13.text.toString().toInt() + editText23.text.toString().toInt() +
                    editText33.text.toString().toInt() + editText43.text.toString().toInt() +
                    editText53.text.toString().toInt() + editText63.text.toString().toInt() +
                    editText73.text.toString().toInt() + editText83.text.toString().toInt() +
                    editText93.text.toString().toInt() + editText103.text.toString().toInt() +
                    editText113.text.toString().toInt() + editText123.text.toString().toInt() +
                    editText133.text.toString().toInt() + editText143.text.toString().toInt() +
                    editText153.text.toString().toInt() + editText163.text.toString().toInt() +
                    editText173.text.toString().toInt() + editText183.text.toString().toInt()

            p4Score = editText00.text.toString().toInt() +
                    editText14.text.toString().toInt() + editText24.text.toString().toInt() +
                    editText34.text.toString().toInt() + editText44.text.toString().toInt() +
                    editText54.text.toString().toInt() + editText64.text.toString().toInt() +
                    editText74.text.toString().toInt() + editText84.text.toString().toInt() +
                    editText94.text.toString().toInt() + editText104.text.toString().toInt() +
                    editText114.text.toString().toInt() + editText124.text.toString().toInt() +
                    editText134.text.toString().toInt() + editText144.text.toString().toInt() +
                    editText154.text.toString().toInt() + editText164.text.toString().toInt() +
                    editText174.text.toString().toInt() + editText184.text.toString().toInt()

            p5Score = editText00.text.toString().toInt() +
                    editText15.text.toString().toInt() + editText25.text.toString().toInt() +
                    editText35.text.toString().toInt() + editText45.text.toString().toInt() +
                    editText55.text.toString().toInt() + editText65.text.toString().toInt() +
                    editText75.text.toString().toInt() + editText85.text.toString().toInt() +
                    editText95.text.toString().toInt() + editText105.text.toString().toInt() +
                    editText115.text.toString().toInt() + editText125.text.toString().toInt() +
                    editText135.text.toString().toInt() + editText145.text.toString().toInt() +
                    editText155.text.toString().toInt() + editText165.text.toString().toInt() +
                    editText175.text.toString().toInt() + editText185.text.toString().toInt()

            editText191.text = p1Score.toString()
            editText192.text = p2Score.toString()
            editText193.text = p3Score.toString()
            editText194.text = p4Score.toString()
            editText195.text = p5Score.toString()
        }

        editText200.setOnClickListener {



            p1Sum = h1Weight*(editText11.text.toString().toInt()) + h2Weight*(editText21.text.toString().toInt()) +
                    h3Weight*(editText31.text.toString().toInt()) + h4Weight*(editText41.text.toString().toInt()) +
                    h5Weight*(editText51.text.toString().toInt()) + h6Weight*(editText61.text.toString().toInt()) +
                    h7Weight*(editText71.text.toString().toInt()) + h8Weight*(editText81.text.toString().toInt()) +
                    h9Weight*(editText91.text.toString().toInt()) + h10Weight*(editText101.text.toString().toInt()) +
                    h11Weight*(editText111.text.toString().toInt()) + h12Weight*(editText121.text.toString().toInt()) +
                    h13Weight*(editText131.text.toString().toInt()) + h14Weight*(editText141.text.toString().toInt()) +
                    h15Weight*(editText151.text.toString().toInt()) + h16Weight*(editText161.text.toString().toInt()) +
                    h17Weight*(editText171.text.toString().toInt()) + h18Weight*(editText181.text.toString().toInt())

            p2Sum = h1Weight*(editText12.text.toString().toInt()) + h2Weight*(editText22.text.toString().toInt()) +
                    h3Weight*(editText32.text.toString().toInt()) + h4Weight*(editText42.text.toString().toInt()) +
                    h5Weight*(editText52.text.toString().toInt()) + h6Weight*(editText62.text.toString().toInt()) +
                    h7Weight*(editText72.text.toString().toInt()) + h8Weight*(editText82.text.toString().toInt()) +
                    h9Weight*(editText92.text.toString().toInt()) + h10Weight*(editText102.text.toString().toInt()) +
                    h11Weight*(editText112.text.toString().toInt()) + h12Weight*(editText122.text.toString().toInt()) +
                    h13Weight*(editText132.text.toString().toInt()) + h14Weight*(editText142.text.toString().toInt()) +
                    h15Weight*(editText152.text.toString().toInt()) + h16Weight*(editText162.text.toString().toInt()) +
                    h17Weight*(editText172.text.toString().toInt()) + h18Weight*(editText182.text.toString().toInt())

            p3Sum = h1Weight*(editText13.text.toString().toInt()) + h2Weight*(editText23.text.toString().toInt()) +
                    h3Weight*(editText33.text.toString().toInt()) + h4Weight*(editText43.text.toString().toInt()) +
                    h5Weight*(editText53.text.toString().toInt()) + h6Weight*(editText63.text.toString().toInt()) +
                    h7Weight*(editText73.text.toString().toInt()) + h8Weight*(editText83.text.toString().toInt()) +
                    h9Weight*(editText93.text.toString().toInt()) + h10Weight*(editText103.text.toString().toInt()) +
                    h11Weight*(editText113.text.toString().toInt()) + h12Weight*(editText123.text.toString().toInt()) +
                    h13Weight*(editText133.text.toString().toInt()) + h14Weight*(editText143.text.toString().toInt()) +
                    h15Weight*(editText153.text.toString().toInt()) + h16Weight*(editText163.text.toString().toInt()) +
                    h17Weight*(editText173.text.toString().toInt()) + h18Weight*(editText183.text.toString().toInt())

            p4Sum = h1Weight*(editText14.text.toString().toInt()) + h2Weight*(editText24.text.toString().toInt()) +
                    h3Weight*(editText34.text.toString().toInt()) + h4Weight*(editText44.text.toString().toInt()) +
                    h5Weight*(editText54.text.toString().toInt()) + h6Weight*(editText64.text.toString().toInt()) +
                    h7Weight*(editText74.text.toString().toInt()) + h8Weight*(editText84.text.toString().toInt()) +
                    h9Weight*(editText94.text.toString().toInt()) + h10Weight*(editText104.text.toString().toInt()) +
                    h11Weight*(editText114.text.toString().toInt()) + h12Weight*(editText124.text.toString().toInt()) +
                    h13Weight*(editText134.text.toString().toInt()) + h14Weight*(editText144.text.toString().toInt()) +
                    h15Weight*(editText154.text.toString().toInt()) + h16Weight*(editText164.text.toString().toInt()) +
                    h17Weight*(editText174.text.toString().toInt()) + h18Weight*(editText184.text.toString().toInt())

            p5Sum = h1Weight*(editText15.text.toString().toInt()) + h2Weight*(editText25.text.toString().toInt()) +
                    h3Weight*(editText35.text.toString().toInt()) + h4Weight*(editText45.text.toString().toInt()) +
                    h5Weight*(editText55.text.toString().toInt()) + h6Weight*(editText65.text.toString().toInt()) +
                    h7Weight*(editText75.text.toString().toInt()) + h8Weight*(editText85.text.toString().toInt()) +
                    h9Weight*(editText95.text.toString().toInt()) + h10Weight*(editText105.text.toString().toInt()) +
                    h11Weight*(editText115.text.toString().toInt()) + h12Weight*(editText125.text.toString().toInt()) +
                    h13Weight*(editText135.text.toString().toInt()) + h14Weight*(editText145.text.toString().toInt()) +
                    h15Weight*(editText155.text.toString().toInt()) + h16Weight*(editText165.text.toString().toInt()) +
                    h17Weight*(editText175.text.toString().toInt()) + h18Weight*(editText185.text.toString().toInt())

            editText201.text = p1Sum.toString()
            editText202.text = p2Sum.toString()
            editText203.text = p3Sum.toString()
            editText204.text = p4Sum.toString()
            editText205.text = p5Sum.toString()

        }

        resultButton.setOnClickListener {

            p1Score = editText00.text.toString().toInt() +
                    editText11.text.toString().toInt() + editText21.text.toString().toInt() +
                    editText31.text.toString().toInt() + editText41.text.toString().toInt() +
                    editText51.text.toString().toInt() + editText61.text.toString().toInt() +
                    editText71.text.toString().toInt() + editText81.text.toString().toInt() +
                    editText91.text.toString().toInt() + editText101.text.toString().toInt() +
                    editText111.text.toString().toInt() + editText121.text.toString().toInt() +
                    editText131.text.toString().toInt() + editText141.text.toString().toInt() +
                    editText151.text.toString().toInt() + editText161.text.toString().toInt() +
                    editText171.text.toString().toInt() + editText181.text.toString().toInt()

            p2Score = editText00.text.toString().toInt() +
                    editText12.text.toString().toInt() + editText22.text.toString().toInt() +
                    editText32.text.toString().toInt() + editText42.text.toString().toInt() +
                    editText52.text.toString().toInt() + editText62.text.toString().toInt() +
                    editText72.text.toString().toInt() + editText82.text.toString().toInt() +
                    editText92.text.toString().toInt() + editText102.text.toString().toInt() +
                    editText112.text.toString().toInt() + editText122.text.toString().toInt() +
                    editText132.text.toString().toInt() + editText142.text.toString().toInt() +
                    editText152.text.toString().toInt() + editText162.text.toString().toInt() +
                    editText172.text.toString().toInt() + editText182.text.toString().toInt()

            p3Score = editText00.text.toString().toInt() +
                    editText13.text.toString().toInt() + editText23.text.toString().toInt() +
                    editText33.text.toString().toInt() + editText43.text.toString().toInt() +
                    editText53.text.toString().toInt() + editText63.text.toString().toInt() +
                    editText73.text.toString().toInt() + editText83.text.toString().toInt() +
                    editText93.text.toString().toInt() + editText103.text.toString().toInt() +
                    editText113.text.toString().toInt() + editText123.text.toString().toInt() +
                    editText133.text.toString().toInt() + editText143.text.toString().toInt() +
                    editText153.text.toString().toInt() + editText163.text.toString().toInt() +
                    editText173.text.toString().toInt() + editText183.text.toString().toInt()

            p4Score = editText00.text.toString().toInt() +
                    editText14.text.toString().toInt() + editText24.text.toString().toInt() +
                    editText34.text.toString().toInt() + editText44.text.toString().toInt() +
                    editText54.text.toString().toInt() + editText64.text.toString().toInt() +
                    editText74.text.toString().toInt() + editText84.text.toString().toInt() +
                    editText94.text.toString().toInt() + editText104.text.toString().toInt() +
                    editText114.text.toString().toInt() + editText124.text.toString().toInt() +
                    editText134.text.toString().toInt() + editText144.text.toString().toInt() +
                    editText154.text.toString().toInt() + editText164.text.toString().toInt() +
                    editText174.text.toString().toInt() + editText184.text.toString().toInt()

            p5Score = editText00.text.toString().toInt() +
                    editText15.text.toString().toInt() + editText25.text.toString().toInt() +
                    editText35.text.toString().toInt() + editText45.text.toString().toInt() +
                    editText55.text.toString().toInt() + editText65.text.toString().toInt() +
                    editText75.text.toString().toInt() + editText85.text.toString().toInt() +
                    editText95.text.toString().toInt() + editText105.text.toString().toInt() +
                    editText115.text.toString().toInt() + editText125.text.toString().toInt() +
                    editText135.text.toString().toInt() + editText145.text.toString().toInt() +
                    editText155.text.toString().toInt() + editText165.text.toString().toInt() +
                    editText175.text.toString().toInt() + editText185.text.toString().toInt()

            p1Sum = h1Weight*(editText11.text.toString().toInt()) + h2Weight*(editText21.text.toString().toInt()) +
                    h3Weight*(editText31.text.toString().toInt()) + h4Weight*(editText41.text.toString().toInt()) +
                    h5Weight*(editText51.text.toString().toInt()) + h6Weight*(editText61.text.toString().toInt()) +
                    h7Weight*(editText71.text.toString().toInt()) + h8Weight*(editText81.text.toString().toInt()) +
                    h9Weight*(editText91.text.toString().toInt()) + h10Weight*(editText101.text.toString().toInt()) +
                    h11Weight*(editText111.text.toString().toInt()) + h12Weight*(editText121.text.toString().toInt()) +
                    h13Weight*(editText131.text.toString().toInt()) + h14Weight*(editText141.text.toString().toInt()) +
                    h15Weight*(editText151.text.toString().toInt()) + h16Weight*(editText161.text.toString().toInt()) +
                    h17Weight*(editText171.text.toString().toInt()) + h18Weight*(editText181.text.toString().toInt())

            p2Sum = h1Weight*(editText12.text.toString().toInt()) + h2Weight*(editText22.text.toString().toInt()) +
                    h3Weight*(editText32.text.toString().toInt()) + h4Weight*(editText42.text.toString().toInt()) +
                    h5Weight*(editText52.text.toString().toInt()) + h6Weight*(editText62.text.toString().toInt()) +
                    h7Weight*(editText72.text.toString().toInt()) + h8Weight*(editText82.text.toString().toInt()) +
                    h9Weight*(editText92.text.toString().toInt()) + h10Weight*(editText102.text.toString().toInt()) +
                    h11Weight*(editText112.text.toString().toInt()) + h12Weight*(editText122.text.toString().toInt()) +
                    h13Weight*(editText132.text.toString().toInt()) + h14Weight*(editText142.text.toString().toInt()) +
                    h15Weight*(editText152.text.toString().toInt()) + h16Weight*(editText162.text.toString().toInt()) +
                    h17Weight*(editText172.text.toString().toInt()) + h18Weight*(editText182.text.toString().toInt())

            p3Sum = h1Weight*(editText13.text.toString().toInt()) + h2Weight*(editText23.text.toString().toInt()) +
                    h3Weight*(editText33.text.toString().toInt()) + h4Weight*(editText43.text.toString().toInt()) +
                    h5Weight*(editText53.text.toString().toInt()) + h6Weight*(editText63.text.toString().toInt()) +
                    h7Weight*(editText73.text.toString().toInt()) + h8Weight*(editText83.text.toString().toInt()) +
                    h9Weight*(editText93.text.toString().toInt()) + h10Weight*(editText103.text.toString().toInt()) +
                    h11Weight*(editText113.text.toString().toInt()) + h12Weight*(editText123.text.toString().toInt()) +
                    h13Weight*(editText133.text.toString().toInt()) + h14Weight*(editText143.text.toString().toInt()) +
                    h15Weight*(editText153.text.toString().toInt()) + h16Weight*(editText163.text.toString().toInt()) +
                    h17Weight*(editText173.text.toString().toInt()) + h18Weight*(editText183.text.toString().toInt())

            p4Sum = h1Weight*(editText14.text.toString().toInt()) + h2Weight*(editText24.text.toString().toInt()) +
                    h3Weight*(editText34.text.toString().toInt()) + h4Weight*(editText44.text.toString().toInt()) +
                    h5Weight*(editText54.text.toString().toInt()) + h6Weight*(editText64.text.toString().toInt()) +
                    h7Weight*(editText74.text.toString().toInt()) + h8Weight*(editText84.text.toString().toInt()) +
                    h9Weight*(editText94.text.toString().toInt()) + h10Weight*(editText104.text.toString().toInt()) +
                    h11Weight*(editText114.text.toString().toInt()) + h12Weight*(editText124.text.toString().toInt()) +
                    h13Weight*(editText134.text.toString().toInt()) + h14Weight*(editText144.text.toString().toInt()) +
                    h15Weight*(editText154.text.toString().toInt()) + h16Weight*(editText164.text.toString().toInt()) +
                    h17Weight*(editText174.text.toString().toInt()) + h18Weight*(editText184.text.toString().toInt())

            p5Sum = h1Weight*(editText15.text.toString().toInt()) + h2Weight*(editText25.text.toString().toInt()) +
                    h3Weight*(editText35.text.toString().toInt()) + h4Weight*(editText45.text.toString().toInt()) +
                    h5Weight*(editText55.text.toString().toInt()) + h6Weight*(editText65.text.toString().toInt()) +
                    h7Weight*(editText75.text.toString().toInt()) + h8Weight*(editText85.text.toString().toInt()) +
                    h9Weight*(editText95.text.toString().toInt()) + h10Weight*(editText105.text.toString().toInt()) +
                    h11Weight*(editText115.text.toString().toInt()) + h12Weight*(editText125.text.toString().toInt()) +
                    h13Weight*(editText135.text.toString().toInt()) + h14Weight*(editText145.text.toString().toInt()) +
                    h15Weight*(editText155.text.toString().toInt()) + h16Weight*(editText165.text.toString().toInt()) +
                    h17Weight*(editText175.text.toString().toInt()) + h18Weight*(editText185.text.toString().toInt())




            editText191.text = p1Score.toString()
            editText192.text = p2Score.toString()
            editText193.text = p3Score.toString()
            editText194.text = p4Score.toString()
            editText195.text = p5Score.toString()

            editText201.text = p1Sum.toString()
            editText202.text = p2Sum.toString()
            editText203.text = p3Sum.toString()
            editText204.text = p4Sum.toString()
            editText205.text = p5Sum.toString()

        }
    }
}

