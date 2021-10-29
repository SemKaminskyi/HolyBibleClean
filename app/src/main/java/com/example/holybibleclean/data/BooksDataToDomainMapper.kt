package com.example.holybibleclean.data

import com.example.holybibleclean.core.Abstract
import com.example.holybibleclean.data.net.BookServerModel
import com.example.holybibleclean.domain.BookDomain
import retrofit2.HttpException
import java.lang.Exception
import java.net.UnknownHostException

/** @Author SemKaminskyi
 *29.10.2021
 */
interface BooksDataToDomainMapper:Abstract.Mapper {
    fun map(books:List<BookServerModel>):BookDomain
    fun map (exception: Exception):BookDomain

    class Base: BooksDataToDomainMapper {
        override fun map(books: List<BookServerModel>): BookDomain =BookDomain.Success()

        override fun map(exception: Exception): BookDomain {
            val errorType = when(exception){
                is UnknownHostException -> 0
                is HttpException -> 1
                else ->2
            }
        return BookDomain.Fail()
        }
    }
}