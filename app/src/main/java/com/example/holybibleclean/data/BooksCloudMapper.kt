package com.example.holybibleclean.data

import com.example.holybibleclean.core.Abstract
import com.example.holybibleclean.core.Book
import com.example.holybibleclean.data.net.BookCloud

/** @Author SemKaminskyi
 *29.10.2021
 */
interface BooksCloudMapper:Abstract.Mapper {
    fun map (cloudList : List<BookCloud>): List<Book>

    class Base(private val bookMapper:BookCloudMapper): BooksCloudMapper{
        override fun map(cloudList: List<BookCloud>): List<Book> {
            return  cloudList.map {  bookCloud ->
                bookCloud.map(bookMapper)
            }
        }

    }
}