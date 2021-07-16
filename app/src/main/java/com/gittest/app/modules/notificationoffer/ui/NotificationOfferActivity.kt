package com.gittest.app.modules.notificationoffer.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.gittest.app.R
import com.gittest.app.databinding.ActivityNotificationOfferBinding
import com.gittest.app.modules.notificationoffer.`data`.model.NotificationOfferRowModel
import com.gittest.app.modules.notificationoffer.`data`.viewmodel.NotificationOfferVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class NotificationOfferActivity : AppCompatActivity() {
  private lateinit var binding: ActivityNotificationOfferBinding

  private val viewModel: NotificationOfferVM by viewModels<NotificationOfferVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: NotificationOfferRowModel
  ): Unit {
    when(view.id) {
    }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_notification_offer)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item : NotificationOfferRowModel)
        {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.notificationOfferVM = viewModel
  }

  public companion object {
    public const val TAG: String = "NOTIFICATION_OFFER_ACTIVITY"
  }
}
