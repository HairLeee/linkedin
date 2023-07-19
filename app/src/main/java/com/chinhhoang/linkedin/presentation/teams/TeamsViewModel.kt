package com.chinhhoang.linkedin.presentation.teams

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.chinhhoang.linkedin.data.entiti.response.TeamsRp
import com.chinhhoang.linkedin.domain.usecase.TeamsUseCase
import kotlinx.coroutines.launch

class TeamsViewModel constructor(
    private val teamsUseCase: TeamsUseCase
) : ViewModel() {

    private val _teams = MutableLiveData<TeamsRp>()
    val teams: LiveData<TeamsRp> = _teams

    fun getTeams() {
        viewModelScope.launch {
            val teamsRes = teamsUseCase.getTeams()
            if (teamsRes.teams.isNotEmpty()){
                _teams.value = teamsRes
            }
        }
    }
}