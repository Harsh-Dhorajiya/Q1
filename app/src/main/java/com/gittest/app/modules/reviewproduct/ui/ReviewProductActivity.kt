package com.gittest.app.modules.reviewproduct.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.gittest.app.R
import com.gittest.app.databinding.ActivityReviewProductBinding
import com.gittest.app.modules.reviewproduct.`data`.model.ReviewProductRowModel
import com.gittest.app.modules.reviewproduct.`data`.viewmodel.ReviewProductVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ReviewProductActivity : AppCompatActivity() {
  private lateinit var binding: ActivityReviewProductBinding

  private val viewModel: ReviewProductVM by viewModels<ReviewProductVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: ReviewProductRowModel
  ): Unit {
    when(view.id) {
    }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_review_product)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                object : RecyclerViewAdapter.OnItemClickListener {
                    override fun onItemClick(view:View, position:Int, item : ReviewProductRowModel)
        {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    binding.lifecycleOwner = this
    binding.reviewProductVM = viewModel
  }

  public companion object {
    public const val TAG: String = "REVIEW_PRODUCT_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ReviewProductActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
