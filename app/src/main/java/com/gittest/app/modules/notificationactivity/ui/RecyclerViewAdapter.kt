package com.gittest.app.modules.notificationactivity.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gittest.app.R
import com.gittest.app.databinding.RowNotificationActivityBinding
import com.gittest.app.modules.notificationactivity.`data`.model.NotificationActivityRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<NotificationActivityRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowNotificationActivityVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowNotificationActivityVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_notification_activity,parent,false)
    return RowNotificationActivityVH(view)
  }

  public override fun onBindViewHolder(holder: RowNotificationActivityVH, position: Int): Unit {
    val notificationActivityRowModel = NotificationActivityRowModel()
    // TODO uncomment following line after integration with data source
    // val notificationActivityRowModel = list[position]
    holder.binding.notificationActivityRowModel = notificationActivityRowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: NotificationActivityRowModel
    ): Unit {
    }
  }

  public inner class RowNotificationActivityVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowNotificationActivityBinding =
        RowNotificationActivityBinding.bind(itemView)
  }
}
