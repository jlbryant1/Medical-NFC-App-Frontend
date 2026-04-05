package com.jamessapplication.app.modules.homescreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.base.BaseActivity
import com.jamessapplication.app.databinding.ActivityHomescreenBinding
import com.jamessapplication.app.modules.breathingrate.ui.BreathingRateActivity
import com.jamessapplication.app.modules.homescreen.`data`.viewmodel.HomescreenVM
import com.jamessapplication.app.modules.hrv.ui.HrvActivity
import com.jamessapplication.app.modules.skintemp.ui.SkinTempActivity
import com.jamessapplication.app.modules.spotwo.ui.SpotwoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomescreenActivity : BaseActivity<ActivityHomescreenBinding>(R.layout.activity_homescreen) {
  private val viewModel: HomescreenVM by viewModels<HomescreenVM>()

  private val REQUEST_CODE_BREATHING_RATE_ACTIVITY: Int = 751


  private val REQUEST_CODE_HRV_ACTIVITY: Int = 540


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homescreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearSkinTemp.setOnClickListener {
      val destIntent = SkinTempActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnobject.setOnClickListener {
      val destIntent = BreathingRateActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_BREATHING_RATE_ACTIVITY)
    }
    binding.linearColumnobjectTwo.setOnClickListener {
      val destIntent = SpotwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHeartRate.setOnClickListener {
      val destIntent = HrvActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HRV_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "HOMESCREEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomescreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
