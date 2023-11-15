package vn.edu.hust.contact

import android.content.Intent
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(val contactList: List<ContactItemModel>) : RecyclerView.Adapter<ContactAdapter.MyViewHolder>() {
    class MyViewHolder(val item: View) : RecyclerView.ViewHolder(item), View.OnCreateContextMenuListener {
        val contactName = item.findViewById<TextView>(R.id.contact_name)
        val iconImage = item.findViewById<TextView>(R.id.icon_image)

        init {
            item.setOnCreateContextMenuListener(this)
        }

        override fun onCreateContextMenu(
            menu: ContextMenu?,
            v: View?,
            menuInfo: ContextMenu.ContextMenuInfo?
        ) {
            menu?.setHeaderTitle("Select")
            menu?.add(0, 0, 0, "Call phone")?.setOnMenuItemClickListener {
                Toast.makeText(item.context, "Calling ...", Toast.LENGTH_LONG).show()
                true
            }
            menu?.add(0, 0, 1, "Send message")?.setOnMenuItemClickListener {
                Toast.makeText(item.context, "Sending message ...", Toast.LENGTH_LONG).show()
                true
            }
            menu?.add(0, 0, 2, "Send email")?.setOnMenuItemClickListener {
                Toast.makeText(item.context, "Sending email ...", Toast.LENGTH_LONG).show()
                true
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout =LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return MyViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.contactName.text = contactList[position].name
        holder.iconImage.text = contactList[position].name[0].toString()

        holder.item.setOnClickListener {
            val intent = Intent(holder.item.context, MainActivity2::class.java).apply{
                putExtra("contact", contactList[position])
            }
            holder.item.context.startActivity(intent)
        }
    }
}