package com.example.holybibleclean.data.net

import com.example.holybibleclean.core.Abstract
import com.example.holybibleclean.core.Book
import com.google.gson.annotations.SerializedName

/** @Author SemKaminskyi
 *29.10.2021
 */
data class BookCloud(
    @SerializedName("id") private val id: Int,
    @SerializedName("name") private val name: String
) : Abstract.Object<Book, BookCloudMapper>() {
    override fun map(mapper: com.example.holybibleclean.data.BookCloudMapper): Book = mapper.map(id, name)
}