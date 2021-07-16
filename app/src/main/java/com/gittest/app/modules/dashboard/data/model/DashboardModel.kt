package com.gittest.app.modules.dashboard.`data`.model

import com.gittest.app.R
import com.gittest.app.appcomponents.di.MyApp
import kotlin.String

public data class DashboardModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtSearchProduct: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_search_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtMoreCategory: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_more_category)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtMegaSale: String? = MyApp.getInstance().resources.getString(R.string.lbl_mega_sale)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtSeeMore: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtExplore: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtCart: String? = MyApp.getInstance().resources.getString(R.string.lbl_cart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtOffer: String? = MyApp.getInstance().resources.getString(R.string.lbl_offer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtAccount: String? = MyApp.getInstance().resources.getString(R.string.lbl_account)

)
