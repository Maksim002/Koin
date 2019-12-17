package com.example.android_di_koin_example.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.android_di_koin_example.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val mainActivityViewModel: MainActivityViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainActivityViewModel.githubAccount.observe(this, Observer {
            tv_content.text = it.toString()
        })

        btn_fetch.setOnClickListener {
            mainActivityViewModel.fetchAccount(et_account.text.toString())
        }
    }

}
