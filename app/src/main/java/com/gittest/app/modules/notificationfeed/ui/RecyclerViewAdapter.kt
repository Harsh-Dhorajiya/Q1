package com.gittest.app.modules.notificationfeed.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gittest.app.R
import com.gittest.app.databinding.RowNotificationFeedBinding
import com.gittest.app.modules.notificationfeed.`data`.model.NotificationFeedRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<NotificationFeedRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowNotificationFeedVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowNotificationFeedVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_notification_feed,parent,false)
    return RowNotificationFeedVH(view)
  }

  public override fun onBindViewHolder(holder: RowNotificationFeedVH, position: Int): Unit {
    val notificationFeedRowModel = NotificationFeedRowModel()
    // TODO uncomment following line after integration with data source
    // val notificationFeedRowModel = list[position]
    holder.binding.notificationFeedRowModel = notificationFeedRowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: NotificationFeedRowModel
    ): Unit {
    }
  }

  public inner class RowNotificationFeedVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowNotificationFeedBinding = RowNotificationFeedBinding.bind(itemView)
  }
}
