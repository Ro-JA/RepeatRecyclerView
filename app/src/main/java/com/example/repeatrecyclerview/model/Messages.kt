package com.example.repeatrecyclerview.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Messages(
    @StringRes val stringResources: Int,
    @DrawableRes val drawableRes: Int){

}
