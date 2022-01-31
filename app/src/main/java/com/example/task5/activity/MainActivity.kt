package com.example.task5.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.task5.R
import com.example.task5.adapter.ViewPagerAdapter
import com.example.task5.fragment.ContactFragment
import com.example.task5.fragment.PostFragment
import com.example.task5.fragment.UserFragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }
    private fun initViews(){
        val viewPager = findViewById<ViewPager>(R.id.vp_viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tl_tabLayout)

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.add(ContactFragment(), "Contacts")
        adapter.add(UserFragment(), "Users")
        adapter.add(PostFragment(), "Post")

        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)
    }
}