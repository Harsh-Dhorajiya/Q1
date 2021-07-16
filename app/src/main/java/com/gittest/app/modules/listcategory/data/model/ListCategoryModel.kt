package com.gittest.app.modules.listcategory.`data`.model

import com.gittest.app.R
import com.gittest.app.appcomponents.di.MyApp
import kotlin.String

public data class ListCategoryModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtSkirt: String? = MyApp.getInstance().resources.getString(R.string.lbl_skirt)

)
