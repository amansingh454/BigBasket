package com.example.bigbasket.Ui.Adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.bigbasket.R
import com.example.bigbasket.data.model.FoodPacket
import com.example.bigbasket.databinding.SingleItemBinding



class Adapter(private val data:List<FoodPacket>): RecyclerView.Adapter<Adapter.ItemViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context),
                R.layout.single_item,parent,false))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.singleItemBinding.product=data [position]





    }

    override fun getItemCount(): Int {
        return data.size
    }
    inner class ItemViewHolder(val singleItemBinding: SingleItemBinding):
            RecyclerView.ViewHolder(singleItemBinding.root){
    }
}
