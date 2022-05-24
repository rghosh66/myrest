package com.example.myrest

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.awt.desktop.UserSessionEvent


@RestController
class UserController {
    @Autowired
    lateinit var  userRepository : UserRepository
    @PostMapping("/user")
    fun save( user: Users):String{

        userRepository.save(user)
        return "user save in db"

    }
    @GetMapping("/getAll")
    fun getAllUser(): List<Users>{
        return  userRepository.findAll()
    }
    @GetMapping("/userbyname/{name}")
    fun getUser(@PathVariable name: String):String{

     return   userRepository.getByName(name).toString()
   //     return userRepository.findByName(name).toString()
    }

    @GetMapping("userbyid/{id}")
    fun getUserById(@PathVariable id: Int): String{

        return userRepository.getById(id).toString()
    }
    @DeleteMapping("deleteuser/{id}")
    fun deleteUser(@PathVariable id:Int):String {

        userRepository.deleteById(id)
        return "user deleted"

    }
}