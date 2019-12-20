package com.app.id.obat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class fg_about : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fg_about_layout, container, false)
    }

    companion object {
        fun newInstance(): fg_input_kategori{
            val fragment = fg_input_kategori()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}