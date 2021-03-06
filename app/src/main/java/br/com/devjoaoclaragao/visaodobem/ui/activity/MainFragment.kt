package br.com.devjoaoclaragao.visaodobem.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import br.com.devjoaoclaragao.visaodobem.R
import br.com.devjoaoclaragao.visaodobem.ui.fragment.ClientFragment
import br.com.devjoaoclaragao.visaodobem.ui.fragment.ForWhoFragment
import br.com.devjoaoclaragao.visaodobem.ui.fragment.SalesFragment

class MainFragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_fragment)

        setFragment(ForWhoFragment.newInstance())

        var btnClients = findViewById<ImageButton>(R.id.btnClients)
        btnClients.setOnClickListener {
            setFragment(ClientFragment.newInstance())
        }

        var btnSales = findViewById<ImageButton>(R.id.btnSales)
        btnSales.setOnClickListener {
            setFragment(SalesFragment.newInstance())
        }

        var btnPlus = findViewById<ImageButton>(R.id.btnPlus)
        btnPlus.setOnClickListener {
            setFragment(ForWhoFragment.newInstance())
        }

    }

    fun setFragment(fragment: Fragment) {
        var ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.content, fragment)
        ft.commit()
    }
}

// var fm = supportFragmentManager