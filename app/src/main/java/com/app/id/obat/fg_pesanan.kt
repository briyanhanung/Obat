package com.app.id.obat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class fg_pesanan : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fg_pesanan_layout, container, false)
    }

    companion object {
        fun newInstance(): fg_pesanan{
            val fragment = fg_pesanan()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}