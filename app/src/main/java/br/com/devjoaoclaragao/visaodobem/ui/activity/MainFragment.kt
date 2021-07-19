package br.com.devjoaoclaragao.visaodobem.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import br.com.devjoaoclaragao.visaodobem.R
import br.com.devjoaoclaragao.visaodobem.ui.fragment.ForWhoFragment

class MainFragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_fragment)

        setFragment(ForWhoFragment.newInstance())


    }

    fun setFragment(fragment: Fragment) {
        var ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.content, fragment)
        ft.commit()
    }
}