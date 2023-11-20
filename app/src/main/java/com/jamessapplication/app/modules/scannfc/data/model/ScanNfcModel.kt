package com.jamessapplication.app.modules.scannfc.`data`.model

import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ScanNfcModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_press_and_get)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNFC: String? = MyApp.getInstance().resources.getString(R.string.lbl_nfc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNFCclosertod: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nfc_closer_to_d)

)
