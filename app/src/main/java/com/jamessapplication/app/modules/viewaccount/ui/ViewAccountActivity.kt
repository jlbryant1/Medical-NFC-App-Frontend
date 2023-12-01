package com.jamessapplication.app.modules.viewaccount.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.base.BaseActivity
import com.jamessapplication.app.databinding.ActivityViewAccountBinding
import com.jamessapplication.app.modules.homescreen.ui.HomescreenActivity
import com.jamessapplication.app.modules.scannfc.ui.ScanNfcActivity
import com.jamessapplication.app.modules.viewaccount.`data`.viewmodel.ViewAccountVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ViewAccountActivity : BaseActivity<ActivityViewAccountBinding>(R.layout.activity_view_account)
    {
  private val viewModel: ViewAccountVM by viewModels<ViewAccountVM>()

  private val REQUEST_CODE_SCAN_NFC_ACTIVITY: Int = 688


  private val REQUEST_CODE_HOMESCREEN_ACTIVITY: Int = 346


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.viewAccountVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnNo.setOnClickListener {
      val destIntent = ScanNfcActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SCAN_NFC_ACTIVITY)
    }
    binding.btnYes.setOnClickListener {
      val destIntent = HomescreenActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOMESCREEN_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "VIEW_ACCOUNT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ViewAccountActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
