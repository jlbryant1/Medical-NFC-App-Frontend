package com.jamessapplication.app.modules.completesetup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jamessapplication.app.modules.completesetup.`data`.model.CompleteSetupModel
import org.koin.core.KoinComponent

class CompleteSetupVM : ViewModel(), KoinComponent {
  val completeSetupModel: MutableLiveData<CompleteSetupModel> =
      MutableLiveData(CompleteSetupModel())

  var navArguments: Bundle? = null
}
