package com.jamessapplication.app.modules.userdetails.`data`.model

import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class UserDetailsModel(
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
  var txtGender: String? = MyApp.getInstance().resources.getString(R.string.lbl_male)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGenderOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_female)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOther: String? = MyApp.getInstance().resources.getString(R.string.lbl_other)

)
