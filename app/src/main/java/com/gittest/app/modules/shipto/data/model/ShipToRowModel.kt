package com.gittest.app.modules.shipto.`data`.model

import com.gittest.app.R
import com.gittest.app.appcomponents.di.MyApp
import kotlin.String

public data class ShipToRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtPriscekila: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_priscekila)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt3711SpringHil: String? =
      MyApp.getInstance().resources.getString(R.string.msg_3711_spring_hil)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt991234567890: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_99_1234567890)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etEditValue: String? = null
)
