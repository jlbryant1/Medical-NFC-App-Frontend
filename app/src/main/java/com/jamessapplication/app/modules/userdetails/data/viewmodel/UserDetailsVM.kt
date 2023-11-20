package com.jamessapplication.app.modules.userdetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jamessapplication.app.modules.userdetails.`data`.model.UserDetailsModel
import com.jamessapplication.app.modules.userdetails.`data`.model.UserDetailsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class UserDetailsVM : ViewModel(), KoinComponent {
  val userDetailsModel: MutableLiveData<UserDetailsModel> = MutableLiveData(UserDetailsModel())

  var navArguments: Bundle? = null

  val userDetailsList: MutableLiveData<MutableList<UserDetailsRowModel>> =
      MutableLiveData(mutableListOf())
}
