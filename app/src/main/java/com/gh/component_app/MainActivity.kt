package com.gh.component_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alibaba.android.arouter.launcher.ARouter
import com.gh.lib_core.utils.LogUtils
import com.gh.lib_router.login.LoginRoute
import com.gh.lib_router.main.MainRoute
//import com.gh.module_login.LoginActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LogUtils.d("测试组件引用")

        findViewById<View>(R.id.tv_tologin).setOnClickListener {

            ARouter.getInstance().build(LoginRoute.ACTIVITY_LOGIN).navigation()

//            startActivity(Intent(this@MainActivity, LoginActivity::class.java))

        }

        findViewById<View>(R.id.tv_tomain).setOnClickListener {

            ARouter.getInstance().build(MainRoute.ACTIVITY_MAIN).navigation()

        }


    }
}