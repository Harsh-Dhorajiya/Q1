package com.gittest.app.modules.reviewproduct.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gittest.app.R
import com.gittest.app.databinding.RowReviewProductBinding
import com.gittest.app.modules.reviewproduct.`data`.model.ReviewProductRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<ReviewProductRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowReviewProductVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowReviewProductVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_review_product,parent,false)
    return RowReviewProductVH(view)
  }

  public override fun onBindViewHolder(holder: RowReviewProductVH, position: Int): Unit {
    val reviewProductRowModel = ReviewProductRowModel()
    // TODO uncomment following line after integration with data source
    // val reviewProductRowModel = list[position]
    holder.binding.reviewProductRowModel = reviewProductRowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: ReviewProductRowModel
    ): Unit {
    }
  }

  public inner class RowReviewProductVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowReviewProductBinding = RowReviewProductBinding.bind(itemView)
  }
}
