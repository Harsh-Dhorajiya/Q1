package com.gittest.app.modules.notification.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gittest.app.R
import com.gittest.app.databinding.RowNotificationBinding
import com.gittest.app.modules.notification.`data`.model.NotificationRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<NotificationRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowNotificationVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowNotificationVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_notification,parent,false)
    return RowNotificationVH(view)
  }

  public override fun onBindViewHolder(holder: RowNotificationVH, position: Int): Unit {
    val notificationRowModel = NotificationRowModel()
    // TODO uncomment following line after integration with data source
    // val notificationRowModel = list[position]
    holder.binding.notificationRowModel = notificationRowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: NotificationRowModel
    ): Unit {
    }
  }

  public inner class RowNotificationVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowNotificationBinding = RowNotificationBinding.bind(itemView)
    init {
      binding.linear.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, NotificationRowModel())
      }
    }
  }
}
