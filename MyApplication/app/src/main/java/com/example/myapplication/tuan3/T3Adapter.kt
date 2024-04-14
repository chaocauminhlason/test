package com.example.myapplication.tuan3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.R

class T3Adapter(val ls: ArrayList<T3Contact>, val context: Context) : BaseAdapter() {

    override fun getCount(): Int {
        return ls.size
    }

    override fun getItem(position: Int): Any {
        return ls[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertView = convertView
        val viewHolder: ViewHolder

        if (convertView == null) {
            viewHolder = ViewHolder()
            convertView = LayoutInflater.from(context).inflate(R.layout.t3_item_view, parent, false)
            viewHolder!!.imgHinh = convertView.findViewById(R.id.t3ItemHinh)
            viewHolder!!.tvTen = convertView.findViewById(R.id.T3ItemTen)
            viewHolder!!.tvTuoi = convertView.findViewById(R.id.T3ItemTuoi)
            convertView.tag = viewHolder
        } else {
            viewHolder = convertView.tag as ViewHolder
        }

        viewHolder!!.imgHinh?.setImageResource(ls[position].hinh)
        viewHolder!!.tvTen?.text = ls[position].ten
        viewHolder!!.tvTuoi?.text = ls[position].tuoi

        return convertView!!
    }

    internal inner class ViewHolder {
        var imgHinh: ImageView? = null
        var tvTen: TextView? = null
        var tvTuoi: TextView? = null
    }
}