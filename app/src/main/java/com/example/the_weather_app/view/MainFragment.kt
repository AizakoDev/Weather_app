package com.example.the_weather_app.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.the_weather_app.R

class MainFragment: Fragment() {

    /*1*/ companion object{
        fun newInstance(): Companion {
            return MainFragment
        }
    }
    /*2*/   //или просто: fun newInstance = MainFragment

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, savedInstanceState)
    }

}


