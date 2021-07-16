package com.gittest.app.modules.searchresult.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gittest.app.R
import com.gittest.app.databinding.RowSearchResultBinding
import com.gittest.app.modules.searchresult.`data`.model.SearchResultRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<SearchResultRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowSearchResultVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSearchResultVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_search_result,parent,false)
    return RowSearchResultVH(view)
  }

  public override fun onBindViewHolder(holder: RowSearchResultVH, position: Int): Unit {
    val searchResultRowModel = SearchResultRowModel()
    // TODO uncomment following line after integration with data source
    // val searchResultRowModel = list[position]
    holder.binding.searchResultRowModel = searchResultRowModel
  }

  public override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: SearchResultRowModel
    ): Unit {
    }
  }

  public inner class RowSearchResultVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSearchResultBinding = RowSearchResultBinding.bind(itemView)
  }
}
