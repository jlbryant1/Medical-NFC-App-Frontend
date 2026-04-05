package com.jamessapplication.app.modules.personalprofile.ui

import android.view.View
import androidx.activity.viewModels
import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.base.BaseActivity
import com.jamessapplication.app.appcomponents.views.ImagePickerFragmentDialog
import com.jamessapplication.app.databinding.ActivityPersonalProfileBinding
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

  private val REQUEST_CODE_USER_DETAILS_ACTIVITY: Int = 937

  private val REQUEST_CODE_EMERGENCY_CONTACT_ACTIVITY: Int = 270

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
    binding.btnFrame150.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

          }
      binding.txtVerify.setOnClickListener {
        val destIntent = UserDetailsActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_USER_DETAILS_ACTIVITY)
      }
      binding.imageArrowleft.setOnClickListener {
        finish()
      }
      binding.txtVerifyOne.setOnClickListener {
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

    }
  }
