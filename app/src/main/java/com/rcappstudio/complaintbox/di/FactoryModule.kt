package com.rcappstudio.complaintbox.di

import android.app.Application
import com.google.firebase.database.FirebaseDatabase
import com.rcappstudio.complaintbox.ui.staff.viewmodel.StaffViewModelFactory
import com.rcappstudio.complaintbox.ui.user.viewmodel.UserViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {

    @Singleton
    @Provides
    fun provideUserViewModelFactory(app : Application, database: FirebaseDatabase)  : UserViewModelFactory {
        return UserViewModelFactory(app, database)
    }

    @Singleton
    @Provides
    fun provideStaffViewModelFactory(app: Application, database: FirebaseDatabase) : StaffViewModelFactory{
        return StaffViewModelFactory(app, database)
    }

}