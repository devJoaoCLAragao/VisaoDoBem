package br.com.devjoaoclaragao.visaodobem.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import br.com.devjoaoclaragao.visaodobem.R
import br.com.devjoaoclaragao.visaodobem.ui.activity.MainFragment


class ForWhoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_for_who, container, false)

        var oldClient = view.findViewById<ImageButton>(R.id.oldClient)
        oldClient.setOnClickListener {
            showClient()
        }

        return view
    }

    companion object {
        fun newInstance() : ForWhoFragment{
            return ForWhoFragment()
        }
    }

    fun showClient(){
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.content, ClientFragment.newInstance())
            .commit()
    }




}
