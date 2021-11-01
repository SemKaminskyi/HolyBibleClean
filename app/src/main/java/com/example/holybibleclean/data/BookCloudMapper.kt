package com.example.holybibleclean.data

import com.example.holybibleclean.core.Abstract
import com.example.holybibleclean.core.Book
import com.example.holybibleclean.data.net.BookCloud

/** @Author SemKaminskyi
 *29.10.2021
 */
interface BookCloudMapper:Abstract.Mapper {
    fun map (id: Int, name:String): Book

    class Base: BookCloudMapper{
        override fun map(id: Int, name: String): Book = Book(id, name)

    }
}