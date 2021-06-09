package br.com.devjoaoclaragao.visaodobem.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.devjoaoclaragao.visaodobem.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        enter_login.setOnClickListener {
            login()
        }
    }

    fun login(){
        var intent = Intent(this, ForWhoActivity::class.java)
        startActivity(intent)
        finish()
    }
}