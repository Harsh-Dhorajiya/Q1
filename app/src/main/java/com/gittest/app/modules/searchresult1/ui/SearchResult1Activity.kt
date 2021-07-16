package com.gittest.app.modules.searchresult1.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.gittest.app.R
import com.gittest.app.databinding.ActivitySearchResult1Binding
import com.gittest.app.modules.searchresult1.`data`.viewmodel.SearchResult1VM
import kotlin.String
import kotlin.Unit

public class SearchResult1Activity : AppCompatActivity() {
  private lateinit var binding: ActivitySearchResult1Binding

  private val viewModel: SearchResult1VM by viewModels<SearchResult1VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_search_result1)
    binding.lifecycleOwner = this
    binding.searchResult1VM = viewModel
  }

  public companion object {
    public const val TAG: String = "SEARCH_RESULT1ACTIVITY"
  }
}
