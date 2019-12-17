package com.example.android_di_koin_example.di

import com.example.android_di_koin_example.api.GithubRepository
import org.koin.dsl.module

val repositoryModule = module {

    // Provide GithubRepository
    single {
        GithubRepository(get())
    }

}
