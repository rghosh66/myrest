package com.example.myrest

import javax.persistence.*

@Entity
@Table()
data class Users(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Int = 0,
                val name: String = "")
