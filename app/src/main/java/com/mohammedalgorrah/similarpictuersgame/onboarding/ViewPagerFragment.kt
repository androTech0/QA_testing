package com.mohammedalgorrah.similarpictuersgame.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mohammedalgorrah.similarpictuersgame.R
import com.mohammedalgorrah.similarpictuersgame.onboarding.screens.*
import kotlinx.android.synthetic.main.fragment_view_pager.view.*

class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen(),
            ForthFragment(),
            FifthFragment()
        )

        val adapter = ViewPagerAdapter(fragmentList,requireActivity().supportFragmentManager, lifecycle)

        view.viewPager.adapter = adapter

        return view
    }

}