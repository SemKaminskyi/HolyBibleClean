package com.example.holybibleclean.data.net

import retrofit2.http.GET

/** @Author SemKaminskyi
 *29.10.2021
 */

interface BookService {
    @GET("books")
    suspend fun fetchBooks(): List<BookCloud>
}