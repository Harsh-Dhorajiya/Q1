package com.gittest.app.modules.productdetail.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gittest.app.R
import com.gittest.app.databinding.RowProductDetailBinding
import com.gittest.app.modules.productdetail.`data`.model.ProductDetailRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<ProductDetailRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowProductDetailVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowProductDetailVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_product_detail,parent,false)
    return RowProductDetailVH(view)
  }

  public override fun onBindViewHolder(holder: RowProductDetailVH, position: Int): Unit {
    val productDetailRowModel = ProductDetailRowModel()
    // TODO uncomment following line after integration with data source
    // val productDetailRowModel = list[position]
    holder.binding.productDetailRowModel = productDetailRowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: ProductDetailRowModel
    ): Unit {
    }
  }

  public inner class RowProductDetailVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowProductDetailBinding = RowProductDetailBinding.bind(itemView)
  }
}
