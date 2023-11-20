package com.jamessapplication.app.modules.hrv.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jamessapplication.app.modules.hrv.`data`.model.HrvModel
import com.jamessapplication.app.modules.hrv.`data`.model.HrvRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HrvVM : ViewModel(), KoinComponent {
  val hrvModel: MutableLiveData<HrvModel> = MutableLiveData(HrvModel())

  var navArguments: Bundle? = null

  val hrvList: MutableLiveData<MutableList<HrvRowModel>> = MutableLiveData(mutableListOf())
}
