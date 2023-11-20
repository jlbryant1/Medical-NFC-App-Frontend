package com.jamessapplication.app.modules.signup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.jamessapplication.app.R
import com.jamessapplication.app.appcomponents.base.BaseActivity
import com.jamessapplication.app.databinding.ActivitySignUpBinding
import com.jamessapplication.app.modules.login.ui.LoginActivity
import com.jamessapplication.app.modules.signup.`data`.viewmodel.SignUpVM
import com.jamessapplication.app.modules.userdetails.ui.UserDetailsActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SignUpActivity : BaseActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {
  private val viewModel: SignUpVM by viewModels<SignUpVM>()

  private val REQUEST_CODE_USER_DETAILS_ACTIVITY: Int = 737


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtConfirmation.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnGetStarted.setOnClickListener {
      val destIntent = UserDetailsActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_USER_DETAILS_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "SIGN_UP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
