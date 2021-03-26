package com.daydev.mvvmandroid.data.repository

import com.daydev.mvvmandroid.data.api.ApiHelper
import com.daydev.mvvmandroid.data.model.User
import io.reactivex.Single

//this class have fun that get data from api(data resource) like a door of data layer
//ViewModel class can call fun for using data
class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>>{
        return apiHelper.getUsers()
    }

}