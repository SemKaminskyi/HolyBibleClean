package com.example.holybibleclean.core

import junit.framework.Assert.assertTrue
import org.junit.Test
import java.io.IOException
import java.lang.Exception

class AbstractTest {

    @Test
    fun test_success() {
        val dataObject = TestDataObject.Succes("a", "b")
        val domainObj = dataObject.map(DataMapper.Base())
        assertTrue(domainObj is DomainObject.Succes)

    }

    @Test
    fun fail() {
        val dataObject = TestDataObject.Fail(IOException())
        val domainObj = dataObject.map(DataMapper.Base())
        assertTrue(domainObj is DomainObject.Fail)

    }

    private sealed class TestDataObject : Abstract.Object<DomainObject, DataMapper>() {
        abstract override fun map(mapper: DataMapper): DomainObject

        class Succes(private val text1: String, private val text2: String) : TestDataObject() {
            override fun map(mapper: DataMapper): DomainObject {
                return mapper.map(text1, text2)
            }

        }

        class Fail(private val exception: Exception) : TestDataObject() {
            override fun map(mapper: DataMapper): DomainObject {
                return mapper.map(exception)
            }

        }
    }

    private interface DataMapper : Abstract.Mapper {
        fun map(text1: String, text2: String): DomainObject
        fun map(exception: Exception): DomainObject

        class Base : DataMapper {
            override fun map(text1: String, text2: String): DomainObject {
                return DomainObject.Succes("$text1 $text2")
            }

            override fun map(exception: Exception): DomainObject {
                return DomainObject.Fail()
            }
        }
    }

    private sealed class DomainObject : Abstract.Object<UiObj, DomainToUiObj>() {
        class Succes(private val textCombine: String) : DomainObject() {
            override fun map(mapper: DomainToUiObj): UiObj {
                TODO("Not yet implemented")
            }

        }

        class Fail : DomainObject() {
            override fun map(mapper: DomainToUiObj): UiObj {
                TODO("Not yet implemented")
            }
        }
    }

    private interface DomainToUiObj : Abstract.Mapper

    private sealed class UiObj:Abstract.Object<Unit, Abstract.Mapper.Empty>(){

    }

}