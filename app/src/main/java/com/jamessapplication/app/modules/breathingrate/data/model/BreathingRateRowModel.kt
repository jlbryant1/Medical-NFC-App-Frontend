package com.jamessapplication.app.modules.breathingrate.`data`.model

import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BreathingRateRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtToday: String? = MyApp.getInstance().resources.getString(R.string.lbl_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1003)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_14_06)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNinetyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_93)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_14_06)

)
