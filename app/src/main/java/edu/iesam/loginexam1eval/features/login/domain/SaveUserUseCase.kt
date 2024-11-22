package edu.iesam.loginexam1eval.features.login.domain

class SaveUserUseCase (private val repository: LoginRepository) {

    suspend fun invoke(user:User) {
        repository.saveUser(user)
    }
}