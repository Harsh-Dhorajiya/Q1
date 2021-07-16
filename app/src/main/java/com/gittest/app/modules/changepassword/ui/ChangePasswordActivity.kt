package com.gittest.app.modules.changepassword.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.gittest.app.R
import com.gittest.app.databinding.ActivityChangePasswordBinding
import com.gittest.app.modules.changepassword.`data`.viewmodel.ChangePasswordVM
import kotlin.String
import kotlin.Unit

public class ChangePasswordActivity : AppCompatActivity() {
  private lateinit var binding: ActivityChangePasswordBinding

  private val viewModel: ChangePasswordVM by viewModels<ChangePasswordVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_change_password)
    binding.lifecycleOwner = this
    binding.changePasswordVM = viewModel
  }

  public companion object {
    public const val TAG: String = "CHANGE_PASSWORD_ACTIVITY"
  }
}
