package com.jamessapplication.app.modules.userdetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.base.BaseActivity
import com.jamessapplication.app.appcomponents.views.ImagePickerFragmentDialog
import com.jamessapplication.app.databinding.ActivityUserDetailsBinding
import com.jamessapplication.app.modules.userdetails.`data`.model.UserDetailsRowModel
import com.jamessapplication.app.modules.userdetails.`data`.viewmodel.UserDetailsVM
import com.jamessapplication.app.modules.welcome.ui.WelcomeActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class UserDetailsActivity : BaseActivity<ActivityUserDetailsBinding>(R.layout.activity_user_details)
    {
  private val viewModel: UserDetailsVM by viewModels<UserDetailsVM>()

  private val REQUEST_CODE_WELCOME_ACTIVITY: Int = 203


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val userDetailsAdapter =
    UserDetailsAdapter(viewModel.userDetailsList.value?:mutableListOf())
    binding.recyclerUserDetails.adapter = userDetailsAdapter
    userDetailsAdapter.setOnItemClickListener(
    object : UserDetailsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : UserDetailsRowModel) {
        onClickRecyclerUserDetails(view, position, item)
      }
    }
    )
    viewModel.userDetailsList.observe(this) {
      userDetailsAdapter.updateData(it)
    }
    binding.userDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnEdit.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
    binding.btnVerify.setOnClickListener {
      val destIntent = WelcomeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_WELCOME_ACTIVITY)
    }
  }

  fun onClickRecyclerUserDetails(
    view: View,
    position: Int,
    item: UserDetailsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "USER_DETAILS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, UserDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
