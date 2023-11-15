package vn.edu.hust.contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    private lateinit var contact: ContactItemModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        contact = intent.getSerializableExtra("contact") as ContactItemModel

        val iconImage = findViewById<TextView>(R.id.icon_image)
        val id = findViewById<TextView>(R.id.id)
        val name = findViewById<TextView>(R.id.name)
        val phone = findViewById<TextView>(R.id.phone)
        val email = findViewById<TextView>(R.id.email)

        iconImage.text = contact.name[0].toString()
        id.text = "ID: " + contact.id
        name.text = "Name: \n" + contact.name
        phone.text = "Phone number: \n" + contact.phone
        email.text = "Email: \n" + contact.email
    }
}