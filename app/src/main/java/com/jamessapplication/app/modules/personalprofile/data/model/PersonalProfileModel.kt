package com.jamessapplication.app.modules.personalprofile.`data`.model

import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PersonalProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEditimage: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_image)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeight: String? = MyApp.getInstance().resources.getString(R.string.lbl_height)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGender: String? = MyApp.getInstance().resources.getString(R.string.lbl_gender)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVerify: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVerifyOne: String? = MyApp.getInstance().resources.getString(R.string.msg_add_emergency_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTwentySevenValue: String? = null
)
