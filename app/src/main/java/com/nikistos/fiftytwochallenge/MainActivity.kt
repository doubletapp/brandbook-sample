package com.nikistos.fiftytwochallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.fiftytwochallenge.navigationimpl.NavigationActivity
import ru.fiftytwochallenge.navigationimpl.NavigationFragment

class MainActivity : AppCompatActivity(), NavigationActivity {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun getNavigationFragment(): NavigationFragment? = supportFragmentManager.fragments
        .filterIsInstance<NavigationFragment>()
        .firstOrNull()
}