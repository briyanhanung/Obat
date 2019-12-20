package com.app.id.obat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var content: FrameLayout? = null
    lateinit var navController: NavController

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_pesanan -> {
                val fragment = fg_pesanan()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_input_kategori -> {
                val fragment = fg_input_kategori()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }

            R.id.navigation_about -> {
                val fragment = fg_about()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun addFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
//            .setCustomAnimations(R.anim.design_bottom_sheet_slide_in, R.anim.design_bottom_sheet_slide_out)
            .replace(R.id.content, fragment, fragment.javaClass.getSimpleName())
            .commit()
    }

    private fun visibilityNavElements(navController: NavController) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nv.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        val fragment = fg_pesanan()
        addFragment(fragment)

//        navController.addOnDestinationChangedListener { _, destination, _ ->
//            when (destination.id) {
//                R.id.fgMata -> nv?.visibility = View.GONE
////                R.id.settings_fragment -> nv?.visibility = View.GONE
////                R.id.detail_fragment -> nv?.visibility = View.GONE
////                R.id.missionPhotoFragment -> nv?.visibility = View.GONE
//                else -> nv?.visibility = View.VISIBLE
//            }
        }
}

