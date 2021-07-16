package com.gittest.app.modules.choosecreditordebitcard.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.gittest.app.R
import com.gittest.app.databinding.ActivityChooseCreditOrDebitCardBinding
import com.gittest.app.modules.choosecreditordebitcard.`data`.viewmodel.ChooseCreditOrDebitCardVM
import kotlin.String
import kotlin.Unit

public class ChooseCreditOrDebitCardActivity : AppCompatActivity() {
  private lateinit var binding: ActivityChooseCreditOrDebitCardBinding

  private val viewModel: ChooseCreditOrDebitCardVM by viewModels<ChooseCreditOrDebitCardVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_choose_credit_or_debit_card)
    binding.lifecycleOwner = this
    binding.chooseCreditOrDebitCardVM = viewModel
  }

  public companion object {
    public const val TAG: String = "CHOOSE_CREDIT_OR_DEBIT_CARD_ACTIVITY"
  }
}
