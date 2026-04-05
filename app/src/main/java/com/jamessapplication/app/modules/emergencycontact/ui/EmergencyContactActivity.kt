package com.jamessapplication.app.modules.emergencycontact.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.base.BaseActivity
import com.jamessapplication.app.databinding.ActivityEmergencyContactBinding
import com.jamessapplication.app.modules.emergencycontact.`data`.model.ListrectanglethirtynineRowModel
import com.jamessapplication.app.modules.emergencycontact.`data`.viewmodel.EmergencyContactVM
import com.jamessapplication.app.modules.viewaccount.ui.ViewAccountActivity
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EmergencyContactActivity :
    BaseActivity<ActivityEmergencyContactBinding>(R.layout.activity_emergency_contact) {
  private val viewModel: EmergencyContactVM by viewModels<EmergencyContactVM>()

  private val REQUEST_CODE_VIEW_ACCOUNT_ACTIVITY: Int = 620


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectanglethirtynineAdapter =
    ListrectanglethirtynineAdapter(viewModel.listrectanglethirtynineList.value?:mutableListOf())
    binding.recyclerListrectanglethirtynine.adapter = listrectanglethirtynineAdapter
    listrectanglethirtynineAdapter.setOnItemClickListener(
    object : ListrectanglethirtynineAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListrectanglethirtynineRowModel) {
        onClickRecyclerListrectanglethirtynine(view, position, item)
      }
    }
    )
    viewModel.listrectanglethirtynineList.observe(this) {
      listrectanglethirtynineAdapter.updateData(it)
    }
    binding.emergencyContactVM = viewModel
    setUpSearchViewSearchBarListener()
  }

  override fun setUpClicks(): Unit {
    binding.linearRowvector.setOnClickListener {
      val destIntent = ViewAccountActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_VIEW_ACCOUNT_ACTIVITY)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListrectanglethirtynine(
    view: View,
    position: Int,
    item: ListrectanglethirtynineRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewSearchBarListener(): Unit {
    binding.searchViewSearchBar.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "EMERGENCY_CONTACT_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, EmergencyContactActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
