package com.roynaldi19.dc4_02loginwithanimation.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.roynaldi19.dc4_02loginwithanimation.model.UserPreference
import com.roynaldi19.dc4_02loginwithanimation.view.login.LoginViewModel
import com.roynaldi19.dc4_02loginwithanimation.view.main.MainViewModel
import com.roynaldi19.dc4_02loginwithanimation.view.signup.SignupViewModel

class ViewModelFactory(private val pref: UserPreference) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(MainViewModel::class.java) -> {
                MainViewModel(pref) as T
            }
            modelClass.isAssignableFrom(SignupViewModel::class.java) -> {
                SignupViewModel(pref) as T
            }
            modelClass.isAssignableFrom(LoginViewModel::class.java) -> {
                LoginViewModel(pref) as T
            }
            else -> throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
        }
    }
}