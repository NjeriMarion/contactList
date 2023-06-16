package com.marion.twitterclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.marion.twitterclone.databinding.ActivityAddContactBinding
import com.marion.twitterclone.databinding.ActivityMainBinding

class AddContact : AppCompatActivity() {
    lateinit var binding:ActivityAddContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_add_contact)

    }
    override fun onResume() {
        super.onResume()
        binding = ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonSave.setOnClickListener {
            clearErrors()
//            validation()
            if(!validation()){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            }
//            else{
//                val intent = Intent(this, MainActivity::class.java)
//                startActivity(intent)}
        }
    }

    fun validation():Boolean {
        val name = binding.etName.text.toString()
        val contact = binding.etnumber.text.toString()
        val email = binding.etEmail.text.toString()
        val link = binding.etProfileImage.text.toString()
        var error = false
        var output = false

        if (name.isBlank()) {
            binding.tilName.error = "Enter contact name"
            error = true
        }
        if (contact.isBlank()) {
            binding.tilNumber.error = "Enter phone Number"
            error = true
        }
        if (email.isBlank()) {
            binding.tilEmail.error = "Enter E-mail"
            error = true
        }
        if (link.isBlank()) {
            binding.tilProfileImage.error = "Enter photolink"
            error = true
        }
        if (!error) {
            binding.tvresult.text= "Contact has been added successfully"
            output = true
        }
        return output
    }
    fun clearErrors() {
        binding.tilName.error = null
        binding.tilNumber.error = null
        binding.tilEmail.error = null
        binding.tilProfileImage.error = null
    }

}