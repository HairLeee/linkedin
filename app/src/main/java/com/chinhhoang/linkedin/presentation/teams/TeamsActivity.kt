package com.chinhhoang.linkedin.presentation.teams

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.chinhhoang.linkedin.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class TeamsActivity : AppCompatActivity() {

    private val viewModel: TeamsViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teams)
        obServer()
        viewModel.getTeams()
    }

    private fun obServer(){
        viewModel.teams.observe(this){

        }
    }
}