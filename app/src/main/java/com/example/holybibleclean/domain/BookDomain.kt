package com.example.holybibleclean.domain

import com.example.holybibleclean.core.Abstract
import com.example.holybibleclean.data.net.BookServerModel
import com.example.holybibleclean.presentation.BookUI
import java.lang.Exception

sealed class BookDomain: Abstract.Object<BookUI, Abstract.Mapper.Empty>() {
    class  Success : BookDomain() {
        override fun map(mapper: Abstract.Mapper.Empty): BookUI {
            TODO("Not yet implemented")
        }
    }

    class Fail(): BookDomain() {
        override fun map(mapper: Abstract.Mapper.Empty): BookUI {
            TODO("Not yet implemented")
        }
    }
}