package com.cemalettinaltintas.kotlinsimplecalculator

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat.enableEdgeToEdge
import androidx.core.view.WindowInsetsCompat
import com.cemalettinaltintas.kotlinsimplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var myString: String
    private lateinit var binding: ActivityMainBinding

    var number1: Int? = null
    var number2: Int? = null
    var result: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun mySum(view: View) {

        number1 = binding.editText.text.toString().toIntOrNull()
        number2 = binding.editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {

            binding.resultText.text = "Error!"

        } else {
            result = number1!! + number2!!
            binding.resultText.text = "Result: $result"
        }


    }

    fun mySub(view: View) {

        number1 = binding.editText.text.toString().toIntOrNull()
        number2 = binding.editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {

            binding.resultText.text = "Error!"

        } else {
            result = number1!! - number2!!
            binding.resultText.text = "Result: $result"
        }


    }

    fun myMultiply(view: View) {

        number1 = binding.editText.text.toString().toIntOrNull()
        number2 = binding.editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {

            binding.resultText.text = "Error!"

        } else {
            result = number1!! * number2!!
            binding.resultText.text = "Result: $result"
        }


    }

    fun myDiv(view: View) {

        number1 = binding.editText.text.toString().toIntOrNull()
        number2 = binding.editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {

            binding.resultText.text = "Error!"

        } else {
            result = number1!! / number2!!
            binding.resultText.text = "Result: $result"
        }

    }
}