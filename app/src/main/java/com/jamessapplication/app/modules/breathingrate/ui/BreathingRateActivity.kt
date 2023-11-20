package com.jamessapplication.app.modules.breathingrate.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.base.BaseActivity
import com.jamessapplication.app.databinding.ActivityBreathingRateBinding
import com.jamessapplication.app.modules.breathingrate.`data`.model.BreathingRateRowModel
import com.jamessapplication.app.modules.breathingrate.`data`.viewmodel.BreathingRateVM
import com.jamessapplication.app.modules.homescreen.ui.HomescreenActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class BreathingRateActivity :
    BaseActivity<ActivityBreathingRateBinding>(R.layout.activity_breathing_rate) {
  private val viewModel: BreathingRateVM by viewModels<BreathingRateVM>()

  private val REQUEST_CODE_HOMESCREEN_ACTIVITY: Int = 416


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val breathingRateAdapter =
    BreathingRateAdapter(viewModel.breathingRateList.value?:mutableListOf())
    binding.recyclerBreathingRate.adapter = breathingRateAdapter
    breathingRateAdapter.setOnItemClickListener(
    object : BreathingRateAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : BreathingRateRowModel) {
        onClickRecyclerBreathingRate(view, position, item)
      }
    }
    )
    viewModel.breathingRateList.observe(this) {
      breathingRateAdapter.updateData(it)
    }
    binding.breathingRateVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowarrowright.setOnClickListener {
      val destIntent = HomescreenActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOMESCREEN_ACTIVITY)
    }
  }

  fun onClickRecyclerBreathingRate(
    view: View,
    position: Int,
    item: BreathingRateRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "BREATHING_RATE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BreathingRateActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
