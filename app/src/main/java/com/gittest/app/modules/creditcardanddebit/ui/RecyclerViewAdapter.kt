package com.gittest.app.modules.creditcardanddebit.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gittest.app.R
import com.gittest.app.databinding.RowCreditCardAndDebitBinding
import com.gittest.app.modules.creditcardanddebit.`data`.model.CreditCardAndDebitRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<CreditCardAndDebitRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowCreditCardAndDebitVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowCreditCardAndDebitVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_credit_card_and_debit,parent,false)
    return RowCreditCardAndDebitVH(view)
  }

  public override fun onBindViewHolder(holder: RowCreditCardAndDebitVH, position: Int): Unit {
    val creditCardAndDebitRowModel = CreditCardAndDebitRowModel()
    // TODO uncomment following line after integration with data source
    // val creditCardAndDebitRowModel = list[position]
    holder.binding.creditCardAndDebitRowModel = creditCardAndDebitRowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: CreditCardAndDebitRowModel
    ): Unit {
    }
  }

  public inner class RowCreditCardAndDebitVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowCreditCardAndDebitBinding = RowCreditCardAndDebitBinding.bind(itemView)
    init {
      binding.linear.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, CreditCardAndDebitRowModel())
      }
    }
  }
}
