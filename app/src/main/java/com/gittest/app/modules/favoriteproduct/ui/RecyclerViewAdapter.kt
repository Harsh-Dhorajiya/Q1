package com.gittest.app.modules.favoriteproduct.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gittest.app.R
import com.gittest.app.databinding.RowFavoriteProductBinding
import com.gittest.app.modules.favoriteproduct.`data`.model.FavoriteProductRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<FavoriteProductRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowFavoriteProductVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFavoriteProductVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_favorite_product,parent,false)
    return RowFavoriteProductVH(view)
  }

  public override fun onBindViewHolder(holder: RowFavoriteProductVH, position: Int): Unit {
    val favoriteProductRowModel = FavoriteProductRowModel()
    // TODO uncomment following line after integration with data source
    // val favoriteProductRowModel = list[position]
    holder.binding.favoriteProductRowModel = favoriteProductRowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: FavoriteProductRowModel
    ): Unit {
    }
  }

  public inner class RowFavoriteProductVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowFavoriteProductBinding = RowFavoriteProductBinding.bind(itemView)
    init {
      binding.linear.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, FavoriteProductRowModel())
      }
    }
  }
}
