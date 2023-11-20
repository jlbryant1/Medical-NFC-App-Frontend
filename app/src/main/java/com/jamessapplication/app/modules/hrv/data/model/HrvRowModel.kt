package com.jamessapplication.app.modules.hrv.`data`.model

import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HrvRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtToday: String? = MyApp.getInstance().resources.getString(R.string.lbl_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_90)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMs: String? = MyApp.getInstance().resources.getString(R.string.lbl_ms)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_14_06)

)
