package com.example.bigbasket.data.model
import com.google.gson.annotations.SerializedName

data class FoodPacket(
        @SerializedName("discount")
        val discountPercent: String,
        @SerializedName("quantity")
        val weight: String,
        @SerializedName("description")
        val desc: String,
        val companyName: String,
        val productName:String,
        val size:String,
        val star:String,
        val retailPrice:String,
        val ratings:String,
        val markedPrice:String,
        @SerializedName("Img")
        val image:String )


