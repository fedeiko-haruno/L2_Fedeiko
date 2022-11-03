package com.example.l2_fedeiko.ui.t

import android.content.Intent
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import com.example.l2_fedeiko.MainActivity
import com.example.l2_fedeiko.databinding.ActivitySomeTabbedBinding
import com.example.l2_fedeiko.ui.t.ui.main.SectionsPagerAdapter
import com.google.android.material.button.MaterialButton


class SomeTabbedActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySomeTabbedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySomeTabbedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        tabs.setupWithViewPager(viewPager)
        val fab: MaterialButton = binding.fab
        val message_btn:String = "The transition has been made 👌"
        fab.setOnClickListener { view ->
            intent = Intent(this, MainActivity::class.java)
            intent.putExtra("message_value", message_btn)
            startActivity(intent)
        }
    }
}