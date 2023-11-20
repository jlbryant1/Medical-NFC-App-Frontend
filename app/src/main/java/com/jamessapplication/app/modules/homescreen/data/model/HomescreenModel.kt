package com.jamessapplication.app.modules.homescreen.`data`.model

import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomescreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcome: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome2)
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
  var txtSkinTemperatur: String? =
      MyApp.getInstance().resources.getString(R.string.msg_skin_temperatur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBloodOxygenSa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_blood_oxygen_sa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeartRateVari: String? =
      MyApp.getInstance().resources.getString(R.string.msg_heart_rate_vari)

)
