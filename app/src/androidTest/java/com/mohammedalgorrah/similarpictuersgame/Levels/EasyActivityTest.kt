package com.mohammedalgorrah.similarpictuersgame.Levels

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.rule.ActivityTestRule
import com.mohammedalgorrah.similarpictuersgame.R
import kotlinx.android.synthetic.main.activity_easy.*
import org.junit.Assert.* // ktlint-disable no-wildcard-imports
import org.junit.Rule
import org.junit.Test

class EasyActivityTest {
    @Rule
    @JvmField
    val activateTestRule: ActivityTestRule<EasyActivity> = ActivityTestRule(EasyActivity::class.java)

    @Test
    fun playGame() {
        Espresso.onView(ViewMatchers.withId(R.id.btnD)).perform(ViewActions.click())
        activateTestRule.activity.runOnUiThread {
            activateTestRule.activity.getImages()
            Thread.sleep(6000)
        }
        Espresso.onView(ViewMatchers.withId(R.id.img1)).perform(ViewActions.click())
        Thread.sleep(1000)
        Espresso.onView(ViewMatchers.withId(R.id.img7)).perform(ViewActions.click())
        Thread.sleep(1000)
        Espresso.onView(ViewMatchers.withId(R.id.img2)).perform(ViewActions.click())
        Thread.sleep(1000)
        Espresso.onView(ViewMatchers.withId(R.id.img8)).perform(ViewActions.click())
        Thread.sleep(1000)
        Espresso.onView(ViewMatchers.withId(R.id.img3)).perform(ViewActions.click())
        Thread.sleep(1000)
        Espresso.onView(ViewMatchers.withId(R.id.img9)).perform(ViewActions.click())
        Thread.sleep(1000)
        Espresso.onView(ViewMatchers.withId(R.id.img4)).perform(ViewActions.click())
        Thread.sleep(1000)
        Espresso.onView(ViewMatchers.withId(R.id.img10)).perform(ViewActions.click())
        Thread.sleep(1000)
        Espresso.onView(ViewMatchers.withId(R.id.img5)).perform(ViewActions.click())
        Thread.sleep(1000)
        Espresso.onView(ViewMatchers.withId(R.id.img11)).perform(ViewActions.click())
        Thread.sleep(1000)
        Espresso.onView(ViewMatchers.withId(R.id.img6)).perform(ViewActions.click())
        Thread.sleep(1000)
        Espresso.onView(ViewMatchers.withId(R.id.img12)).perform(ViewActions.click())
        Thread.sleep(1000)
    }
}
