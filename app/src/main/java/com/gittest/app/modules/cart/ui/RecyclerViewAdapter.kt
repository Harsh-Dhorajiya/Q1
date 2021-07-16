package com.gittest.app.modules.cart.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gittest.app.R
import com.gittest.app.databinding.RowCartBinding
import com.gittest.app.modules.cart.`data`.model.CartRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<CartRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowCartVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCartVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_cart,parent,false)
    return RowCartVH(view)
  }

  public override fun onBindViewHolder(holder: RowCartVH, position: Int): Unit {
    val cartRowModel = CartRowModel()
    // TODO uncomment following line after integration with data source
    // val cartRowModel = list[position]
    holder.binding.cartRowModel = cartRowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: CartRowModel
    ): Unit {
    }
  }

  public inner class RowCartVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowCartBinding = RowCartBinding.bind(itemView)
  }
}
