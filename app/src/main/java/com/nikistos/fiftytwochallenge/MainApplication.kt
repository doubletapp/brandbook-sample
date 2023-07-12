package com.nikistos.fiftytwochallenge

import com.nikistos.fiftytwochallenge.di.AppComponent
import com.nikistos.fiftytwochallenge.di.ComponentHolderInitializer
import android.app.Application
import com.nikistos.fiftytwochallenge.di.DaggerAppComponent
import ru.fiftytwochallenge.navigationimpl.NavigationActivityProvider
import javax.inject.Inject

internal class MainApplication : Application() {

    @Inject
    lateinit var componentHolderInitializer: ComponentHolderInitializer

    private val appComponent: AppComponent
        get() = DaggerAppComponent.factory().create(
            activityProvider = NavigationActivityProvider(this),
        )

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)
        componentHolderInitializer.init()
    }
}
