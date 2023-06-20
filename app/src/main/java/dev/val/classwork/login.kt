package dev.`val`.classwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.`val`.classwork.databinding.ActivityLoginBinding
import dev.`val`.classwork.databinding.ActivityMainBinding

class login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_login)
    }

    override fun onResume() {
        super.onResume()


    }
}