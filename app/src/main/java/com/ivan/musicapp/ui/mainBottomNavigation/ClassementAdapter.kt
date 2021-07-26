package com.ivan.musicapp.ui.mainBottomNavigation

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.ivan.musicapp.ui.list.classementAlbum.ClassementAblumList
import com.ivan.musicapp.ui.list.classementTitreList.ClassementTitreList

@Suppress("DEPRECATION")
internal class ClassementAdapter(
    var context: Context,
    fm: FragmentManager,
    var totalTabs: Int
) :
    FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                ClassementTitreList()
            }
            1 -> {
                ClassementAblumList()
            }
            else -> getItem(position)
        }
    }
    override fun getCount(): Int {
        return totalTabs
    }
}
