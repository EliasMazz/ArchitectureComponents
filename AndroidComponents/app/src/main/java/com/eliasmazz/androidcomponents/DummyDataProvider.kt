package com.eliasmazz.androidcomponents

object DummyDataProvider {

    fun getDummyNews() = listOf(
        NewsArticle("Android Architecture", "Android Architecture Components"),
        NewsArticle("Kotlin", "Official programming language for Android"),
        NewsArticle("Food", "I am a foodie")
    )

}