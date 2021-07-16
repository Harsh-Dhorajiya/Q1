package com.gittest.app.modules.cart.`data`.model

import com.gittest.app.R
import com.gittest.app.appcomponents.di.MyApp
import kotlin.String

public data class CartRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtNikeAirZoomP: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_zoom_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt29943: String? = MyApp.getInstance().resources.getString(R.string.lbl_299_43)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt: String? = null
)
