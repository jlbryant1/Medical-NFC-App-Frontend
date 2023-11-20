package com.jamessapplication.app.modules.skintemp.`data`.model

import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SkinTempRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtToday: String? = MyApp.getInstance().resources.getString(R.string.lbl_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNineHundredFiftyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_95_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtF: String? = MyApp.getInstance().resources.getString(R.string.lbl_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_14_06)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNineHundredFiftyFiveOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_95_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_14_06)

)
