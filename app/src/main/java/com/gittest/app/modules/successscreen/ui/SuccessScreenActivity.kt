package com.gittest.app.modules.successscreen.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.gittest.app.R
import com.gittest.app.databinding.ActivitySuccessScreenBinding
import com.gittest.app.modules.successscreen.`data`.viewmodel.SuccessScreenVM
import kotlin.String
import kotlin.Unit

public class SuccessScreenActivity : AppCompatActivity() {
  private lateinit var binding: ActivitySuccessScreenBinding

  private val viewModel: SuccessScreenVM by viewModels<SuccessScreenVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_success_screen)
    binding.lifecycleOwner = this
    binding.successScreenVM = viewModel
  }

  public companion object {
    public const val TAG: String = "SUCCESS_SCREEN_ACTIVITY"
  }
}
