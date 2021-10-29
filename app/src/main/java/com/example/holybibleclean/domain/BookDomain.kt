package com.example.holybibleclean.domain

import com.example.holybibleclean.core.Abstract
import com.example.holybibleclean.presentation.BookUI

sealed class BookDomain: Abstract.Object<BookUI, Abstract.Mapper.Empty>() {
}