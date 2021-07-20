package br.com.devjoaoclaragao.visaodobem.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.devjoaoclaragao.visaodobem.R
import br.com.devjoaoclaragao.visaodobem.models.Client
import com.bumptech.glide.Glide
import org.w3c.dom.Text

class ClientAdapter(var context : Context, var list : List<Client>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.item_list_client, parent, false)
        return ClientHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ClientHolder).bind(context, list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ClientHolder (view: View) : RecyclerView.ViewHolder(view){
        fun bind(context: Context, client: Client) {
            var photoClient = itemView.findViewById<ImageView>(R.id.photoClient)
            var nameClient = itemView.findViewById<TextView>(R.id.nameClient)
            var lastOrder = itemView.findViewById<TextView>(R.id.lastOrder)

            nameClient.text = client.name
            lastOrder.text = client.lastOrder


        }
    }
}



