package com.jamessapplication.app.modules.addcontacts.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jamessapplication.app.modules.addcontacts.`data`.model.AddContactsModel
import org.koin.core.KoinComponent

class AddContactsVM : ViewModel(), KoinComponent {
  val addContactsModel: MutableLiveData<AddContactsModel> = MutableLiveData(AddContactsModel())

  var navArguments: Bundle? = null
}
