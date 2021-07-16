package com.gittest.app.modules.reviewproduct.`data`.model

import com.gittest.app.R
import com.gittest.app.appcomponents.di.MyApp
import kotlin.String

public data class ReviewProductRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtLauraOctavian: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_laura_octavian)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtThisIsReally: String? =
      MyApp.getInstance().resources.getString(R.string.msg_this_is_really)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtDecember1020: String? =
      MyApp.getInstance().resources.getString(R.string.msg_december_10_20)

)
