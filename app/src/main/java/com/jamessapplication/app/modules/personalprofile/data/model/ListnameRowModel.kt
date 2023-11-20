package com.jamessapplication.app.modules.personalprofile.`data`.model

import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListnameRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContact: String? = MyApp.getInstance().resources.getString(R.string.lbl_contact)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateofbirth: String? = MyApp.getInstance().resources.getString(R.string.lbl_date_of_birth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMedicalConditi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_medical_conditi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEighteenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etNineteenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etTwentyValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etTwentyOneValue: String? = null
)
