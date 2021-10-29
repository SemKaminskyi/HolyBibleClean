package com.example.holybibleclean.data.net

import com.example.holybibleclean.core.Abstract
import com.example.holybibleclean.data.BookData
import com.google.gson.annotations.SerializedName

/** @Author SemKaminskyi
 *29.10.2021
 */
data class BookServerModel(
    @SerializedName("id") private val id: Int,
    @SerializedName("name") private val name: String
) : Abstract.Object<BookData, BookServerToDomainMapper>() {
    override fun map(mapper: BookServerToDomainMapper): BookData = mapper.map(id, name)
}