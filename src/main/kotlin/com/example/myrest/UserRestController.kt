package com.example.myrest

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
class UserController {
    @Autowired
    lateinit var  userRepository : UserRepository
    @PostMapping("/user")
    fun save( user: MyUser):String{

        userRepository.save(user)
        return "user save in db"

    }
    @GetMapping("/getAll")
    fun getAllUser(): List<MyUser>{
        return  userRepository.findAll()
    }
    @GetMapping("/getuser/{name}")
    fun getUser(@PathVariable name: String):String{
        return userRepository.findByName(name).toString()
    }
    @DeleteMapping("deleteuser/{id}")
    fun deleteUser(@PathVariable id:Int):String {

        userRepository.deleteById(id)
        return "user deleted"

    }
}