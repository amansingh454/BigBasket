package com.example.bigbasket

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){

    fun data(): List<FoodPacket>
    {
    val foodPacket:MutableList<FoodPacket> = mutableListOf<FoodPacket>()
    foodPacket.add(FoodPacket("Abc","sabina","Medium",3,100,
    50,1234,1234,2, R.drawable.food_packet,"superb"))

    foodPacket.add(FoodPacket("Abc","sabina","Medium",3,100,
    50,1234,1234,2, R.drawable.food_packet,"superb"))

    foodPacket.add(FoodPacket("Abc","sabina","Medium",3,100,
    50,1234,1234,2, R.drawable.food_packet,"superb"))

    foodPacket.add(FoodPacket("Abc","sabina","Medium",3,100,
    50,1234,1234,2, R.drawable.food_packet,"superb"))

    foodPacket.add(FoodPacket("Abc","sabina","Medium",3,100,
    50,1234,1234,2, R.drawable.food_packet,"superb"))

    foodPacket.add(FoodPacket("Abc","sabina","Medium",3,100,
    50,1234,1234,2, R.drawable.food_packet,"superb"))


    foodPacket.add(FoodPacket("Abc","sabina","Medium",3,100,
    50,1234,1234,2, R.drawable.food_packet,"superb"))

        return foodPacket

}}