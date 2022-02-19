package dev.ogabek.signin_signup.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import dev.ogabek.signin_signup.R
import dev.ogabek.signin_signup.model.InfoPage

class MainFragmentAdapter(val context: Context, val data: List<InfoPage>): PagerAdapter(){
    override fun getCount() = data.size

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val info = data[position]
        val view = LayoutInflater.from(context.applicationContext).inflate(R.layout.item_main_fragment, container, false)
        val title: TextView = view.findViewById(R.id.item_title)
        val text: TextView = view.findViewById(R.id.item_text)
        title.text = info.title
        text.text = info.text
        val viewPager = container as ViewPager
        viewPager.addView(view, 0)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val viewPager = container as ViewPager
        val view = `object` as View
        viewPager.removeView(view)
    }

}