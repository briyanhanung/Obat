package com.app.id.obat

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fg_cari_gigi_layout.view.*
import kotlinx.android.synthetic.main.fg_cari_mata_layout.view.*

class fg_cari_gigi: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view: View = inflater!!.inflate(R.layout.fg_cari_gigi_layout, container, false)

        view.tv_edit_obatgigi.setOnClickListener { view ->
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.content, fg_edit_obat())
            fragmentTransaction?.commit()
            Log.d("Cek","OKEEE")
        }
        view.tv_tambah_obatgigi.setOnClickListener { view ->
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.content, fg_tambah_obat())
            fragmentTransaction?.commit()
            Log.d("Cek","OKEEE")
        }
        return view
    }

    companion object {
        fun newInstance(): fg_cari_gigi{
            val fragment = fg_cari_gigi()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}