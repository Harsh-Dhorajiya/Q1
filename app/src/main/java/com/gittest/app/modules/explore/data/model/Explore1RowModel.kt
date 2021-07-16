package com.gittest.app.modules.explore.`data`.model

import com.gittest.app.R
import com.gittest.app.appcomponents.di.MyApp
import kotlin.String

public data class Explore1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtDress: String? = MyApp.getInstance().resources.getString(R.string.lbl_dress)

)
