package com.jamessapplication.app.modules.breathingrate.`data`.model

import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BreathingRateModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBreathingRate: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_breathing_rate2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.msg_today_8_may_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundred: String? = MyApp.getInstance().resources.getString(R.string.lbl_100)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNinetySeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_97)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNinetyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_94)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNinetyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_91)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEightyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_88)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEightyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_85)
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
