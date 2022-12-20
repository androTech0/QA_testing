package com.mohammedalgorrah.similarpictuersgame.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.mohammedalgorrah.similarpictuersgame.R
import kotlinx.android.synthetic.main.fragment_third_screen.view.nextBtn

class ThirdScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_third_screen, container, false)

        val viewPager =  activity?.findViewById<ViewPager2>(R.id.viewPager)

        view.nextBtn.setOnClickListener {
            viewPager?.currentItem = 3
        }
        return view

    }



}