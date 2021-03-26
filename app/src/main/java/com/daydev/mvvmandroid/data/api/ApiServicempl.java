package com.daydev.mvvmandroid.data.api;

import com.daydev.mvvmandroid.data.api.ApiService;
import com.daydev.mvvmandroid.data.model.User;
import com.rx2androidnetworking.Rx2AndroidNetworking;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;


pu class ApiServiceImpl implements ApiService {
    @NotNull
    public Single getUsers() {
        Single var10000 = Rx2AndroidNetworking.get("https://api.coinranking.com/v1/public/coins/").build().getObjectListSingle(User.class);
        Intrinsics.checkNotNullExpressionValue(var10000, "Rx2AndroidNetworking.get…tSingle(User::class.java)");
        return var10000;
    }
}

