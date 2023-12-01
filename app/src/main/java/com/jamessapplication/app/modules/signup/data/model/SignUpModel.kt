package com.jamessapplication.app.modules.signup.`data`.model

import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSignUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etInputValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputTwoValue: String? = null
)
