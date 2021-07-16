package com.gittest.app.modules.orderdetails.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.gittest.app.R
import com.gittest.app.databinding.ActivityOrderDetailsBinding
import com.gittest.app.modules.orderdetails.`data`.model.OrderDetailsRowModel
import com.gittest.app.modules.orderdetails.`data`.viewmodel.OrderDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class OrderDetailsActivity : AppCompatActivity() {
  private lateinit var binding: ActivityOrderDetailsBinding

  private val viewModel: OrderDetailsVM by viewModels<OrderDetailsVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: OrderDetailsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_order_details)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item : OrderDetailsRowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.orderDetailsVM = viewModel
  }

  public companion object {
    public const val TAG: String = "ORDER_DETAILS_ACTIVITY"
  }
}
