package com.jamessapplication.app.modules.createaccount.`data`.model

import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CreateAccountModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWouldyoulike: String? =
      MyApp.getInstance().resources.getString(R.string.msg_would_you_like)

)
