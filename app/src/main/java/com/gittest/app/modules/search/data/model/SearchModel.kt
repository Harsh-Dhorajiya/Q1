package com.gittest.app.modules.search.`data`.model

import com.gittest.app.R
import com.gittest.app.appcomponents.di.MyApp
import kotlin.String

public data class SearchModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtNikeAirMax27: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_max_27)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etNikeAirMaxValue: String? = null
)
