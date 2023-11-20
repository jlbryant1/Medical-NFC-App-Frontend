package com.jamessapplication.app.modules.breathingrate.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jamessapplication.app.modules.breathingrate.`data`.model.BreathingRateModel
import com.jamessapplication.app.modules.breathingrate.`data`.model.BreathingRateRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class BreathingRateVM : ViewModel(), KoinComponent {
  val breathingRateModel: MutableLiveData<BreathingRateModel> =
      MutableLiveData(BreathingRateModel())

  var navArguments: Bundle? = null

  val breathingRateList: MutableLiveData<MutableList<BreathingRateRowModel>> =
      MutableLiveData(mutableListOf())
}
