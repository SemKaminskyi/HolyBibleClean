package com.example.holybibleclean.data

import com.example.holybibleclean.data.net.BookCloud
import com.example.holybibleclean.data.net.BookService

/** @Author SemKaminskyi
 *29.10.2021
 */
interface BooksCloudDataSourse {
    suspend fun fetchBooks(): List<BookCloud>

    class Base (private val service: BookService):BooksCloudDataSourse{
        override suspend fun fetchBooks(): List<BookCloud> = service.fetchBooks()
    }
}