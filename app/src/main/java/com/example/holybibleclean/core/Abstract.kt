package com.example.holybibleclean.core

/**creator SemKaminskyi
 * 28.10.2021
 */
abstract class Abstract {
    abstract class Object <T, M: Mapper>{
        abstract fun map (mapper: M):T
    }
    interface Mapper {
        class  Empty :Mapper
    }
}