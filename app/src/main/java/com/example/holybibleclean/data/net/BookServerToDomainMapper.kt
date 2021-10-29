package com.example.holybibleclean.data.net

import com.example.holybibleclean.core.Abstract
import com.example.holybibleclean.data.BookData

/** @Author SemKaminskyi
 *29.10.2021
 */
interface BookServerToDomainMapper : Abstract.Mapper {
    fun map(id: Int, name: String): BookData
}