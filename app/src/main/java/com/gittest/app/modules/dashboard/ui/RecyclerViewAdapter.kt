package com.gittest.app.modules.dashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gittest.app.R
import com.gittest.app.databinding.RowDashboardBinding
import com.gittest.app.modules.dashboard.`data`.model.DashboardRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<DashboardRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowDashboardVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDashboardVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_dashboard,parent,false)
    return RowDashboardVH(view)
  }

  public override fun onBindViewHolder(holder: RowDashboardVH, position: Int): Unit {
    val dashboardRowModel = DashboardRowModel()
    // TODO uncomment following line after integration with data source
    // val dashboardRowModel = list[position]
    holder.binding.dashboardRowModel = dashboardRowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: DashboardRowModel
    ): Unit {
    }
  }

  public inner class RowDashboardVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowDashboardBinding = RowDashboardBinding.bind(itemView)
    init {
      binding.linear.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, DashboardRowModel())
      }
    }
  }
}
