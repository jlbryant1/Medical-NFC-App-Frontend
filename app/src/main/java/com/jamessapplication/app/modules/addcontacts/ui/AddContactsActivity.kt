package com.jamessapplication.app.modules.addcontacts.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.base.BaseActivity
import com.jamessapplication.app.databinding.ActivityAddContactsBinding
import com.jamessapplication.app.modules.addcontacts.`data`.viewmodel.AddContactsVM
import com.jamessapplication.app.modules.emergencycontact.ui.EmergencyContactActivity
import com.jamessapplication.app.modules.scannfc.ui.ScanNfcActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AddContactsActivity : BaseActivity<ActivityAddContactsBinding>(R.layout.activity_add_contacts)
    {
  private val viewModel: AddContactsVM by viewModels<AddContactsVM>()

  private val REQUEST_CODE_EMERGENCY_CONTACT_ACTIVITY: Int = 455

  private val REQUEST_CODE_SCAN_NFC_ACTIVITY: Int = 336

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addContactsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnYes.setOnClickListener {
      val destIntent = EmergencyContactActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_EMERGENCY_CONTACT_ACTIVITY)
    }
    binding.btnNo.setOnClickListener {
      val destIntent = ScanNfcActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SCAN_NFC_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "ADD_CONTACTS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddContactsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
