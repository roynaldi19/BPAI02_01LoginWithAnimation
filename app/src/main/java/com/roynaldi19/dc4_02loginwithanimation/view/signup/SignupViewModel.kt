package com.roynaldi19.dc4_02loginwithanimation.view.signup

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.roynaldi19.dc4_02loginwithanimation.model.UserModel
import com.roynaldi19.dc4_02loginwithanimation.model.UserPreference
import kotlinx.coroutines.launch

class SignupViewModel(private val pref: UserPreference) : ViewModel() {
    fun saveUser(user: UserModel) {
        viewModelScope.launch {
            pref.saveUser(user)
        }
    }
}