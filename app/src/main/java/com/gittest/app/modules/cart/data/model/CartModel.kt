package com.gittest.app.modules.cart.`data`.model

import com.gittest.app.R
import com.gittest.app.appcomponents.di.MyApp
import kotlin.String

public data class CartModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtApply: String? = MyApp.getInstance().resources.getString(R.string.lbl_apply)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtItems3: String? = MyApp.getInstance().resources.getString(R.string.lbl_items_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt59886: String? = MyApp.getInstance().resources.getString(R.string.lbl_598_86)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtShipping: String? = MyApp.getInstance().resources.getString(R.string.lbl_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt4000: String? = MyApp.getInstance().resources.getString(R.string.lbl_40_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtImportCharges: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_import_charges)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt12800: String? = MyApp.getInstance().resources.getString(R.string.lbl_128_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtTotalPrice: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_total_price)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt76686: String? = MyApp.getInstance().resources.getString(R.string.lbl_766_86)
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etEnterCuponCodValue: String? = null
)
