package com.jamessapplication.app.modules.welcome.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.base.BaseActivity
import com.jamessapplication.app.databinding.ActivityWelcomeBinding
import com.jamessapplication.app.modules.homescreen.ui.HomescreenActivity
import com.jamessapplication.app.modules.welcome.`data`.viewmodel.WelcomeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class WelcomeActivity : BaseActivity<ActivityWelcomeBinding>(R.layout.activity_welcome) {
  private val viewModel: WelcomeVM by viewModels<WelcomeVM>()

  private val REQUEST_CODE_HOMESCREEN_ACTIVITY: Int = 950

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.welcomeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnStart.setOnClickListener {
      val destIntent = HomescreenActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOMESCREEN_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "WELCOME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WelcomeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
