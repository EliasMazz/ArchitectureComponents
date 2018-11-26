package com.eliasmazz.androidcomponents

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.news_article_item.view.*

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.NewsHolder>() {

    private var articles: List<NewsArticle> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsAdapter.NewsHolder {
        return NewsHolder(LayoutInflater.from(parent.context).inflate(R.layout.news_article_item, parent, false))
    }

    override fun getItemCount(): Int {
        return articles.size
    }

    override fun onBindViewHolder(holder: NewsAdapter.NewsHolder, position: Int) {
        holder.bind(articles[position])
    }

    fun swapArticles(articles: List<NewsArticle>) {
        this.articles = articles
        notifyDataSetChanged()
    }

    class NewsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(newsArticle: NewsArticle) = with(itemView) {
            news_title.text = newsArticle.title
            news_description.text = newsArticle.description
        }
    }
}