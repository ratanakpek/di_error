package demo.material.di_mvp.di.module

import dagger.Module
import dagger.Provides
import demo.material.di_mvp.TestMain
import javax.inject.Named

/**
 * Created by r.pek on 2/13/2018.
 */
@Module
class MainModule {
    @Provides
    fun provideTestMain(@Named("BASE_URL") text: String): TestMain {
        return TestMain(text)
    }
}