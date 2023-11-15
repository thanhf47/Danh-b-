package vn.edu.hust.contact

import java.io.Serializable

data class ContactItemModel(
    val id: String,
    val name: String,
    val phone: String,
    val email: String
) : Serializable