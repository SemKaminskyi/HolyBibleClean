package com.example.holybibleclean.data

import java.lang.Exception

/** @Author SemKaminskyi
 *29.10.2021
 */
interface BookRepository {
    suspend fun fetchBooks(): BookData

    class Base(private val books: BooksCloudDataSourse) : BookRepository {
        override suspend fun fetchBooks() = try {
            BookData.Succes(books.fetchBooks())
        } catch (e: Exception) {
            BookData.Fail(e)
        }
    }
}