package dev.`val`.classwork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dev.`val`.classwork.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView( binding.root)



    }
//linking happens here
    override fun onResume() {
        super.onResume()
    binding.etbutton.setOnClickListener { var intent = Intent(this,login::class.java)
        startActivity(intent)

        validateSignUp()
    }



    }

    fun validateSignUp(){
        val name = binding.etusername.text.toString()
        val email = binding.etemail.text.toString()
        val phone = binding.etphonenumber.text.toString()
        val password = binding.etpassword.text.toString()
        var error = false

        if (name.isBlank()){
            binding.tilusername.error = "User name is required"
            error = true
        }

        if (email.isBlank()){
            binding.tilemail.error = "Email is required"
            error = true
        }
        if (phone.isBlank()){
            binding.tilphonenumber.error = "Phone number is required"
            error = true
        }
        if (password.isBlank()){
            binding.tilpassword.error = "Password is required"
            error = true
        }

        if (!error){
            Toast.makeText(this,"Congratulation welcome to our app",Toast.LENGTH_LONG)
        }

    }


}