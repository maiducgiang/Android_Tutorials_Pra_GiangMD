package com.example.sun_project

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sun_project.overview.OverviewFragment

class ThreeActivity : AppCompatActivity(), OverviewFragment.OverViewCallback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)
        var secondFragment: OverviewFragment = OverviewFragment()
        secondFragment.overViewCallback = this
//        secondFragment.setCallBack(this)
        val arguments = Bundle()
        arguments.putInt("int", 123)
        secondFragment.setArguments(/* args = */ arguments)
        supportFragmentManager.beginTransaction().add(R.id.overviewFragment, secondFragment)
            .commit()
    }

    override fun test(a: Int) {

        super.test(a)
        a
    }
}