package com.gittest.app.modules.explore.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gittest.app.R
import com.gittest.app.databinding.RowExplore1Binding
import com.gittest.app.modules.explore.`data`.model.Explore1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerView1Adapter(
  public val list: List<Explore1RowModel>
) : RecyclerView.Adapter<RecyclerView1Adapter.RowExplore1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowExplore1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_explore1,parent,false)
    return RowExplore1VH(view)
  }

  public override fun onBindViewHolder(holder: RowExplore1VH, position: Int): Unit {
    val explore1RowModel = Explore1RowModel()
    // TODO uncomment following line after integration with data source
    // val explore1RowModel = list[position]
    holder.binding.explore1RowModel = explore1RowModel
  }

  public override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Explore1RowModel
    ): Unit {
    }
  }

  public inner class RowExplore1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowExplore1Binding = RowExplore1Binding.bind(itemView)
  }
}
