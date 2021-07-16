package com.gittest.app.modules.shipto.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gittest.app.R
import com.gittest.app.databinding.RowShipToBinding
import com.gittest.app.modules.shipto.`data`.model.ShipToRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<ShipToRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowShipToVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowShipToVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_ship_to,parent,false)
    return RowShipToVH(view)
  }

  public override fun onBindViewHolder(holder: RowShipToVH, position: Int): Unit {
    val shipToRowModel = ShipToRowModel()
    // TODO uncomment following line after integration with data source
    // val shipToRowModel = list[position]
    holder.binding.shipToRowModel = shipToRowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: ShipToRowModel
    ): Unit {
    }
  }

  public inner class RowShipToVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowShipToBinding = RowShipToBinding.bind(itemView)
  }
}
