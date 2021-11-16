package ba.rubicon.pairprogramming.data.util

import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

internal class RetrofitFactory {
    fun build(baseUrl: String, moshi: Moshi): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .client(getClient())
            .baseUrl(baseUrl)
            .build()
    }

    private fun getClient(): OkHttpClient {
        val builder = OkHttpClient.Builder()
        addTimeouts(builder)
        return builder.build()
    }

    private fun addTimeouts(builder: OkHttpClient.Builder, timeout: Int = 30) {
        builder.connectTimeout(timeout.toLong(), TimeUnit.SECONDS)
            .writeTimeout(timeout.toLong(), TimeUnit.SECONDS)
            .readTimeout(timeout.toLong(), TimeUnit.SECONDS)
    }
}