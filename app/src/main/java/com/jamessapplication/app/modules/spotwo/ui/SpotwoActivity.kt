package com.jamessapplication.app.modules.spotwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.base.BaseActivity
import com.jamessapplication.app.databinding.ActivitySpotwoBinding
import com.jamessapplication.app.modules.homescreen.ui.HomescreenActivity
import com.jamessapplication.app.modules.spotwo.`data`.model.SpotwoRowModel
import com.jamessapplication.app.modules.spotwo.`data`.viewmodel.SpotwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SpotwoActivity : BaseActivity<ActivitySpotwoBinding>(R.layout.activity_spotwo) {
  private val viewModel: SpotwoVM by viewModels<SpotwoVM>()

  private val REQUEST_CODE_HOMESCREEN_ACTIVITY: Int = 531


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val spotwoAdapter = SpotwoAdapter(viewModel.spotwoList.value?:mutableListOf())
    binding.recyclerSpotwo.adapter = spotwoAdapter
    spotwoAdapter.setOnItemClickListener(
    object : SpotwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SpotwoRowModel) {
        onClickRecyclerSpotwo(view, position, item)
      }
    }
    )
    viewModel.spotwoList.observe(this) {
      spotwoAdapter.updateData(it)
    }
    binding.spotwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowarrowright.setOnClickListener {
      val destIntent = HomescreenActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOMESCREEN_ACTIVITY)
    }
  }

  fun onClickRecyclerSpotwo(
    view: View,
    position: Int,
    item: SpotwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SPOTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SpotwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
