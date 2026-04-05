package com.jamessapplication.app.modules.createaccount.ui

import androidx.activity.viewModels
import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.base.BaseActivity
import com.jamessapplication.app.databinding.ActivityCreateAccountBinding
import com.jamessapplication.app.modules.createaccount.`data`.viewmodel.CreateAccountVM
import com.jamessapplication.app.modules.scannfc.ui.ScanNfcActivity
import com.jamessapplication.app.modules.signup.ui.SignUpActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CreateAccountActivity :
    BaseActivity<ActivityCreateAccountBinding>(R.layout.activity_create_account) {
  private val viewModel: CreateAccountVM by viewModels<CreateAccountVM>()

  private val REQUEST_CODE_SCAN_NFC_ACTIVITY: Int = 167

  private val REQUEST_CODE_SIGN_UP_ACTIVITY: Int = 574

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.createAccountVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnNo.setOnClickListener {
      val destIntent = ScanNfcActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SCAN_NFC_ACTIVITY)
    }
    binding.btnYes.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SIGN_UP_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "CREATE_ACCOUNT_ACTIVITY"

  }
}
