package edu.iesam.loginexam1eval.features.login.data

import edu.iesam.loginexam1eval.features.login.data.local.LoginXmlLocalDataSource
import edu.iesam.loginexam1eval.features.login.domain.LoginRepository
import edu.iesam.loginexam1eval.features.login.domain.User

class LoginDataRepository(
    private val localDataSource: LoginXmlLocalDataSource
) : LoginRepository {


    override suspend fun saveUser(user: User) {
        localDataSource.save(user)
    }
}