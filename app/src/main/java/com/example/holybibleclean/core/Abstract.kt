package com.example.holybibleclean.core

import com.example.holybibleclean.data.BookCloudMapper

/**creator SemKaminskyi
 * 28.10.2021
 */
abstract class Abstract {
    abstract class Object <T, M: Mapper>{
        abstract fun map (mapper: BookCloudMapper): T
    }
    interface Mapper {
        class  Empty :Mapper
    }
}