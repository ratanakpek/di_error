package demo.material.di_mvp.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by r.pek on 2/13/2018.
 */
@Module
class AppModule(private val app: Application) {

    @Singleton
    @Provides
    fun provideContext() : Context{
        return app.applicationContext
    }

    @Singleton
    @Provides
    @Named("BASE_URL")
    fun provideBaseURL() = "Test"

}