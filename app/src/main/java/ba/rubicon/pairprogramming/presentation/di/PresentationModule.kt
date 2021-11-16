package ba.rubicon.pairprogramming.presentation.di

import android.content.Context
import ba.rubicon.pairprogramming.PairProgrammingApp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface PresentationModule {
    @Binds
    @ApplicationContext
    fun bindApplicationContext(app: PairProgrammingApp): Context
}