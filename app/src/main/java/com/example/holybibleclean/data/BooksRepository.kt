package com.example.holybibleclean.data

import java.lang.Exception

/** @Author SemKaminskyi
 *29.10.2021
 */
interface BooksRepository {
    suspend fun fetchBooks(): BooksData

    class Base(
        private val books: BooksCloudDataSourse,
        private val booksCloudMapper: BooksCloudMapper
    ) : BooksRepository {
        override suspend fun fetchBooks() = try {
            val booksCloudList = books.fetchBooks()
            BooksData.Succes(booksCloudMapper.map(booksCloudList))
        } catch (e: Exception) {
            BooksData.Fail(e)
        }
    }
}