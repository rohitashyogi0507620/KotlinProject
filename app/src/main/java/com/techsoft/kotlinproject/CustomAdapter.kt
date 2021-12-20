package com.techsoft.kotlinproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageSwitcher
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(
    val context: Context,
    val listdata: ArrayList<ListClass>,

) : BaseAdapter() {
    override fun getCount(): Int {
        return listdata.size
    }

    override fun getItem(position: Int): Any {
        return listdata[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        // Get view for row item
        val inflater: LayoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rowView = inflater.inflate(R.layout.custom_listview, parent, false)
        val titleTextView = rowView.findViewById<TextView>(R.id.tv_name)
        val phoneTextView = rowView.findViewById<TextView>(R.id.tv_phonebumber)
        val imageview=rowView.findViewById<ImageView>(R.id.image_view)
        titleTextView.text = listdata.get(position).name
        phoneTextView.text = listdata.get(position).number
        imageview.setImageDrawable(context.getDrawable(listdata.get(position).vehiclenum))
        return rowView
    }
}