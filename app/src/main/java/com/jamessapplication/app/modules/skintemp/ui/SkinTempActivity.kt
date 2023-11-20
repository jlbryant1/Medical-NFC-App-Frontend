package com.jamessapplication.app.modules.skintemp.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.base.BaseActivity
import com.jamessapplication.app.databinding.ActivitySkinTempBinding
import com.jamessapplication.app.modules.homescreen.ui.HomescreenActivity
import com.jamessapplication.app.modules.skintemp.`data`.model.SkinTempRowModel
import com.jamessapplication.app.modules.skintemp.`data`.viewmodel.SkinTempVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SkinTempActivity : BaseActivity<ActivitySkinTempBinding>(R.layout.activity_skin_temp) {
  private val viewModel: SkinTempVM by viewModels<SkinTempVM>()

  private val REQUEST_CODE_HOMESCREEN_ACTIVITY: Int = 448

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val skinTempAdapter = SkinTempAdapter(viewModel.skinTempList.value?:mutableListOf())
    binding.recyclerSkinTemp.adapter = skinTempAdapter
    skinTempAdapter.setOnItemClickListener(
    object : SkinTempAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SkinTempRowModel) {
        onClickRecyclerSkinTemp(view, position, item)
      }
    }
    )
    viewModel.skinTempList.observe(this) {
      skinTempAdapter.updateData(it)
    }
    binding.skinTempVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowarrowright.setOnClickListener {
      val destIntent = HomescreenActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOMESCREEN_ACTIVITY)
    }
  }

  fun onClickRecyclerSkinTemp(
    view: View,
    position: Int,
    item: SkinTempRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SKIN_TEMP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SkinTempActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
