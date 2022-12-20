package com.mohammedalgorrah.similarpictuersgame.Levels

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.app.Dialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import coil.load
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.mohammedalgorrah.similarpictuersgame.MainActivity
import com.mohammedalgorrah.similarpictuersgame.R
import kotlinx.android.synthetic.main.activity_easy.*
import kotlinx.android.synthetic.main.activity_medium.*
import kotlinx.android.synthetic.main.activity_medium.img1
import kotlinx.android.synthetic.main.activity_medium.img10
import kotlinx.android.synthetic.main.activity_medium.img11
import kotlinx.android.synthetic.main.activity_medium.img12
import kotlinx.android.synthetic.main.activity_medium.img2
import kotlinx.android.synthetic.main.activity_medium.img3
import kotlinx.android.synthetic.main.activity_medium.img4
import kotlinx.android.synthetic.main.activity_medium.img5
import kotlinx.android.synthetic.main.activity_medium.img6
import kotlinx.android.synthetic.main.activity_medium.img7
import kotlinx.android.synthetic.main.activity_medium.img8
import kotlinx.android.synthetic.main.activity_medium.img9
import kotlinx.android.synthetic.main.activity_medium.startapp_1
import kotlinx.android.synthetic.main.activity_medium.startapp_2
import kotlinx.android.synthetic.main.activity_medium.truu
import kotlinx.android.synthetic.main.lose_dialog.*
import kotlinx.android.synthetic.main.win_dialog.*
import kotlin.random.Random

@Suppress("DEPRECATION")
class MediumActivity : AppCompatActivity() {

