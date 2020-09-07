package com.example.l4s_album

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val preview = Intent(this,PreviewActivity::class.java)

        val img: Array<Img> = arrayOf(
                Img(R.drawable.sea_image,"海"),
                Img(R.drawable.cat_image,"猫"),
                Img(R.drawable.dog_image,"犬"),
                Img(R.drawable.cake_image,"ケーキ"),
                Img(R.drawable.night_image,"夜景"),
                Img(R.drawable.flower_image,"花")
        )

        albumImage1.setOnClickListener {
            album(img[0],preview)
        }

        albumImage2.setOnClickListener {
            album(img[1],preview)
        }

        albumImage3.setOnClickListener {
            album(img[2],preview)
        }

        albumImage4.setOnClickListener {
            album(img[3],preview)
        }

        albumImage5.setOnClickListener {
            album(img[4],preview)
        }

        albumImage6.setOnClickListener {
            album(img[5],preview)
        }
    }

    fun album(img: Img,preview: Intent) {
        preview.putExtra("image",img.resID)
        preview.putExtra("title",img.title)
        startActivity(preview)
    }

    class Img (var resID:Int, var title :String){

    }

}
