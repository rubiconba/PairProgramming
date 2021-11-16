package ba.rubicon.pairprogramming.presentation.landing

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.FragmentScoped

@Module
@InstallIn(FragmentComponent::class)
class LandingModule {

    @FragmentScoped
    @Provides
    fun provideAdapter(): LandingAdapter = LandingAdapter()
}