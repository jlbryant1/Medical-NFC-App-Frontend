package com.jamessapplication.app.modules.viewaccount.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jamessapplication.app.modules.viewaccount.`data`.model.ViewAccountModel
import org.koin.core.KoinComponent

class ViewAccountVM : ViewModel(), KoinComponent {
  val viewAccountModel: MutableLiveData<ViewAccountModel> = MutableLiveData(ViewAccountModel())

  var navArguments: Bundle? = null
}
