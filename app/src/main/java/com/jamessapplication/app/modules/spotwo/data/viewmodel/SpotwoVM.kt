package com.jamessapplication.app.modules.spotwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jamessapplication.app.modules.spotwo.`data`.model.SpotwoModel
import com.jamessapplication.app.modules.spotwo.`data`.model.SpotwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SpotwoVM : ViewModel(), KoinComponent {
  val spotwoModel: MutableLiveData<SpotwoModel> = MutableLiveData(SpotwoModel())

  var navArguments: Bundle? = null

  val spotwoList: MutableLiveData<MutableList<SpotwoRowModel>> = MutableLiveData(mutableListOf())
}
