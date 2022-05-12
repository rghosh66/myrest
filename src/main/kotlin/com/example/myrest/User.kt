package com.example.myrest

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table()
data class MyUser(
    @Id
    @GeneratedValue
    val id : Int = 0,
                val name: String = "")
