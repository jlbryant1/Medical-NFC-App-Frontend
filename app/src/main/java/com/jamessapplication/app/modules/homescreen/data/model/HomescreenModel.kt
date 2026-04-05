package com.jamessapplication.app.modules.homescreen.`data`.model

import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomescreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcome: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourVitals: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_vitals)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBreathingRate: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_breathing_rate)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSleep: String? = MyApp.getInstance().resources.getString(R.string.lbl_sleep)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUserActivity: String? = MyApp.getInstance().resources.getString(R.string.lbl_user_activity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeartRate: String? = MyApp.getInstance().resources.getString(R.string.lbl_heart_rate)

)
