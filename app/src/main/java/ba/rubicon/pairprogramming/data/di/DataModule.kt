package ba.rubicon.pairprogramming.data.di

import ba.rubicon.pairprogramming.data.repository.di.RepositoryModule
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module(
    includes = [
        RepositoryModule::class
    ]
)
@InstallIn(SingletonComponent::class)
interface DataModule {

    companion object {
        @Provides
        @Singleton
        fun provideMoshi(): Moshi = Moshi.Builder().build()
    }

}