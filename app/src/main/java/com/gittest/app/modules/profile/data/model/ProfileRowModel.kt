package com.gittest.app.modules.profile.`data`.model

import com.gittest.app.R
import com.gittest.app.appcomponents.di.MyApp
import kotlin.String

public data class ProfileRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtGender: String? = MyApp.getInstance().resources.getString(R.string.lbl_gender)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtMale: String? = MyApp.getInstance().resources.getString(R.string.lbl_male)

)
