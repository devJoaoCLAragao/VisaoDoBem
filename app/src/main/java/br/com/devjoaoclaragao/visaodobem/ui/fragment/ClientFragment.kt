package br.com.devjoaoclaragao.visaodobem.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.devjoaoclaragao.visaodobem.R
import br.com.devjoaoclaragao.visaodobem.models.Client
import br.com.devjoaoclaragao.visaodobem.ui.adapters.ClientAdapter

class ClientFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_client, container, false)

        var clientes = ArrayList<Client>()
        clientes.add(Client("name1", "lastOrder1", "photo1", "clientSince1", "recomendedBy1"))
        clientes.add(Client("name2", "lastOrder2", "photo2", "clientSince2", "recomendedBy2"))
        clientes.add(Client("name3", "lastOrder3", "photo3", "clientSince3", "recomendedBy3"))
        clientes.add(Client("name4", "lastOrder4", "photo4", "clientSince4", "recomendedBy4"))
        clientes.add(Client("name5", "lastOrder5", "photo5", "clientSince5", "recomendedBy5"))
        clientes.add(Client("name6", "lastOrder6", "photo6", "clientSince6", "recomendedBy6"))
        clientes.add(Client("name7", "lastOrder7", "photo7", "clientSince7", "recomendedBy7"))
        clientes.add(Client("name8", "lastOrder8", "photo8", "clientSince8", "recomendedBy8"))
        clientes.add(Client("name9", "lastOrder9", "photo9", "clientSince9", "recomendedBy9"))

        var recyclerViewClient = view.findViewById<RecyclerView>(R.id.recyclerViewClient)
        recyclerViewClient.adapter = ClientAdapter(requireContext(), clientes)
        recyclerViewClient.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)


        //getClients(requireView(), clientes)


        return view
    }

    companion object {
        fun newInstance(): ClientFragment {
            return ClientFragment()
        }
    }

    //ClientAdapter
//    fun getClients(list: List<Client>) {
//        var toast = Toast.makeText(context, "foiLista", Toast.LENGTH_LONG).show()
//        var recyclerViewClient = view.findViewById<RecyclerView>(R.id.recyclerViewClient)
//        recyclerViewClient.adapter = ClientAdapter(requireContext(), list)
//        recyclerViewClient.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
//    }
}