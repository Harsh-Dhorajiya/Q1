package com.gittest.app.modules.order.`data`.model

import com.gittest.app.R
import com.gittest.app.appcomponents.di.MyApp
import kotlin.String

public data class OrderRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtLqnsu346jk: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_lqnsu346jk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtOrderAtEComm: String? =
      MyApp.getInstance().resources.getString(R.string.msg_order_at_e_comm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtOrderStatus: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_order_status)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtShipping: String? = MyApp.getInstance().resources.getString(R.string.lbl_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtItems: String? = MyApp.getInstance().resources.getString(R.string.lbl_items)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt2ItemsPurchas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_2_items_purchas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_price)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt29943: String? = MyApp.getInstance().resources.getString(R.string.lbl_299_43)

)
