package com.jamessapplication.app.modules.personalprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jamessapplication.app.modules.personalprofile.`data`.model.ListnameRowModel
import com.jamessapplication.app.modules.personalprofile.`data`.model.PersonalProfileModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PersonalProfileVM : ViewModel(), KoinComponent {
  val personalProfileModel: MutableLiveData<PersonalProfileModel> =
      MutableLiveData(PersonalProfileModel())

  var navArguments: Bundle? = null

  val listnameList: MutableLiveData<MutableList<ListnameRowModel>> =
      MutableLiveData(mutableListOf())
}
