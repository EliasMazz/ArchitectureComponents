package com.eliasmazz.androidcomponents

import android.arch.lifecycle.ViewModel

class NewsViewModel : ViewModel(){
    fun getNewsArticles() = DummyDataProvider.getDummyNews()
}