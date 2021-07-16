package com.gittest.app.modules.cart.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.gittest.app.R
import com.gittest.app.databinding.ActivityCartBinding
import com.gittest.app.modules.cart.`data`.model.CartRowModel
import com.gittest.app.modules.cart.`data`.viewmodel.CartVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class CartActivity : AppCompatActivity() {
  private lateinit var binding: ActivityCartBinding

  private val viewModel: CartVM by viewModels<CartVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: CartRowModel
  ): Unit {
    when(view.id) {
    }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_cart)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item : CartRowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.cartVM = viewModel
  }

  public companion object {
    public const val TAG: String = "CART_ACTIVITY"
  }
}
