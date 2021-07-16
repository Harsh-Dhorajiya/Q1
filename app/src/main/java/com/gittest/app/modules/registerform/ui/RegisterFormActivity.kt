package com.gittest.app.modules.registerform.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.gittest.app.R
import com.gittest.app.databinding.ActivityRegisterFormBinding
import com.gittest.app.modules.registerform.`data`.viewmodel.RegisterFormVM
import kotlin.String
import kotlin.Unit

public class RegisterFormActivity : AppCompatActivity() {
  private lateinit var binding: ActivityRegisterFormBinding

  private val viewModel: RegisterFormVM by viewModels<RegisterFormVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_register_form)
    binding.lifecycleOwner = this
    binding.registerFormVM = viewModel
  }

  public companion object {
    public const val TAG: String = "REGISTER_FORM_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegisterFormActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
