package com.example.myrest

import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<Users, Int> {

    fun findByName(name:String) : Users
    fun getByName(name: String): List<Users>


}