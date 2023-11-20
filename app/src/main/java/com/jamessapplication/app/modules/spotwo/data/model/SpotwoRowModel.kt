package com.jamessapplication.app.modules.spotwo.`data`.model

import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SpotwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtToday: String? = MyApp.getInstance().resources.getString(R.string.lbl_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBloodpres: String? = MyApp.getInstance().resources.getString(R.string.lbl_60_100)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMmhg: String? = MyApp.getInstance().resources.getString(R.string.lbl_mmhg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_14_06)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrevBloodPres: String? = MyApp.getInstance().resources.getString(R.string.lbl_60_100)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMmhgOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_mmhg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_14_06)

)
