package com.gittest.app.modules.notificationactivity.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.gittest.app.R
import com.gittest.app.databinding.ActivityNotificationActivityBinding
import com.gittest.app.modules.notificationactivity.`data`.model.NotificationActivityRowModel
import com.gittest.app.modules.notificationactivity.`data`.viewmodel.NotificationVMVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class NotificationActivityActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNotificationActivityBinding

    private val viewModel: NotificationVMVM by viewModels<NotificationVMVM>()

    public fun onClickRecyclerView(
        view: View,
        position: Int,
        item: NotificationActivityRowModel
    ): Unit {
    }

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_notification_activity)
        val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
        binding.recyclerView.adapter = recyclerViewAdapter
        recyclerViewAdapter.setOnItemClickListener(
        object : RecyclerViewAdapter.OnItemClickListener {
            override fun onItemClick(view:View, position:Int, item : NotificationActivityRowModel) {
                onClickRecyclerView(view, position, item)
            }
        }
        )
        binding.lifecycleOwner = this
        binding.notificationVMVM = viewModel
    }

    public companion object {
        public const val TAG: String = "NOTIFICATION_ACTIVITY_ACTIVITY"
    }
}
