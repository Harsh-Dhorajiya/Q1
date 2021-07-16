package com.gittest.app.modules.order.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.gittest.app.R
import com.gittest.app.databinding.ActivityOrderBinding
import com.gittest.app.modules.order.`data`.model.OrderRowModel
import com.gittest.app.modules.order.`data`.viewmodel.OrderVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class OrderActivity : AppCompatActivity() {
  private lateinit var binding: ActivityOrderBinding

  private val viewModel: OrderVM by viewModels<OrderVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: OrderRowModel
  ): Unit {
    when(view.id) {
    }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_order)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item : OrderRowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.orderVM = viewModel
  }

  public companion object {
    public const val TAG: String = "ORDER_ACTIVITY"
  }
}
