package com.jamessapplication.app.modules.emergencycontact.`data`.model

import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListrectanglethirtynineRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPhone: String? = MyApp.getInstance().resources.getString(R.string.lbl_phone)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_name2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNine: String? = MyApp.getInstance().resources.getString(R.string.lbl2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRelation: String? = MyApp.getInstance().resources.getString(R.string.lbl_relation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTen: String? = MyApp.getInstance().resources.getString(R.string.lbl2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEleven: String? = MyApp.getInstance().resources.getString(R.string.lbl2)

)
