package br.com.devjoaoclaragao.visaodobem.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.devjoaoclaragao.visaodobem.R

class HistoryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_history, container, false)

        //TODO("Implementar Historico a partir do ClientFragment")

        return view
    }

    companion object {
        fun newInstance() : HistoryFragment {
            return HistoryFragment()
        }
    }
}