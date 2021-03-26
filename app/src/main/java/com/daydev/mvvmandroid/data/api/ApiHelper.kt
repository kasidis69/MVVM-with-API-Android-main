package com.daydev.mvvmandroid.data.api

//create for call fun from interface apiService like a bridge that another class call getUsers() fun
class ApiHelper(private val apiService: ApiService) {
    fun getUsers() = apiService.getUsers()
}