package demo.material.di_mvp

import android.app.Application
import demo.material.di_mvp.di.component.AppComponent
import demo.material.di_mvp.di.component.DaggerAppComponent
import demo.material.di_mvp.di.module.AppModule

/**
 * Created by r.pek on 2/13/2018.
 */
class App : Application(){

    companion object {
        @JvmStatic
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        initDagger()
    }

    private fun initDagger() {
        appComponent  = DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()
    }

}