package com.example.holybibleclean.data

import com.example.holybibleclean.core.Abstract
import com.example.holybibleclean.core.Book
import com.example.holybibleclean.data.net.BookCloud
import com.example.holybibleclean.domain.BookDomain
import java.lang.Exception

sealed class BooksData : Abstract.Object<BookDomain, BooksDataToDomainMapper>() {
    class Succes(private val books: List<Book>) : BooksData() {
        override fun map(mapper: BookCloudMapper): BookDomain = mapper.map(books)

    }

    class Fail(private val exception: Exception) : BooksData() {
        override fun map(mapper: BookCloudMapper): BookDomain = mapper.map(exception)

    }
}