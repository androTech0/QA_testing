package com.mohammedalgorrah.similarpictuersgame

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.mohammedalgorrah.similarpictuersgame.Levels.EasyActivity
import com.mohammedalgorrah.similarpictuersgame.Levels.HardActivity
import com.mohammedalgorrah.similarpictuersgame.Levels.MediumActivity
import com.mohammedalgorrah.similarpictuersgame.Levels.ProfessionalActivity
import kotlinx.android.synthetic.main.activity_level.*

class level : AppCompatActivity() {
    var x: Int = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level)

        easyBtn.animation = AnimationUtils.loadAnimation(this, R.anim.btn_top_animation)
        mediumBtn.animation = AnimationUtils.loadAnimation(this, R.anim.btn_right_animation)
        hardBtn.animation = AnimationUtils.loadAnimation(this, R.anim.btn_left_animation)
        ProfBtn.animation = AnimationUtils.loadAnimation(this, R.anim.btn_bottom_animation)

        easyBtn.setOnClickListener {
            val i = Intent(this, EasyActivity::class.java)
            startActivity(i)
        }

        mediumBtn.setOnClickListener {
            val i = Intent(this, MediumActivity::class.java)
            startActivity(i)
        }

        hardBtn.setOnClickListener {
            val i = Intent(this, HardActivity::class.java)
            startActivity(i)
        }

        ProfBtn.setOnClickListener {
            val i = Intent(this, ProfessionalActivity::class.java)
            startActivity(i)
        }
    }
}
