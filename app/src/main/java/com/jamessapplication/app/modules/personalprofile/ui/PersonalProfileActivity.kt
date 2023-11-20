package com.jamessapplication.app.modules.personalprofile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.base.BaseActivity
import com.jamessapplication.app.appcomponents.views.ImagePickerFragmentDialog
import com.jamessapplication.app.databinding.ActivityPersonalProfileBinding
import com.jamessapplication.app.modules.accountdeletion.ui.AccountDeletionActivity
import com.jamessapplication.app.modules.emergencycontact.ui.EmergencyContactActivity
import com.jamessapplication.app.modules.personalprofile.`data`.model.ListnameRowModel
import com.jamessapplication.app.modules.personalprofile.`data`.viewmodel.PersonalProfileVM
import com.jamessapplication.app.modules.userdetails.ui.UserDetailsActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PersonalProfileActivity :
    BaseActivity<ActivityPersonalProfileBinding>(R.layout.activity_personal_profile) {
  private val viewModel: PersonalProfileVM by viewModels<PersonalProfileVM>()

  private val REQUEST_CODE_USER_DETAILS_ACTIVITY: Int = 954


  private val REQUEST_CODE_ACCOUNT_DELETION_ACTIVITY: Int = 223


  private val REQUEST_CODE_EMERGENCY_CONTACT_ACTIVITY: Int = 781


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listnameAdapter = ListnameAdapter(viewModel.listnameList.value?:mutableListOf())
    binding.recyclerListname.adapter = listnameAdapter
    listnameAdapter.setOnItemClickListener(
    object : ListnameAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListnameRowModel) {
        onClickRecyclerListname(view, position, item)
      }
    }
    )
    viewModel.listnameList.observe(this) {
      listnameAdapter.updateData(it)
    }
    binding.personalProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnEdit.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
    binding.txtVerifyOne.setOnClickListener {
      val destIntent = UserDetailsActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_USER_DETAILS_ACTIVITY)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.txtVerify.setOnClickListener {
      val destIntent = AccountDeletionActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ACCOUNT_DELETION_ACTIVITY)
    }
    binding.txtVerifyTwo.setOnClickListener {
      val destIntent = EmergencyContactActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_EMERGENCY_CONTACT_ACTIVITY)
    }
  }

  fun onClickRecyclerListname(
    view: View,
    position: Int,
    item: ListnameRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PERSONAL_PROFILE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PersonalProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
