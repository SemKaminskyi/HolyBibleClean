package com.example.holybibleclean.data.net

import com.example.holybibleclean.core.Abstract
import com.example.holybibleclean.core.Book

/** @Author SemKaminskyi
 *29.10.2021
 */
interface BookCloudMapper : Abstract.Mapper {
    fun map(id: Int, name: String): Book
}