    private var db: FirebaseFirestore? = null
    private var count = 0
    private var i1 = ""
    private var i2 = ""
    private var click1: ImageView? = null
    private var tru = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medium)

        db = Firebase.firestore
        getImages()

        startapp_1.loadAd()
        startapp_2.loadAd()

        Hide()
        val dialog = Dialog(this)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.timer_dialog)
        val btn = dialog.findViewById<Button>(R.id.btnD)
        btn.setOnClickListener {
            showw()
            notEnabled()
            Handler().postDelayed({
                backG()
            }, 5500)
            dialog.dismiss()
        }
        dialog.show()
    }

    private fun getImages() {
        val grou = when (Random.nextInt(1, 11)) {
            1 -> "animals"
            2 -> "car"
            3 -> "flag"
            4 -> "tool"
            5 -> "food"
            6 -> "gun"
            7 -> "robot"
            8 -> "building"
            9 -> "job"
            10 -> "toy"
            else -> "animals"
        }

        when (Random.nextInt(1, 6)) {
            1 -> db!!.collection("items").whereEqualTo("group", grou).limit(8).get()
                .addOnSuccessListener { x ->

                    img1.load(x.documents[0].get("image").toString())
                    img2.load(x.documents[1].get("image").toString())
                    img3.load(x.documents[2].get("image").toString())
                    img4.load(x.documents[3].get("image").toString())
                    img5.load(x.documents[4].get("image").toString())
                    img6.load(x.documents[5].get("image").toString())
                    img7.load(x.documents[6].get("image").toString())
                    img8.load(x.documents[7].get("image").toString())

                    img9.load(x.documents[0].get("image").toString())
                    img10.load(x.documents[1].get("image").toString())
                    img11.load(x.documents[2].get("image").toString())
                    img12.load(x.documents[3].get("image").toString())
                    img13.load(x.documents[4].get("image").toString())
                    img14.load(x.documents[5].get("image").toString())
                    img15.load(x.documents[6].get("image").toString())
                    img16.load(x.documents[7].get("image").toString())

                    img1.setOnClickListener {
                        animView(img1, x.documents[0].get("image").toString())
                    }

                    img2.setOnClickListener {
                        animView(img2, x.documents[1].get("image").toString())
                    }

                    img3.setOnClickListener {
                        animView(img3, x.documents[2].get("image").toString())
                    }

                    img4.setOnClickListener {
                        animView(img4, x.documents[3].get("image").toString())
                    }

                    img5.setOnClickListener {
                        animView(img5, x.documents[4].get("image").toString())
                    }

                    img6.setOnClickListener {
                        animView(img6, x.documents[5].get("image").toString())
                    }

                    img7.setOnClickListener {
                        animView(img7, x.documents[6].get("image").toString())
                    }

                    img8.setOnClickListener {
                        animView(img8, x.documents[7].get("image").toString())
                    }

                    img9.setOnClickListener {
                        animView(img9, x.documents[0].get("image").toString())
                    }

                    img10.setOnClickListener {
                        animView(img10, x.documents[1].get("image").toString())
                    }

                    img11.setOnClickListener {
                        animView(img11, x.documents[2].get("image").toString())
                    }

                    img12.setOnClickListener {
                        animView(img12, x.documents[3].get("image").toString())
                    }

                    img13.setOnClickListener {
                        animView(img13, x.documents[4].get("image").toString())
                    }

                    img14.setOnClickListener {
                        animView(img14, x.documents[5].get("image").toString())
                    }

                    img15.setOnClickListener {
                        animView(img15, x.documents[6].get("image").toString())
                    }

                    img16.setOnClickListener {
                        animView(img16, x.documents[7].get("image").toString())
                    }
                }

            2 -> db!!.collection("items").whereEqualTo("group", grou).limit(8).get()
                .addOnSuccessListener { x ->

                    img1.load(x.documents[6].get("image").toString())
                    img2.load(x.documents[3].get("image").toString())
                    img3.load(x.documents[2].get("image").toString())
                    img4.load(x.documents[5].get("image").toString())
                    img5.load(x.documents[4].get("image").toString())
                    img6.load(x.documents[1].get("image").toString())
                    img7.load(x.documents[0].get("image").toString())
                    img8.load(x.documents[7].get("image").toString())

                    img9.load(x.documents[7].get("image").toString())
                    img10.load(x.documents[5].get("image").toString())
                    img11.load(x.documents[6].get("image").toString())
                    img12.load(x.documents[3].get("image").toString())
                    img13.load(x.documents[0].get("image").toString())
                    img14.load(x.documents[1].get("image").toString())
                    img15.load(x.documents[4].get("image").toString())
                    img16.load(x.documents[2].get("image").toString())

                    img1.setOnClickListener {
                        animView(img1, x.documents[6].get("image").toString())
                    }

                    img2.setOnClickListener {
                        animView(img2, x.documents[3].get("image").toString())
                    }

                    img3.setOnClickListener {
                        animView(img3, x.documents[2].get("image").toString())
                    }

                    img4.setOnClickListener {
                        animView(img4, x.documents[5].get("image").toString())
                    }

                    img5.setOnClickListener {
                        animView(img5, x.documents[4].get("image").toString())
                    }

                    img6.setOnClickListener {
                        animView(img6, x.documents[1].get("image").toString())
                    }

                    img7.setOnClickListener {
                        animView(img7, x.documents[0].get("image").toString())
                    }

                    img8.setOnClickListener {
                        animView(img8, x.documents[7].get("image").toString())
                    }

                    img9.setOnClickListener {
                        animView(img9, x.documents[7].get("image").toString())
                    }

                    img10.setOnClickListener {
                        animView(img10, x.documents[5].get("image").toString())
                    }

                    img11.setOnClickListener {
                        animView(img11, x.documents[6].get("image").toString())
                    }

                    img12.setOnClickListener {
                        animView(img12, x.documents[3].get("image").toString())
                    }

                    img13.setOnClickListener {
                        animView(img13, x.documents[0].get("image").toString())
                    }

                    img14.setOnClickListener {
                        animView(img14, x.documents[1].get("image").toString())
                    }

                    img15.setOnClickListener {
                        animView(img15, x.documents[4].get("image").toString())
                    }

                    img16.setOnClickListener {
                        animView(img16, x.documents[2].get("image").toString())
                    }
                }

            3 -> db!!.collection("items").whereEqualTo("group", grou).limit(8).get()
                .addOnSuccessListener { x ->

                    img1.load(x.documents[6].get("image").toString())
                    img2.load(x.documents[3].get("image").toString())
                    img3.load(x.documents[2].get("image").toString())
                    img4.load(x.documents[5].get("image").toString())
                    img5.load(x.documents[4].get("image").toString())
                    img6.load(x.documents[1].get("image").toString())
                    img7.load(x.documents[0].get("image").toString())
                    img8.load(x.documents[7].get("image").toString())

                    img9.load(x.documents[0].get("image").toString())
                    img10.load(x.documents[7].get("image").toString())
                    img11.load(x.documents[1].get("image").toString())
                    img12.load(x.documents[4].get("image").toString())
                    img13.load(x.documents[5].get("image").toString())
                    img14.load(x.documents[2].get("image").toString())
                    img15.load(x.documents[3].get("image").toString())
                    img16.load(x.documents[6].get("image").toString())

                    img1.setOnClickListener {
                        animView(img1, x.documents[6].get("image").toString())
                    }

                    img2.setOnClickListener {
                        animView(img2, x.documents[3].get("image").toString())
                    }

                    img3.setOnClickListener {
                        animView(img3, x.documents[2].get("image").toString())
                    }

                    img4.setOnClickListener {
                        animView(img4, x.documents[5].get("image").toString())
                    }

                    img5.setOnClickListener {
                        animView(img5, x.documents[4].get("image").toString())
                    }

                    img6.setOnClickListener {
                        animView(img6, x.documents[1].get("image").toString())
                    }

                    img7.setOnClickListener {
                        animView(img7, x.documents[0].get("image").toString())
                    }

                    img8.setOnClickListener {
                        animView(img8, x.documents[7].get("image").toString())
                    }

                    img9.setOnClickListener {
                        animView(img9, x.documents[0].get("image").toString())
                    }

                    img10.setOnClickListener {
                        animView(img10, x.documents[7].get("image").toString())
                    }

                    img11.setOnClickListener {
                        animView(img11, x.documents[1].get("image").toString())
                    }

                    img12.setOnClickListener {
                        animView(img12, x.documents[4].get("image").toString())
                    }

                    img13.setOnClickListener {
                        animView(img13, x.documents[5].get("image").toString())
                    }

                    img14.setOnClickListener {
                        animView(img14, x.documents[2].get("image").toString())
                    }

                    img15.setOnClickListener {
                        animView(img15, x.documents[3].get("image").toString())
                    }

                    img16.setOnClickListener {
                        animView(img16, x.documents[6].get("image").toString())
                    }
                }

            4 -> db!!.collection("items").whereEqualTo("group", grou).limit(8).get()
                .addOnSuccessListener { x ->

                    img1.load(x.documents[0].get("image").toString())
                    img2.load(x.documents[3].get("image").toString())
                    img3.load(x.documents[1].get("image").toString())
                    img4.load(x.documents[7].get("image").toString())
                    img5.load(x.documents[2].get("image").toString())
                    img6.load(x.documents[4].get("image").toString())
                    img7.load(x.documents[6].get("image").toString())
                    img8.load(x.documents[5].get("image").toString())

                    img9.load(x.documents[3].get("image").toString())
                    img10.load(x.documents[6].get("image").toString())
                    img11.load(x.documents[5].get("image").toString())
                    img12.load(x.documents[4].get("image").toString())
                    img13.load(x.documents[1].get("image").toString())
                    img14.load(x.documents[2].get("image").toString())
                    img15.load(x.documents[0].get("image").toString())
                    img16.load(x.documents[7].get("image").toString())

                    img1.setOnClickListener {
                        animView(img1, x.documents[0].get("image").toString())
                    }

                    img2.setOnClickListener {
                        animView(img2, x.documents[3].get("image").toString())
                    }

                    img3.setOnClickListener {
                        animView(img3, x.documents[1].get("image").toString())
                    }

                    img4.setOnClickListener {
                        animView(img4, x.documents[7].get("image").toString())
                    }

                    img5.setOnClickListener {
                        animView(img5, x.documents[2].get("image").toString())
                    }

                    img6.setOnClickListener {
                        animView(img6, x.documents[4].get("image").toString())
                    }

                    img7.setOnClickListener {
                        animView(img7, x.documents[6].get("image").toString())
                    }

                    img8.setOnClickListener {
                        animView(img8, x.documents[5].get("image").toString())
                    }

                    img9.setOnClickListener {
                        animView(img9, x.documents[3].get("image").toString())
                    }

                    img10.setOnClickListener {
                        animView(img10, x.documents[6].get("image").toString())
                    }

                    img11.setOnClickListener {
                        animView(img11, x.documents[5].get("image").toString())
                    }

                    img12.setOnClickListener {
                        animView(img12, x.documents[4].get("image").toString())
                    }

                    img13.setOnClickListener {
                        animView(img13, x.documents[1].get("image").toString())
                    }

                    img14.setOnClickListener {
                        animView(img14, x.documents[2].get("image").toString())
                    }

                    img15.setOnClickListener {
                        animView(img15, x.documents[0].get("image").toString())
                    }

                    img16.setOnClickListener {
                        animView(img16, x.documents[7].get("image").toString())
                    }
                }

            5 -> db!!.collection("items").whereEqualTo("group", grou).limit(8).get()
                .addOnSuccessListener { x ->

                    img1.load(x.documents[7].get("image").toString())
                    img2.load(x.documents[6].get("image").toString())
                    img3.load(x.documents[5].get("image").toString())
                    img4.load(x.documents[4].get("image").toString())
                    img5.load(x.documents[0].get("image").toString())
                    img6.load(x.documents[1].get("image").toString())
                    img7.load(x.documents[2].get("image").toString())
                    img8.load(x.documents[3].get("image").toString())

                    img9.load(x.documents[0].get("image").toString())
                    img10.load(x.documents[1].get("image").toString())
                    img11.load(x.documents[2].get("image").toString())
                    img12.load(x.documents[3].get("image").toString())
                    img13.load(x.documents[7].get("image").toString())
                    img14.load(x.documents[6].get("image").toString())
                    img15.load(x.documents[5].get("image").toString())
                    img16.load(x.documents[4].get("image").toString())

                    img1.setOnClickListener {
                        animView(img1, x.documents[7].get("image").toString())
                    }

                    img2.setOnClickListener {
                        animView(img2, x.documents[6].get("image").toString())
                    }

                    img3.setOnClickListener {
                        animView(img3, x.documents[5].get("image").toString())
                    }

                    img4.setOnClickListener {
                        animView(img4, x.documents[4].get("image").toString())
                    }

                    img5.setOnClickListener {
                        animView(img5, x.documents[0].get("image").toString())
                    }

                    img6.setOnClickListener {
                        animView(img6, x.documents[1].get("image").toString())
                    }

                    img7.setOnClickListener {
                        animView(img7, x.documents[2].get("image").toString())
                    }

                    img8.setOnClickListener {
                        animView(img8, x.documents[3].get("image").toString())
                    }

                    img9.setOnClickListener {
                        animView(img9, x.documents[0].get("image").toString())
                    }

                    img10.setOnClickListener {
                        animView(img10, x.documents[1].get("image").toString())
                    }

                    img11.setOnClickListener {
                        animView(img11, x.documents[2].get("image").toString())
                    }

                    img12.setOnClickListener {
                        animView(img12, x.documents[3].get("image").toString())
                    }

                    img13.setOnClickListener {
                        animView(img13, x.documents[7].get("image").toString())
                    }

                    img14.setOnClickListener {
                        animView(img14, x.documents[6].get("image").toString())
                    }

                    img15.setOnClickListener {
                        animView(img15, x.documents[5].get("image").toString())
                    }

                    img16.setOnClickListener {
                        animView(img16, x.documents[4].get("image").toString())
                    }
                }
        }
    }

    private fun backG() {
        img1.load(R.drawable.img111)
        img2.load(R.drawable.img111)
        img3.load(R.drawable.img111)
        img4.load(R.drawable.img111)
        img5.load(R.drawable.img111)
        img6.load(R.drawable.img111)
        img7.load(R.drawable.img111)
        img8.load(R.drawable.img111)
        img9.load(R.drawable.img111)
        img10.load(R.drawable.img111)
        img11.load(R.drawable.img111)
        img12.load(R.drawable.img111)
        img13.load(R.drawable.img111)
        img14.load(R.drawable.img111)
        img15.load(R.drawable.img111)
        img16.load(R.drawable.img111)
    }

    private fun iff(imgx: ImageView, click: ImageView) {
        val animate2: AnimatorSet =
            AnimatorInflater.loadAnimator(this, R.animator.flip2) as AnimatorSet
        val animate3: AnimatorSet =
            AnimatorInflater.loadAnimator(this, R.animator.flip2) as AnimatorSet
        Handler().postDelayed({
            imgx.isEnabled = true
            click.isEnabled = true
            imgx.load(R.drawable.img111)
            click.load(R.drawable.img111)
        }, 1000)

        Handler().postDelayed({
            animate2.setTarget(imgx)
            animate2.start()

            animate3.setTarget(click)
            animate3.start()
        }, 600)
    }

    private fun animFlip(imgx: ImageView) {
        val animate1: AnimatorSet =
            AnimatorInflater.loadAnimator(this, R.animator.flip) as AnimatorSet

        animate1.setTarget(imgx)
        animate1.start()
    }

    private fun animView(imgx: ImageView, path: String) {
        animFlip(imgx)
        Handler().postDelayed({
            imgx.setBackgroundResource(R.drawable.img222)
            imgx.load(path)

            if (i1 == "") {
                i1 = path
                imgx.isEnabled = false
                click1 = imgx
            } else if (i1 != "" && i2 == "") {
                i2 = path
                if (i2 == i1) {
                    imgx.isEnabled = false
                    click1!!.isEnabled = false
                    i2 = ""
                    i1 = ""
                    count += 1
                    tru += 1
                    counterr()
                    truu.text = tru.toString()
                } else if (i2 != i1) {
                    i2 = ""
                    i1 = ""
                    iff(imgx, click1!!)
                    tru += 1
                    counterr()
                    truu.text = tru.toString()
                }
            }
        }, 750)
    }

    private fun counterr() {
        if (count == 8) {
            val d = Dialog(this)
            d.setCancelable(false)
            d.setContentView(R.layout.win_dialog)
            d.main.setOnClickListener {
                activity(MainActivity::class.java, true)
                Animatoo.animateCard(this)
            }
            d.again.setOnClickListener {
                activity(MediumActivity::class.java, true)
                Animatoo.animateSlideUp(this)
            }
            d.share.setOnClickListener {
                val i = Intent(Intent.ACTION_SEND)
                i.putExtra(
                    Intent.EXTRA_TEXT,
                    "Hello, I have tried a Similar Pictures Game  and I advise you to download it through this link: \n https://play.google.com/store/apps/details?id=com.mohammedalgorrah.similarpictuersgame"
                )
                i.type = "text/plain"
                startActivity(i)
            }
            d.more.setOnClickListener {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("market://details?id=com.mohammedalgorrah.similarpictuersgame")
                    )
                )
            }
            d.show()
        } else if (tru == 18) {
            val d = Dialog(this)
            d.setCancelable(false)
            d.setContentView(R.layout.lose_dialog)

            d.mainl.setOnClickListener {
                activity(MainActivity::class.java, true)
                Animatoo.animateCard(this)
            }
            d.againl.setOnClickListener {
                activity(MediumActivity::class.java, true)
                Animatoo.animateSlideUp(this)
            }
            d.sharel.setOnClickListener {
                val i = Intent(Intent.ACTION_SEND)
                i.putExtra(
                    Intent.EXTRA_TEXT,
                    "Hello, I have tried a Similar Pictures Game  and I advise you to download it through this link: \n https://play.google.com/store/apps/details?id=com.mohammedalgorrah.similarpictuersgame"
                )
                i.type = "text/plain"
                startActivity(i)
            }
            d.morel.setOnClickListener {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("market://details?id=com.mohammedalgorrah.similarpictuersgame")
                    )
                )
            }

            d.show()
        }
    }

    private fun activity(cl: Class<*>, B: Boolean) {
        startActivity(Intent(this, cl))
        if (B) {
            finish()
        }
    }

    private fun notEnabled() {
        img1.isEnabled = false
        img2.isEnabled = false
        img3.isEnabled = false
        img4.isEnabled = false
        img5.isEnabled = false
        img6.isEnabled = false
        img7.isEnabled = false
        img8.isEnabled = false
        img9.isEnabled = false
        img10.isEnabled = false
        img11.isEnabled = false
        img12.isEnabled = false
        img13.isEnabled = false
        img14.isEnabled = false
        img15.isEnabled = false
        img16.isEnabled = false

        Handler().postDelayed({
            img1.isEnabled = true
            img2.isEnabled = true
            img3.isEnabled = true
            img4.isEnabled = true
            img5.isEnabled = true
            img6.isEnabled = true
            img7.isEnabled = true
            img8.isEnabled = true
            img9.isEnabled = true
            img10.isEnabled = true
            img11.isEnabled = true
            img12.isEnabled = true
            img13.isEnabled = true
            img14.isEnabled = true
            img15.isEnabled = true
            img16.isEnabled = true
        }, 5300)
    }

    private fun Hide() {
        img1.isVisible = false
        img2.isVisible = false
        img3.isVisible = false
        img4.isVisible = false
        img5.isVisible = false
        img6.isVisible = false
        img7.isVisible = false
        img8.isVisible = false
        img9.isVisible = false
        img10.isVisible = false
        img11.isVisible = false
        img12.isVisible = false
        img13.isVisible = false
        img14.isVisible = false
        img15.isVisible = false
        img16.isVisible = false
    }

    private fun showw() {
        img1.isVisible = true
        img2.isVisible = true
        img3.isVisible = true
        img4.isVisible = true
        img5.isVisible = true
        img6.isVisible = true
        img7.isVisible = true
        img8.isVisible = true
        img9.isVisible = true
        img10.isVisible = true
        img11.isVisible = true
        img12.isVisible = true
        img13.isVisible = true
        img14.isVisible = true
        img15.isVisible = true
        img16.isVisible = true
    }
}
