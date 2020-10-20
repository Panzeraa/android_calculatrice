package com.mbds.calculatrice

import android.R
import android.os.Bundle
import android.text.method.TextKeyListener.clear
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.mbds.calculatrice.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var un : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(baseContext))
        setContentView(binding.root)

        initViews()
    }


    private fun initViews(){
        binding.un.setOnClickListener(){
            buttonListener(binding.un)
        }
        binding.deux.setOnClickListener(){
            buttonListener(binding.deux)
        }
binding.trois.setOnClickListener(){
            buttonListener(binding.trois)
        }
        binding.quatre.setOnClickListener(){
            buttonListener(binding.quatre)
        }
        binding.cinq.setOnClickListener(){
            buttonListener(binding.cinq)
        }
        binding.six.setOnClickListener(){
            buttonListener(binding.six)
        }
        binding.sept.setOnClickListener(){
            buttonListener(binding.sept)
        }
        binding.huit.setOnClickListener(){
            buttonListener(binding.huit)
        }
        binding.neuf.setOnClickListener(){
            buttonListener(binding.neuf)
        }
        binding.divise.setOnClickListener(){
            buttonListener(binding.divise)
        }
        binding.plus.setOnClickListener(){
            buttonListener(binding.plus)
        }


        //        mailInput = findViewById(R.id.username)
//        passwordInput = findViewById(R.id.password)
////        loginButton.isEnabled = true
//        loginButton.setOnClickListener(){
//            if(!mailInput.text.isNullOrBlank() && !passwordInput.text.isNullOrBlank()) {
//                val intent = Intent(baseContext, MainActivity::class.java)
//
//                startActivity(intent)
//            }
//            else{
//                Toast.makeText(baseContext, "Erreur", Toast.LENGTH_SHORT).show()
//
//            }
//        }
    }

    private fun buttonListener(EditView: TextView) {
        binding.expression.append(EditView.text)
    }


    override fun onResume() {
        super.onResume()
//        loginButton.isEnabled = false
    }

}

