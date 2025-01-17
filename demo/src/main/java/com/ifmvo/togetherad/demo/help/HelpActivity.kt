package com.ifmvo.togetherad.demo.help

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ifmvo.togetherad.demo.R
import kotlinx.android.synthetic.main.activity_help.*

/**
 * 采坑指南
 *
 * Created by Matthew Chen on 2020/5/22.
 */
class HelpActivity : AppCompatActivity() {

    companion object {
        fun action(context: Context) {
            context.startActivity(Intent(context, HelpActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        val txt = """
            
广告法要求所有广告必须有广告的标示，否则会有风险。
原生广告需要特别注意这一点，因为原生自渲染需要开发者自己写布局，而开屏、激励、Banner横幅、这类广告平台会自动添加广告标示。

-----------------------------------------------------

待完善...
        """.trimIndent()
        tvText.text = txt
    }
}