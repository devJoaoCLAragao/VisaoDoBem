package br.com.devjoaoclaragao.visaodobem.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.com.devjoaoclaragao.visaodobem.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var enter_login = findViewById<Button>(R.id.enter_login)
        enter_login.setOnClickListener {
            login()
        }
    }

    fun login(){
        var intent = Intent(this, MainFragment::class.java)
        startActivity(intent)
        finish()
    }
}