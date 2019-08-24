package com.example.androiduserinterfacesprintchallenge.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androiduserinterfacesprintchallenge.R
import com.example.androiduserinterfacesprintchallenge.model.NameNumberModel
import java.util.*


class NameNumberAdapter/*Can create a mutableListOf here like (val groceryList: MutableList<Model_class_name>)
among many other things
*/
    : RecyclerView.Adapter<NameNumberAdapter.ViewHolder /*<- If red alt+enter*/>() {

    private var data: List<NameNumberModel> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.name_number_item_layout, parent, false)
        )
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(data[position])

    /*updates changes in RecyclerView*/

    fun swapData(data: List<NameNumberModel>) {
        this.data = data
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: NameNumberModel) = with(itemView) {
            // TODO: Bind the data with View
            setOnClickListener {
                // TODO: Handle on click
            }
        }
    }
}