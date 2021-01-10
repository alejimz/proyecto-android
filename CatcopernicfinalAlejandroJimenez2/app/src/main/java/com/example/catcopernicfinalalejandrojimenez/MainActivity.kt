package com.example.catcopernicfinalalejandrojimenez

import android.content.DialogInterface
import android.os.Bundle
import android.view.Gravity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val toast = Toast.makeText(
            applicationContext, "Alejandro Jimenez Sanchez", Toast.LENGTH_SHORT
        )

        toast.setGravity(Gravity.CENTER, 0, 0)

        toast.show()
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onBackPressed() {
       // super.onBackPressed()
        val builder = AlertDialog.Builder(applicationContext)
        builder.setMessage("Estas seguro que quieres salir?")
        builder.setCancelable(true)
        builder.setNegativeButton("No", DialogInterface.OnClickListener { dialog, i ->
            dialog.cancel()
        })
        builder.setPositiveButton("Salir", DialogInterface.OnClickListener { dialog, i ->
            finish()
        })
        val alertDialog = builder.create()
        alertDialog.show()
        Toast.makeText(applicationContext, "Salir", Toast.LENGTH_LONG).show()
    }
}