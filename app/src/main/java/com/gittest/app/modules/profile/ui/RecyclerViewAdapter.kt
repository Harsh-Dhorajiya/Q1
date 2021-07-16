package com.gittest.app.modules.profile.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gittest.app.R
import com.gittest.app.databinding.RowProfileBinding
import com.gittest.app.modules.profile.`data`.model.ProfileRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<ProfileRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowProfileVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowProfileVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_profile,parent,false)
    return RowProfileVH(view)
  }

  public override fun onBindViewHolder(holder: RowProfileVH, position: Int): Unit {
    val profileRowModel = ProfileRowModel()
    // TODO uncomment following line after integration with data source
    // val profileRowModel = list[position]
    holder.binding.profileRowModel = profileRowModel
  }

  public override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: ProfileRowModel
    ): Unit {
    }
  }

  public inner class RowProfileVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowProfileBinding = RowProfileBinding.bind(itemView)
    init {
      binding.linear.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ProfileRowModel())
      }
    }
  }
}
