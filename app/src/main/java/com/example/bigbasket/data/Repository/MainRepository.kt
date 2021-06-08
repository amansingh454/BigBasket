package com.example.bigbasket.data.Repository

import androidx.lifecycle.MutableLiveData
import com.example.bigbasket.data.Network.FoodApi
import com.example.bigbasket.data.model.FoodPacket
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainRepository(private val api: FoodApi){


   fun getFood():MutableLiveData<List<FoodPacket>> {

       val foodPacket=MutableLiveData<List<FoodPacket>>()
       val error=MutableLiveData<String>()
       val response=api.getAllFood()
       response.enqueue(object :Callback<List<FoodPacket>>{
           override fun onFailure(call: Call<List<FoodPacket>>, t: Throwable) {
               error.value=t.message

           }

           override fun onResponse(call: Call<List<FoodPacket>>, response: Response<List<FoodPacket>>) {
             foodPacket.value=response.body()
           }
       })
       return foodPacket



       }
   }



