package com.gittest.app.modules.notificationfeed.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.gittest.app.R
import com.gittest.app.databinding.ActivityNotificationFeedBinding
import com.gittest.app.modules.notificationfeed.`data`.model.NotificationFeedRowModel
import com.gittest.app.modules.notificationfeed.`data`.viewmodel.NotificationFeedVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class NotificationFeedActivity : AppCompatActivity() {
  private lateinit var binding: ActivityNotificationFeedBinding

  private val viewModel: NotificationFeedVM by viewModels<NotificationFeedVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: NotificationFeedRowModel
  ): Unit {
    when(view.id) {
    }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_notification_feed)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item : NotificationFeedRowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.notificationFeedVM = viewModel
  }

  public companion object {
    public const val TAG: String = "NOTIFICATION_FEED_ACTIVITY"
  }
}
