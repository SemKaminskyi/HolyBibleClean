package com.example.holybibleclean.data

import com.example.holybibleclean.data.net.BookServerModel
import com.example.holybibleclean.data.net.BookService

/** @Author SemKaminskyi
 *29.10.2021
 */
interface BooksCloudDataSourse {
    suspend fun fetchBooks(): List<BookServerModel>

    class Base (private val service: BookService):BooksCloudDataSourse{
        override suspend fun fetchBooks(): List<BookServerModel> = service.fetchBooks()
    }
}