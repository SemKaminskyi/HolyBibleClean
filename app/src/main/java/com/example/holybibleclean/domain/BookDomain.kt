package com.example.holybibleclean.domain

import com.example.holybibleclean.core.Abstract
import com.example.holybibleclean.data.BookCloudMapper
import com.example.holybibleclean.presentation.BookUI

sealed class BookDomain: Abstract.Object<BookUI, Abstract.Mapper.Empty>() {
    class  Success : BookDomain() {
        override fun map(mapper: BookCloudMapper): BookUI {
            TODO("Not yet implemented")
        }
    }

    class Fail(): BookDomain() {
        override fun map(mapper: BookCloudMapper): BookUI {
            TODO("Not yet implemented")
        }
    }
}