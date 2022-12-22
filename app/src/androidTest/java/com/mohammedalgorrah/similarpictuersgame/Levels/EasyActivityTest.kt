package com.mohammedalgorrah.similarpictuersgame.Levels

import android.app.Dialog
import android.content.Intent
import android.os.Handler
import android.widget.Button
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.rule.ActivityTestRule
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import com.mohammedalgorrah.similarpictuersgame.MainActivity
import com.mohammedalgorrah.similarpictuersgame.R
import kotlinx.android.synthetic.main.win_dialog.*
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class EasyActivityTest(val counter: Int) {
    @Rule
    @JvmField
    val activateTestRule: ActivityTestRule<EasyActivity> = ActivityTestRule(EasyActivity::class.java)

    @Test
    fun playGame() {
        activateTestRule.activity.runOnUiThread {
            activateTestRule.activity.getImages()
            activateTestRule.activity.Hide()
            val dialog = Dialog(activateTestRule.activity)
            dialog.setCancelable(false)
            dialog.setContentView(R.layout.timer_dialog)
            val btn = dialog.findViewById<Button>(R.id.btnD)
            btn.setOnClickListener {
                activateTestRule.activity.showw()
                activateTestRule.activity.notEnabled()
                Handler().postDelayed({
                    activateTestRule.activity.backG()
                }, 5000)
                dialog.dismiss()
            }
            dialog.show()
            Thread.sleep(1000)
        }
        Espresso.onView(ViewMatchers.withId(R.id.btnD)).perform(ViewActions.click())
        Thread.sleep(6000)
        when (activateTestRule.activity.solution) {
            1 -> {
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
            2 -> {
                Espresso.onView(ViewMatchers.withId(R.id.img1)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img12)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img2)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img11)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img3)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img10)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img4)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img9)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img5)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img8)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img6)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img7)).perform(ViewActions.click())
                Thread.sleep(1000)
            }
            3 -> {
                Espresso.onView(ViewMatchers.withId(R.id.img1)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img10)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img2)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img11)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img3)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img8)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img4)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img12)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img5)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img7)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img6)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img9)).perform(ViewActions.click())
                Thread.sleep(1000)
            }
            4 -> {
                Espresso.onView(ViewMatchers.withId(R.id.img1)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img11)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img2)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img9)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img3)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img7)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img4)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img8)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img5)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img12)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img6)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img10)).perform(ViewActions.click())
                Thread.sleep(1000)
            }
            5 -> {
                Espresso.onView(ViewMatchers.withId(R.id.img1)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img11)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img2)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img7)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img3)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img10)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img4)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img9)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img5)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img12)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img6)).perform(ViewActions.click())
                Thread.sleep(1000)
                Espresso.onView(ViewMatchers.withId(R.id.img8)).perform(ViewActions.click())
                Thread.sleep(1000)
            }
        }
    }

    @Test
    fun clickCounter() {
        activateTestRule.activity.runOnUiThread {
            assertEquals(6, counter)
//            Assert.fail()
            val d1: Dialog = Dialog(activateTestRule.activity)
            d1.setCancelable(false)
            d1.setContentView(R.layout.win_dialog)
            d1.main.setOnClickListener {
                activateTestRule.activity.activity(MainActivity::class.java, true)
                Animatoo.animateCard(activateTestRule.activity)
            }
            d1.again.setOnClickListener {
                activateTestRule.activity.activity(EasyActivity::class.java, true)
                Animatoo.animateSlideUp(activateTestRule.activity)
            }
            d1.share.setOnClickListener {
                val i = Intent(Intent.ACTION_SEND)
                i.putExtra(
                    Intent.EXTRA_TEXT,
                    "Hello, I have tried a Similar Pictures Game  and I advise you to download it through this link: \n https://play.google.com/store/apps/details?id=com.mohammedalgorrah.similarpictuersgame"
                )
                i.type = "text/plain"
                activateTestRule.activity.startActivity(i)
            }
            d1.show()
        }
    }

    companion object {

        @JvmStatic
        @Parameterized.Parameters
        fun data(): List<Array<Any>> {
            return listOf(
                arrayOf(6),
                arrayOf(12),
                arrayOf(26)
            )
        }
    }
}
