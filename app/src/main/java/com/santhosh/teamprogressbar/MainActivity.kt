package com.santhosh.teamprogressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.santhosh.progressbar.TeamProgressBar

class MainActivity : AppCompatActivity() {
    private val progressDialog = TeamProgressBar()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        progressDialog.show(this)
    }
}