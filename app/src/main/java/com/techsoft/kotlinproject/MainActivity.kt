package com.techsoft.kotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import java.lang.reflect.Array

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var list = findViewById<ListView>(R.id.list_view);
        //      val arraylist = arrayOf("Rohitash", "Ne Aditya", "Ki Gand", "Mari", "Or Paise Bhi nhi diye ")
//        val arrayphone = arrayOf("7611920584", "525505", "8871678", "51525", "5257")
//        var adapter = ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, arraylist)
//        var adapter = CustomAdapter(this, arraylist,arrayphone);
//        list.adapter = adapter"

        val arrayList = ArrayList<ListClass>()//Creating an empty arraylist
        arrayList.add(ListClass("Car", "RJ-14-AC_8856", R.drawable.ic_round_directions_car_24))
        arrayList.add(ListClass("Bus", "DL-05-AC_5626", R.drawable.ic_round_directions_bus_24))
        arrayList.add(ListClass("Truck", "HR-10AC_0056", R.drawable.ic_round_agriculture_24))
        arrayList.add(ListClass("E-Bike", "MP-11-AC_6586", R.drawable.ic_round_electric_bike_24))

        var adapter = CustomAdapter(this, arrayList)
        list.adapter = adapter


    }
}