package com.jamessapplication.app.modules.accountdeletion.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.base.BaseActivity
import com.jamessapplication.app.databinding.ActivityAccountDeletionBinding
import com.jamessapplication.app.modules.accountdeletion.`data`.viewmodel.AccountDeletionVM
import com.jamessapplication.app.modules.scannfc.ui.ScanNfcActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AccountDeletionActivity :
    BaseActivity<ActivityAccountDeletionBinding>(R.layout.activity_account_deletion) {
  private val viewModel: AccountDeletionVM by viewModels<AccountDeletionVM>()

  private val REQUEST_CODE_SCAN_NFC_ACTIVITY: Int = 627


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.accountDeletionVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnDeleteNow.setOnClickListener {
      val destIntent = ScanNfcActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SCAN_NFC_ACTIVITY)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ACCOUNT_DELETION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AccountDeletionActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
