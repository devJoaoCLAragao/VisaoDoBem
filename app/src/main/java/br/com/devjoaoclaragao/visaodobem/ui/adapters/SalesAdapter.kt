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
import br.com.devjoaoclaragao.visaodobem.models.Sale

class SalesAdapter (var context : Context, var list : List<Sale>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.item_list_sales, parent, false)
        return SalesHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as SalesHolder).bind(context, list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class SalesHolder (view: View) : RecyclerView.ViewHolder(view){
        fun bind(context: Context, sale: Sale) {

            var daySale = itemView.findViewById<TextView>(R.id.daySale1)
            var monthSale = itemView.findViewById<TextView>(R.id.nameMonth1)
            var nameSaller = itemView.findViewById<TextView>(R.id.nameSeller1)
            var valueSale = itemView.findViewById<TextView>(R.id.valueSale1)

        }
    }
}