package br.com.devjoaoclaragao.visaodobem.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.devjoaoclaragao.visaodobem.R
import br.com.devjoaoclaragao.visaodobem.models.Sale
import br.com.devjoaoclaragao.visaodobem.ui.adapters.SalesAdapter
import java.util.*

class SalesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.fragment_sales, container, false)

        var sales = ArrayList<Sale>()
        sales.add(Sale("15", "Fev", "Lívia Santos", 200.00))
        sales.add(Sale("15", "Fev", "Lívia Santos", 200.00))
        sales.add(Sale("15", "Fev", "Lívia Santos", 200.00))
        sales.add(Sale("15", "Fev", "Lívia Santos", 200.00))
        sales.add(Sale("15", "Fev", "Lívia Santos", 200.00))
        sales.add(Sale("15", "Fev", "Lívia Santos", 200.00))
        sales.add(Sale("15", "Fev", "Lívia Santos", 200.00))


        var recycleViewSale = view?.findViewById<RecyclerView>(R.id.listSales)
        recycleViewSale?.adapter = SalesAdapter(requireContext(), sales)
        recycleViewSale?.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        // Inflate the layout for this fragment
        return view
    }

    companion object {

        fun newInstance() : SalesFragment {
            return SalesFragment()
        }

    }
}