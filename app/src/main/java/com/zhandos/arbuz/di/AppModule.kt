package com.zhandos.arbuz.di

import android.app.Application
import androidx.room.Room
import com.zhandos.arbuz.feature_arbuz.data.data_source.ArbuzDatabase
import com.zhandos.arbuz.feature_arbuz.data.repsitory.BasketArbuzRepositoryImpl
import com.zhandos.arbuz.feature_arbuz.domain.repository.BasketArbuzRepository
import com.zhandos.arbuz.feature_arbuz.domain.use_cases.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideArbuzDatabase(app: Application): ArbuzDatabase {
        return Room.databaseBuilder(
            app,
            ArbuzDatabase::class.java,
            "ArbuzDB"
        ).build()
    }

    @Provides
    @Singleton
    fun provideArbuzRepository(db: ArbuzDatabase): BasketArbuzRepository {
        return BasketArbuzRepositoryImpl(db.basketArbuzUserDao)
    }

    @Provides
    @Singleton
    fun provideArbuzUseCases(repositoryBasket: BasketArbuzRepository): BasketArbuzUseCases {
        return BasketArbuzUseCases(
            GetBasketArbuz(repositoryBasket),
            AddBasketArbuz(repositoryBasket),
            UpdateBasketArbuz(repositoryBasket),
            DeleteCase(repositoryBasket)
        )
    }


}