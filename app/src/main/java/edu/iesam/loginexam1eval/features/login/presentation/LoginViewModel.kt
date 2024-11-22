package edu.iesam.loginexam1eval.features.login.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import edu.iesam.loginexam1eval.features.login.domain.SaveUserUseCase
import edu.iesam.loginexam1eval.features.login.domain.User

class LoginViewModel(
    private val saveUserUseCase: SaveUserUseCase
): ViewModel() {

    private val _uiState = MutableLiveData<UiState>()
    val uiState : LiveData<UiState> = _uiState

    //fun userLogin()


    data class UiState(
        val user : User? = null,
        val isLoading : Boolean,
        val errorApp: String? = null,
    )
}