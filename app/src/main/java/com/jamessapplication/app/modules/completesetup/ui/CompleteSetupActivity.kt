package com.jamessapplication.app.modules.completesetup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.base.BaseActivity
import com.jamessapplication.app.databinding.ActivityCompleteSetupBinding
import com.jamessapplication.app.modules.completesetup.`data`.viewmodel.CompleteSetupVM
import com.jamessapplication.app.modules.scannfc.ui.ScanNfcActivity
import com.jamessapplication.app.modules.userdetails.ui.UserDetailsActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CompleteSetupActivity :
    BaseActivity<ActivityCompleteSetupBinding>(R.layout.activity_complete_setup) {
  private val viewModel: CompleteSetupVM by viewModels<CompleteSetupVM>()

  private val REQUEST_CODE_SCAN_NFC_ACTIVITY: Int = 488

  private val REQUEST_CODE_USER_DETAILS_ACTIVITY: Int = 120

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.completeSetupVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnNo.setOnClickListener {
      val destIntent = ScanNfcActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SCAN_NFC_ACTIVITY)
    }
    binding.btnYes.setOnClickListener {
      val destIntent = UserDetailsActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_USER_DETAILS_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "COMPLETE_SETUP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CompleteSetupActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
