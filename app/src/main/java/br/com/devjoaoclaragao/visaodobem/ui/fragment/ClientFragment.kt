package br.com.devjoaoclaragao.visaodobem.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.devjoaoclaragao.visaodobem.R

class ClientFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_client, container, false)
    }

    companion object {
        fun newInstance() : ClientFragment {
            return ClientFragment()
        }
    }
}