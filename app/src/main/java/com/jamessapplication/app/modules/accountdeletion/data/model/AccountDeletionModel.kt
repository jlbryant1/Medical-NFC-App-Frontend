package com.jamessapplication.app.modules.accountdeletion.`data`.model

import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AccountDeletionModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtClickbuttonto: String? =
      MyApp.getInstance().resources.getString(R.string.msg_click_button_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_are_you_sure_ab)

)
