package com.gittest.app.modules.lailyfafebrinacard.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.gittest.app.R
import com.gittest.app.databinding.ActivityLailyfaFebrinaCardBinding
import com.gittest.app.modules.lailyfafebrinacard.`data`.viewmodel.LailyfaFebrinaCardVM
import kotlin.String
import kotlin.Unit

public class LailyfaFebrinaCardActivity : AppCompatActivity() {
  private lateinit var binding: ActivityLailyfaFebrinaCardBinding

  private val viewModel: LailyfaFebrinaCardVM by viewModels<LailyfaFebrinaCardVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_lailyfa_febrina_card)
    binding.lifecycleOwner = this
    binding.lailyfaFebrinaCardVM = viewModel
  }

  public companion object {
    public const val TAG: String = "LAILYFA_FEBRINA_CARD_ACTIVITY"
  }
}
