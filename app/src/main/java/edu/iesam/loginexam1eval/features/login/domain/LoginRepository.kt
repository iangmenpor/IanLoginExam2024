package edu.iesam.loginexam1eval.features.login.domain

interface LoginRepository {

    suspend fun saveUser(user: User)
}