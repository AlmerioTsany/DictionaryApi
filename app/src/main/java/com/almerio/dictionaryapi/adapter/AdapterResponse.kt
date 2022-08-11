package com.almerio.dictionaryapi.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.almerio.dictionaryapi.DefinitionsItem
import com.almerio.dictionaryapi.ResponseItem
import com.almerio.dictionaryapi.databinding.ItemResponseBinding

class AdapterResponse: RecyclerView.Adapter<AdapterResponse.ResponseViewHolder>() {
    private val listResponse: ArrayList<DefinitionsItem?> = ArrayList()

    class ResponseViewHolder(val binding: ItemResponseBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ResponseViewHolder(
        ItemResponseBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ResponseViewHolder, position: Int) {
        holder.binding.apply {
            with(listResponse[position]) {
                tvDefinition.text = this?.definition
            }
        }
    }

    override fun getItemCount() = listResponse.size

    fun setData(data: List<DefinitionsItem?>?) {
        listResponse.clear()
        Log.i("Adapter", "onBindViewHolder: $data")
        if (data != null) {
            listResponse.addAll(data)
        }
    }

}