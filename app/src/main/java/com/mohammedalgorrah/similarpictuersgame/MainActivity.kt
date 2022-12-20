package com.mohammedalgorrah.similarpictuersgame

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.view.MenuItem
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle

    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        error_layout.visibility = View.GONE
//        val connManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
//        val mWifi = connManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI)
        val animate = AnimationUtils.loadAnimation(this, R.anim.right_animation)
        val animate2 = AnimationUtils.loadAnimation(this, R.anim.left_animation)

//        if (mWifi!!.isConnected) {
//            error_layout.visibility = View.GONE
//        } else {
//            start.visibility = View.GONE
//            tv_connect.text = getString(R.string.notConected)
//            error_layout.visibility = View.VISIBLE
//            error_layout.animation = animate
//        }

        startapp_1.loadAd()
        startapp_2.loadAd()
        startapp_3.loadAd()
        startapp_4.loadAd()

        backBtn.setOnClickListener {
            error_layout.animation = animate2
            Handler().postDelayed({
                error_layout.visibility = View.GONE
                Handler().postDelayed({
                    start.visibility = View.VISIBLE
                }, 1200)
            }, 100)
        }

        start.setOnClickListener {
            error_layout.visibility = View.GONE
            val connManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val mWifi = connManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI)
            if (mWifi!!.isConnected) {
                startActivity(Intent(this, level::class.java))
                error_layout.visibility = View.GONE
            } else {
                start.visibility = View.GONE
                tv_connect.text = "Not Connected"
                error_layout.visibility = View.VISIBLE
                error_layout.animation = animate
            }
            backBtn.setOnClickListener {
                error_layout.animation = animate2
                Handler().postDelayed({
                    error_layout.visibility = View.GONE
                    Handler().postDelayed({
                        start.visibility = View.VISIBLE
                    }, 1200)
                }, 100)
            }
        }

        val drawerLayout: DrawerLayout = findViewById(R.id.drawerLayout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.share -> {
                    val i = Intent(Intent.ACTION_SEND)
                    i.putExtra(
                        Intent.EXTRA_TEXT,
                        "Hello, I have tried Memory Game I advise you to download it through this link: \n https://play.google.com/store/apps/details?id=com.mohammedalgorrah.similarpictuersgame"
                    )
                    i.type = "text/plain"
                    startActivity(i)
                }
                R.id.rateUs -> {
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("market://details?id=com.mohammedalgorrah.similarpictuersgame")
                        )
                    )
                }
                R.id.more -> {
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/dev?id=8256623938035718896")
                        )
                    )
                }

                else -> Toast.makeText(this, "else", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
