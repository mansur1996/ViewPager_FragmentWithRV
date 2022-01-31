package com.example.task5.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter (fm : FragmentManager) : FragmentPagerAdapter(fm) {

    private val fragments : ArrayList<Fragment> = ArrayList()
    private val fragmentTitle : ArrayList<String> = ArrayList()

    fun add(fragment: Fragment, title : String){
        fragments.add(fragment)
        fragmentTitle.add(title)
    }

    override fun getCount(): Int  = fragments.size

    override fun getItem(position: Int): Fragment = fragments[position]

    override fun getPageTitle(position: Int): CharSequence? = fragmentTitle[position]
}