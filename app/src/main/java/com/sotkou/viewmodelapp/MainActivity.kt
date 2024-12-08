package com.sotkou.viewmodelapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.sotkou.viewmodelapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var counter = 0

    lateinit var counterViewModel: CounterViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //setContentView(R.layout.activity_main)

        var binding = DataBindingUtil
            .setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        /*
        binding.button.setOnClickListener {
            counter++
            binding.textView2.text = counter.toString()
        }*/

        // Αρχικοποιούμε το viewmodel
        counterViewModel = ViewModelProvider(this).get(CounterViewModel::class.java)
/*
        // βάζουμε την τιμή του counter στο textview
        binding.textView2.text = counterViewModel.getCurentCounter().toString()

        binding.button.setOnClickListener {
            counterViewModel.incrementCounter()
            // Θέτουμε την τιμή μετα την αύξηση του counter
            binding.textView2.text = counterViewModel.getCurentCounter().toString()
        }
         */

        // Όταν έχουμε να κάνουμε με LiveData, πρέπει να
        // χρησιμοποιούμε lifecycleOwner property
        binding.lifecycleOwner = this
        // Προσθέτουμε το viewmodel στο binding
        binding.myViewModel = counterViewModel


    }
}