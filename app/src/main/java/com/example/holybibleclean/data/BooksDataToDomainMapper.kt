package com.example.holybibleclean.data

import com.example.holybibleclean.core.Abstract
import com.example.holybibleclean.core.Book
import com.example.holybibleclean.data.net.BookCloud
import com.example.holybibleclean.domain.BookDomain
import retrofit2.HttpException
import java.lang.Exception
import java.net.UnknownHostException

/** @Author SemKaminskyi
 *29.10.2021
 */
interface BooksDataToDomainMapper:Abstract.Mapper {
    fun map(books:List<Book>):BookDomain
    fun map (exception: Exception):BookDomain

}