package com.gittest.app.modules.notificationoffer.`data`.model

import com.gittest.app.R
import com.gittest.app.appcomponents.di.MyApp
import kotlin.String

public data class NotificationOfferRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtTheBestTitle: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_the_best_title)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtCulpaCillumCo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_culpa_cillum_co)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtApril302014: String? =
      MyApp.getInstance().resources.getString(R.string.msg_april_30_2014)

)
