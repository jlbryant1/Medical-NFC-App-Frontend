package com.jamessapplication.app.modules.scannfc.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jamessapplication.app.modules.scannfc.`data`.model.ScanNfcModel
import org.koin.core.KoinComponent

class ScanNfcVM : ViewModel(), KoinComponent {
  val scanNfcModel: MutableLiveData<ScanNfcModel> = MutableLiveData(ScanNfcModel())

  var navArguments: Bundle? = null
}
