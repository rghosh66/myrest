package com.example.myrest

import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<MyUser, Int> {

    fun findByName(name:String) : MyUser
}