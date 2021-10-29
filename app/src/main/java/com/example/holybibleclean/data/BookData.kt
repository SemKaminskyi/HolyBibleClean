package com.example.holybibleclean.data

import com.example.holybibleclean.core.Abstract
import com.example.holybibleclean.data.net.BookServerModel
import com.example.holybibleclean.domain.BookDomain
import java.lang.Exception

sealed class BookData : Abstract.Object<BookDomain, BooksDataToDomainMapper>() {
    class Succes(private val books: List<BookServerModel>) : BookData() {
        override fun map(mapper: BooksDataToDomainMapper): BookDomain = mapper.map(books)

    }

    class Fail(private val exception: Exception) : BookData() {
        override fun map(mapper: BooksDataToDomainMapper): BookDomain = mapper.map(exception)

    }
}