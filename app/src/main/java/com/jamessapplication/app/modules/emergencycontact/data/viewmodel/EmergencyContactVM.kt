package com.jamessapplication.app.modules.emergencycontact.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jamessapplication.app.modules.emergencycontact.`data`.model.EmergencyContactModel
import com.jamessapplication.app.modules.emergencycontact.`data`.model.ListrectanglethirtynineRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EmergencyContactVM : ViewModel(), KoinComponent {
  val emergencyContactModel: MutableLiveData<EmergencyContactModel> =
      MutableLiveData(EmergencyContactModel())

  var navArguments: Bundle? = null

  val listrectanglethirtynineList: MutableLiveData<MutableList<ListrectanglethirtynineRowModel>> =
      MutableLiveData(mutableListOf())
}
