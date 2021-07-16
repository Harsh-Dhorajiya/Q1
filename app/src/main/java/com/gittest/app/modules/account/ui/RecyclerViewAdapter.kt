package com.gittest.app.modules.account.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gittest.app.R
import com.gittest.app.databinding.RowAccountBinding
import com.gittest.app.modules.account.`data`.model.AccountRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<AccountRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowAccountVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowAccountVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_account,parent,false)
    return RowAccountVH(view)
  }

  public override fun onBindViewHolder(holder: RowAccountVH, position: Int): Unit {
    val accountRowModel = AccountRowModel()
    // TODO uncomment following line after integration with data source
    // val accountRowModel = list[position]
    holder.binding.accountRowModel = accountRowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: AccountRowModel
    ): Unit {
    }
  }

  public inner class RowAccountVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowAccountBinding = RowAccountBinding.bind(itemView)
    init {
      binding.linear.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, AccountRowModel())
      }
    }
  }
}
