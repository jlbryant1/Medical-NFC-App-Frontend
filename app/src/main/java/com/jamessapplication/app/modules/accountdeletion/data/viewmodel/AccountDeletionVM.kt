package com.jamessapplication.app.modules.accountdeletion.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jamessapplication.app.modules.accountdeletion.`data`.model.AccountDeletionModel
import org.koin.core.KoinComponent

class AccountDeletionVM : ViewModel(), KoinComponent {
  val accountDeletionModel: MutableLiveData<AccountDeletionModel> =
      MutableLiveData(AccountDeletionModel())

  var navArguments: Bundle? = null
}
