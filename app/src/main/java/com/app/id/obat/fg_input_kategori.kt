package com.app.id.obat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.util.Log
import kotlinx.android.synthetic.main.fg_input_kategori_layout.view.*


class fg_input_kategori: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view: View = inflater!!.inflate(R.layout.fg_input_kategori_layout, container, false)


        view.imgMata.setOnClickListener { view ->
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.content, fg_cari_mata())
            fragmentTransaction?.commit()
            Log.d("Cek","OKEEE")
        }
        view.tv_tambahKategori.setOnClickListener { view ->
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.content, fg_tambah_kategori())
            fragmentTransaction?.commit()
            Log.d("Cek","OKEEE")
        }
        view.tv_editKategori.setOnClickListener { view ->
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.content, fg_update_kategori())
            fragmentTransaction?.commit()
            Log.d("Cek","OKEEE")
        }

        view.imgMaag.setOnClickListener { view ->
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.content, fg_cari_maag())
            fragmentTransaction?.commit()
            Log.d("Cek","OKEEE")
        }
        view.imgBatuk.setOnClickListener { view ->
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.content, fg_cari_batuk())
            fragmentTransaction?.commit()
            Log.d("Cek","OKEEE")
        }
        view.imgPusing.setOnClickListener { view ->
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.content, fg_cari_pusing())
            fragmentTransaction?.commit()
            Log.d("Cek","OKEEE")
        }
        view.imgGigi.setOnClickListener { view ->
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.content, fg_cari_gigi())
            fragmentTransaction?.commit()
            Log.d("Cek","OKEEE")
        }
        view.imgLuka.setOnClickListener { view ->
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.content, fg_cari_luka())
            fragmentTransaction?.commit()
            Log.d("Cek","OKEEE")
        }


        return view

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