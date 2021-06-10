package com.example.bigbasket.data.model
import com.google.gson.annotations.SerializedName

data class FoodPacket(
        @SerializedName("discount")
        val discountPercent: Int,
        @SerializedName("quantity")
        val weight: String,
        @SerializedName("description")
        val desc: String,
        val companyName: String,
        val productName:String,
        val size:String,
        val star:Int,
        val retailPrice:Int,
        val ratings:Int,
        val markedPrice:Int,
        @SerializedName("Img")
        val image:String )


