package demo.material.di_mvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

        @Inject @Named("BASE_URL") lateinit var test : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
