package com.gittest.app.modules.explore.`data`.model

import com.gittest.app.R
import com.gittest.app.appcomponents.di.MyApp
import kotlin.String

public data class ExploreRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtManShirt: String? = MyApp.getInstance().resources.getString(R.string.lbl_man_shirt)

)
