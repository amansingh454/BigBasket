package com.example.bigbasket.data.Repository


import com.example.bigbasket.data.Network.FoodApi
import com.example.bigbasket.data.model.FoodPacket
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class MainRepository(private val api: FoodApi) {


    suspend fun getFood():List<FoodPacket> {
        return withContext(Dispatchers.IO){
            api.getAllFood()

    }
}}
       //val foodPacket=MutableLiveData<List<FoodPacket>>()
       //val error=MutableLiveData<String>()

//       response.enqueue(object :Callback<List<FoodPacket>>{
//           override fun onFailure(call: Call<List<FoodPacket>>, t: Throwable) {
//               error.value=t.message
//
//           }
//
//           override fun onResponse(call: Call<List<FoodPacket>>, response: Response<List<FoodPacket>>) {
//             foodPacket.value=response.body()
//           }
//       })
//       return foodPacket







