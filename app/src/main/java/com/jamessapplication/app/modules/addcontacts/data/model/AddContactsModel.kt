package com.jamessapplication.app.modules.addcontacts.`data`.model

import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AddContactsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWouldyoulike: String? =
      MyApp.getInstance().resources.getString(R.string.msg_would_you_like4)

)
