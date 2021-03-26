package com.daydev.mvvmandroid.data.api

import com.daydev.mvvmandroid.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>
}