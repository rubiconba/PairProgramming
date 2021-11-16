package ba.rubicon.pairprogramming.data.repository.dataSource.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

// TODO
@JsonClass(generateAdapter = true)
data class RepositoryDto(
    @Json(name = "author")
    val author: String
)