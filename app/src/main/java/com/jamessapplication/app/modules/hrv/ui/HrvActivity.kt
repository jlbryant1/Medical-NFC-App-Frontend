package com.jamessapplication.app.modules.hrv.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.base.BaseActivity
import com.jamessapplication.app.databinding.ActivityHrvBinding
import com.jamessapplication.app.modules.homescreen.ui.HomescreenActivity
import com.jamessapplication.app.modules.hrv.`data`.model.HrvRowModel
import com.jamessapplication.app.modules.hrv.`data`.viewmodel.HrvVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HrvActivity : BaseActivity<ActivityHrvBinding>(R.layout.activity_hrv) {
  private val viewModel: HrvVM by viewModels<HrvVM>()

  private val REQUEST_CODE_HOMESCREEN_ACTIVITY: Int = 362


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val hrvAdapter = HrvAdapter(viewModel.hrvList.value?:mutableListOf())
    binding.recyclerHrv.adapter = hrvAdapter
    hrvAdapter.setOnItemClickListener(
    object : HrvAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HrvRowModel) {
        onClickRecyclerHrv(view, position, item)
      }
    }
    )
    viewModel.hrvList.observe(this) {
      hrvAdapter.updateData(it)
    }
    binding.hrvVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowarrowright.setOnClickListener {
      val destIntent = HomescreenActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOMESCREEN_ACTIVITY)
    }
  }

  fun onClickRecyclerHrv(
    view: View,
    position: Int,
    item: HrvRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HRV_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HrvActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
