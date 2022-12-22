package com.mohammedalgorrah.similarpictuersgame

import android.content.Context
import android.net.ConnectivityManager
import android.view.View
import android.view.animation.AnimationUtils
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.internal.runner.junit4.statement.UiThreadStatement.runOnUiThread
import androidx.test.rule.ActivityTestRule
import com.mohammedalgorrah.similarpictuersgame.testclasses.WifiTest
import kotlinx.android.synthetic.main.activity_main.*
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner.Silent::class)
class MainActivityTest {
    @Mock
    lateinit var wifiTest: WifiTest

    @Rule
    @JvmField
    val activateTestRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Before
    fun setup() {
        `when`(wifiTest.connection(activateTestRule.activity)).thenReturn(true)
    }

    @Test
    fun connectionTest() {
        runOnUiThread {
            activateTestRule.activity.error_layout.visibility = View.GONE
            val connManager = activateTestRule.activity.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val mWifi = connManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI)!!
            val animate = AnimationUtils.loadAnimation(activateTestRule.activity, R.anim.right_animation)
            val animate2 = AnimationUtils.loadAnimation(activateTestRule.activity, R.anim.left_animation)

            if (mWifi.isConnected) {
                activateTestRule.activity.error_layout.visibility = View.GONE
            } else {
                activateTestRule.activity.start.visibility = View.GONE
                activateTestRule.activity.tv_connect.text = activateTestRule.activity.getString(R.string.notConected)
                activateTestRule.activity.error_layout.visibility = View.VISIBLE
                activateTestRule.activity.error_layout.animation = animate
            }
        }
    }

    @Test
    fun wifiTest1() {
        runOnUiThread {
            val status = wifiTest.connection(activateTestRule.activity)
            Assert.assertEquals(true, status)
        }
    }

    @Test
    fun wifiTest2() {
        runOnUiThread {
            val status = wifiTest.connection(activateTestRule.activity)
            Assert.assertEquals(false, status)
        }
    }

    @Test
    fun startBtnTest() {
        Espresso.onView(withId(R.id.start)).perform(click())
    }
}
