package com.example.bigbasket.Ui.Adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

import com.example.bigbasket.R
import com.example.bigbasket.data.model.FoodPacket
import com.example.bigbasket.databinding.SingleItemBinding

const val base_url="https://www.alamy.com/stock-photo-indian-packet-food-with-100-natural-no-preservatives-label-india-52714058.html?pv=1&stamp=2&imageid=BE5C140E-3608-4877-8054-E590F4CAE871&p=22291&n=0&orientation=0&pn=1&searchtype=0&IsFromSearch=1&srch=foo%3dbar%26st%3d0%26pn%3d1%26ps%3d100%26sortby%3d2%26resultview%3dsortbyPopular%26npgs%3d0%26qt%3dindian%2520food%2520packet%2520label%26qt_raw%3dindian%2520food%2520packet%2520label%26lic%3d3%26mr%3d0%26pr%3d0%26ot%3d0%26creative%3d%26ag%3d0%26hc%3d0%26pc%3d%26blackwhite%3d%26cutout%3d%26tbar%3d1%26et%3d0x000000000000000000000%26vp%3d0%26loc%3d0%26imgt%3d0%26dtfr%3d%26dtto%3d%26size%3d0xFF%26archive%3d1%26groupid%3d%26pseudoid%3d%26a%3d%26cdid%3d%26cdsrt%3d%26name%3d%26qn%3d%26apalib%3d%26apalic%3d%26lightbox%3d%26gname%3d%26gtype%3d%26xstx%3d0%26simid%3d%26saveQry%3d%26editorial%3d1%26nu%3d%26t%3d%26edoptin%3d%26customgeoip%3d%26cap%3d1%26cbstore%3d1%26vd%3d0%26lb%3d%26fi%3d2%26edrf%3d0%26ispremium%3d1%26flip%3d0%26pl%3d"

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
