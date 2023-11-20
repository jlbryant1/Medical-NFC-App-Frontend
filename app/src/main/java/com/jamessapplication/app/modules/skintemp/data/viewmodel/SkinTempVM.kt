package com.jamessapplication.app.modules.skintemp.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jamessapplication.app.modules.skintemp.`data`.model.SkinTempModel
import com.jamessapplication.app.modules.skintemp.`data`.model.SkinTempRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SkinTempVM : ViewModel(), KoinComponent {
  val skinTempModel: MutableLiveData<SkinTempModel> = MutableLiveData(SkinTempModel())

  var navArguments: Bundle? = null

  val skinTempList: MutableLiveData<MutableList<SkinTempRowModel>> =
      MutableLiveData(mutableListOf())
}
