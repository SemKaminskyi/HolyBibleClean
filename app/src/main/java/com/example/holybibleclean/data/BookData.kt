package com.example.holybibleclean.data

import com.example.holybibleclean.core.Abstract
import com.example.holybibleclean.domain.BookDomain

sealed class BookData:Abstract.Object<BookDomain, Abstract.Mapper.Empty>() {
}