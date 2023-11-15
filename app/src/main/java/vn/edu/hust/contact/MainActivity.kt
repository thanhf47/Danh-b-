package vn.edu.hust.contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contactsDatabase = listOf(
            ContactItemModel("1", "Nguyen Tien Thanh", "0123456789", "thanh.nt215640@sis.hust.edu.vn"),
            ContactItemModel("2", "Son Goku", "0123456798", "goku.vn@gmail.com"),
            ContactItemModel("3", "John Wick", "9876543210", "warwick@tmail.com")
        )

        val myRecyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        myRecyclerView.adapter = ContactAdapter(contactsDatabase)
        myRecyclerView.layoutManager = LinearLayoutManager(this)
    }
}