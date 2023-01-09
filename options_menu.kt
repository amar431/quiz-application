package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class options_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options_menu)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.options_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.Settings -> {
                Toast.makeText(applicationContext, "settings Selected", Toast.LENGTH_LONG).show()
                true
            }
            R.id.Play -> {
                Toast.makeText(applicationContext, "play Selected", Toast.LENGTH_LONG).show()
                true
            }
            R.id.Pause -> {
                Toast.makeText(applicationContext, "pause Selected", Toast.LENGTH_LONG).show()
                true
            }
            R.id.Exit -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}