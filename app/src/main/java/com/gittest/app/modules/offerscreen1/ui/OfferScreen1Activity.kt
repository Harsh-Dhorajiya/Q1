package com.gittest.app.modules.offerscreen1.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.gittest.app.R
import com.gittest.app.databinding.ActivityOfferScreen1Binding
import com.gittest.app.modules.offerscreen1.`data`.viewmodel.OfferScreen1VM
import kotlin.String
import kotlin.Unit

public class OfferScreen1Activity : AppCompatActivity() {
  private lateinit var binding: ActivityOfferScreen1Binding

  private val viewModel: OfferScreen1VM by viewModels<OfferScreen1VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_offer_screen1)
    binding.lifecycleOwner = this
    binding.offerScreen1VM = viewModel
  }

  public companion object {
    public const val TAG: String = "OFFER_SCREEN1ACTIVITY"
  }
}
