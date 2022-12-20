package com.mohammedalgorrah.similarpictuersgame

import android.util.Log
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import kotlinx.android.synthetic.main.activity_level.*
import org.junit.Rule
import org.junit.Test

class levelTest {

    @Rule
    @JvmField
    val activateTestRule: ActivityTestRule<level> = ActivityTestRule(level::class.java)

    @Test
    fun buttonsViewTest() {
        Espresso.onView(withId(R.id.easyBtn))
        Espresso.onView(withId(R.id.mediumBtn))
        Espresso.onView(withId(R.id.hardBtn))
        Espresso.onView(withId(R.id.ProfBtn))
    }

    @Test
    fun buttonClick() {
        when (1) {
            1 -> {
                Espresso.onView(withId(R.id.easyBtn)).perform(click())
                Log.i("myLevel", "Easy level")
            }
            2 -> {
                Espresso.onView(withId(R.id.mediumBtn)).perform(click())
                Log.i("myLevel", "Medium level")
            }
            3 -> {
                Espresso.onView(withId(R.id.hardBtn)).perform(click())
                Log.i("myLevel", "Hard level")
            }
            4 -> {
                Espresso.onView(withId(R.id.ProfBtn)).perform(click())
                Log.i("myLevel", "Professional level")
            }
        }
    }
}
