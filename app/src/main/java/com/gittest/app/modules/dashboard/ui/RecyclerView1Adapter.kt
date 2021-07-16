package com.gittest.app.modules.dashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gittest.app.R
import com.gittest.app.databinding.RowDashboard1Binding
import com.gittest.app.modules.dashboard.`data`.model.Dashboard1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerView1Adapter(
  public val list: List<Dashboard1RowModel>
) : RecyclerView.Adapter<RecyclerView1Adapter.RowDashboard1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDashboard1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_dashboard1,parent,false)
    return RowDashboard1VH(view)
  }

  public override fun onBindViewHolder(holder: RowDashboard1VH, position: Int): Unit {
    val dashboard1RowModel = Dashboard1RowModel()
    // TODO uncomment following line after integration with data source
    // val dashboard1RowModel = list[position]
    holder.binding.dashboard1RowModel = dashboard1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Dashboard1RowModel
    ): Unit {
    }
  }

  public inner class RowDashboard1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowDashboard1Binding = RowDashboard1Binding.bind(itemView)
  }
}
