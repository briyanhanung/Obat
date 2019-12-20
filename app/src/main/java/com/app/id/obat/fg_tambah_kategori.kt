package com.app.id.obat


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * A simple [Fragment] subclass.
 */
class fg_tambah_kategori : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fg_tambah_kategori_layout, container, false)
    }

    companion object {
        fun newInstance(): fg_tambah_kategori{
            val fragment = fg_tambah_kategori()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }


}
