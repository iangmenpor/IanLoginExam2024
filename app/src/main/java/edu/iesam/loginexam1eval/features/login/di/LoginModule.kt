package edu.iesam.loginexam1eval.features.login.di

import android.content.Context
import android.content.SharedPreferences
import edu.iesam.loginexam1eval.features.login.data.local.LoginXmlLocalDataSource
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single

@Module
@ComponentScan
class LoginModule {

    @Single
    fun provideSharedPref(context: Context): SharedPreferences =
        context.getSharedPreferences("user-storage", Context.MODE_PRIVATE)

    /*@Single
    fun provideLoginXmlLocalDataSource() : LoginXmlLocalDataSource {
        return LoginXmlLocalDataSource(provideSharedPref())
    }*/
}