package com.example.android_di_koin_example.model

import com.google.gson.annotations.SerializedName
data class GithubAccount(
    @SerializedName("login") var login : String = "",
    @SerializedName("id") var id : Int = 0,
    @SerializedName("avatar_url") var avatarUrl : String = "",
    @SerializedName("created_at") var createdAt : String = "",
    @SerializedName("updated_at") var updatedAt : String = "")