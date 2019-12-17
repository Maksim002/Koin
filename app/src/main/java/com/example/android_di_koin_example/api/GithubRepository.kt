package com.example.android_di_koin_example.api

import com.example.android_di_koin_example.model.GithubAccount
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.withContext

class GithubRepository(private val githubApi: GithubApi) {

    suspend fun getGithubAccountAsync(accountName: String): Deferred<GithubAccount?> {
        return withContext(Dispatchers.IO) {
            async {
                try {
                    // for demo purpose, hence no error checking
                    githubApi.fetchGithubAccountAsync(accountName).await().body() as GithubAccount
                } catch (e: Exception) {
                    e.printStackTrace()
                    null
                }
            }
        }
    }

}