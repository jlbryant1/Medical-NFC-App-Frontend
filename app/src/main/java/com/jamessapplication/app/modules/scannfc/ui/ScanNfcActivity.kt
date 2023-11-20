package com.jamessapplication.app.modules.scannfc.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.base.BaseActivity
import com.jamessapplication.app.databinding.ActivityScanNfcBinding
import com.jamessapplication.app.modules.login.ui.LoginActivity
import com.jamessapplication.app.modules.scannfc.`data`.viewmodel.ScanNfcVM
import kotlin.String
import kotlin.Unit

class ScanNfcActivity : BaseActivity<ActivityScanNfcBinding>(R.layout.activity_scan_nfc) {
  private val viewModel: ScanNfcVM by viewModels<ScanNfcVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanNfcVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.viewCirclebgacti.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SCAN_NFC_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScanNfcActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
