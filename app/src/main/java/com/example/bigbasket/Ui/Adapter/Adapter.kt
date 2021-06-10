package com.example.bigbasket.Ui.Adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.bigbasket.R
import com.example.bigbasket.data.model.FoodPacket
import com.example.bigbasket.databinding.SingleItemBinding

const val imageBaseUrl= "https://www.google.com/search?q=foodpacket+image&rlz=1C5CHFA_enIN948IN948&tbm=isch&source=iu&ictx=1&fir=5qQAWKYquLX5YM%252CoTrNMkQ_WuBz1M%252C_&vet=1&usg=AI4_-kTfdy-QHWqsDrL8RxABdzQ1QLx3Og&sa=X&ved=2ahUKEwizxuGL5YjxAhUO7XMBHY7fBRUQ9QF6BAgOEAE#imgrc=5qQAWKYquLX5YM"

class Adapter(private val data:List<FoodPacket>): RecyclerView.Adapter<Adapter.ItemViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context),
                R.layout.single_item,parent,false))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.singleItemBinding.product=data [position]
        //Glide.with(holder.singleItemBinding.root).load(imageBaseUrl).into(holder.singleItemBinding.image)


    }

    override fun getItemCount(): Int {
        return data.size
    }
    class ItemViewHolder(val singleItemBinding: SingleItemBinding):
            RecyclerView.ViewHolder(singleItemBinding.root){
    }
}
