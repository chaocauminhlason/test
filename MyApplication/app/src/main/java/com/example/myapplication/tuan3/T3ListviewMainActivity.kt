package com.example.myapplication.tuan3

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R

class T3ListviewMainActivity : AppCompatActivity() {
    var adapter: T3Adapter? = null
    var ls = ArrayList<T3Contact>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_t3_listview_main)

        val lv = findViewById<ListView>(R.id.t3Listview)

        ls.add(T3Contact("Nguyen Van A", "20", R.drawable.android))
        ls.add(T3Contact("Nguyen Van B", "20", R.drawable.apple))
        ls.add(T3Contact("Nguyen Van C", "20", R.drawable.hp))
        ls.add(T3Contact("Nguyen Van D", "20", R.drawable.android))
        ls.add(T3Contact("Nguyen Van E", "20", R.drawable.xbox))
        ls.add(T3Contact("Nguyen Van F", "20", R.drawable.apple))

        // Create adapter
        adapter = T3Adapter(ls, this)

        // Set adapter to ListView
        lv!!.adapter = adapter
    }


}
