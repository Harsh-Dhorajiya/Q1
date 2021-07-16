package com.gittest.app.modules.productdetail.`data`.model

import com.gittest.app.R
import com.gittest.app.appcomponents.di.MyApp
import kotlin.String

public data class ProductDetailModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtSeeMore: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_more)

)
