package com.example.testflashcards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.testflashcards.fragments.CalendarioFragment
import com.example.testflashcards.fragments.InicioFragment
import com.example.testflashcards.fragments.ProgresoFragment
import com.example.testflashcards.fragments.adapters.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpTabs()

    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        var viewPager = findViewById<ViewPager>(R.id.viewPager)
        val tabs = findViewById<TabLayout>(R.id.tabs)


        adapter.addFragment(ProgresoFragment(), "")
        adapter.addFragment(InicioFragment(), "")
        adapter.addFragment(CalendarioFragment(), "")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)

        tabs.getTabAt(0)!!.setIcon(R.drawable.ic_barchart)
        tabs.getTabAt(1)!!.setIcon(R.drawable.ic_home)
        tabs.getTabAt(2)!!.setIcon(R.drawable.ic_calendar)


    }
}