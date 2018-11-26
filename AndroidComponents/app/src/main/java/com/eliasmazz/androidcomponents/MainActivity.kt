package com.eliasmazz.androidcomponents

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //lifecycle.addObserver(MusicObserver(this))

        /*
        val counterViewModel = ViewModelProviders.of(this).get(CounterViewModel::class.java)
        count.text = counterViewModel.counter.toString()
        increment.setOnClickListener {
            counterViewModel.counter++
            count.text = counterViewModel.counter.toString()
        }
        */

        /*
        val adapter = NewsAdapter()
        news_list.layoutManager = LinearLayoutManager(this)
        news_list.adapter = adapter

        val newsViewModel = ViewModelProviders.of(this).get(NewsViewModel::class.java)
        adapter.swapArticles(newsViewModel.getNewsArticles())
        */

        val counterViewModel = ViewModelProviders.of(this).get(CounterViewModel::class.java)
        counterViewModel.counter.observe(this, Observer {
            count.text = it.toString()
        })

        increment.setOnClickListener{
            counterViewModel.increment()
        }
    }
}
