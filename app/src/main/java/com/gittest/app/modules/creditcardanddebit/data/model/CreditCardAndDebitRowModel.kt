package com.gittest.app.modules.creditcardanddebit.`data`.model

import com.gittest.app.R
import com.gittest.app.appcomponents.di.MyApp
import kotlin.String

public data class CreditCardAndDebitRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txt63269124: String? = MyApp.getInstance().resources.getString(R.string.msg_6326_9124)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtCardHolder: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_card_holder)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtCardSave: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_save)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtDominicOvo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dominic_ovo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt192042: String? = MyApp.getInstance().resources.getString(R.string.lbl_19_2042)

)
