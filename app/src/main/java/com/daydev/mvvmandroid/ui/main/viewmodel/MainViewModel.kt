package com.daydev.mvvmandroid.ui.main.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.daydev.mvvmandroid.data.model.User
import com.daydev.mvvmandroid.data.repository.MainRepository
import com.daydev.mvvmandroid.utils.Resource
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

// this class is viewmodel that view class will call fun for get or do about data
class MainViewModel(private val mainRepository: MainRepository): ViewModel() {


    private val users = MutableLiveData<Resource<List<User>>>()  //attr that will store data(LiveData)
    private val compositeDisposable = CompositeDisposable()   //and this is like a db that disposable(for a time)


    init{
        fetchUsers()
    }

    //fun that will get data from repository
    //in subscribe() is specify that if get data success what will do and if can't get or error about data what will do
    private fun fetchUsers() {
        users.postValue(Resource.loading(null))
        compositeDisposable.add(
            mainRepository.getUsers()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({userList ->
                    users.postValue(Resource.success(userList))
                }, { users.postValue(Resource.error("Something Wrong", null))})
        )
    }

    //fun for clear data of composite that created for store users obj. for a time
    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }


    fun getUsers(): LiveData<Resource<List<User>>>{
        return users
    }
}