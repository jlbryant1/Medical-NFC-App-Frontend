package com.jamessapplication.app.modules.skintemp.`data`.model

import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SkinTempModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSkinTemperatur: String? =
      MyApp.getInstance().resources.getString(R.string.msg_skin_temperatu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.msg_today_8_may_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwoHundredFifty: String? = MyApp.getInstance().resources.getString(R.string.lbl_250)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwoHundred: String? = MyApp.getInstance().resources.getString(R.string.lbl_200)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredFifty: String? = MyApp.getInstance().resources.getString(R.string.lbl_150)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundred: String? = MyApp.getInstance().resources.getString(R.string.lbl_100)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFifty: String? = MyApp.getInstance().resources.getString(R.string.lbl_50)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZero: String? = MyApp.getInstance().resources.getString(R.string.lbl_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_06_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_12_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_18_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGetStarted: String? = MyApp.getInstance().resources.getString(R.string.lbl_back_to_home)

)
