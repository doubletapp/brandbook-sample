package com.nikistos.fiftytwochallenge.di

import com.nikistos.fiftytwochallenge.MainApplication
import dagger.BindsInstance
import dagger.Component
import ru.fiftytwochallenge.navigationimpl.NavigationActivityProvider

@Component(
    modules = [AppModule::class],
)
internal interface AppComponent {

    fun inject(app: MainApplication)

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance activityProvider: NavigationActivityProvider,
        ): AppComponent
    }
}
