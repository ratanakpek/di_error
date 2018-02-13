package demo.material.di_mvp.di.component

import dagger.Component
import demo.material.di_mvp.di.module.AppModule
import demo.material.di_mvp.di.module.MainModule
import javax.inject.Singleton

/**
 * Created by r.pek on 2/13/2018.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class, MainModule::class))
interface AppComponent {

}