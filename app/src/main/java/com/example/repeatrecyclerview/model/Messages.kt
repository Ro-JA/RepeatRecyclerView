package com.example.repeatrecyclerview.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Messages(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)

