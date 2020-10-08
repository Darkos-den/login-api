package com.darkos.mvu.login.model

import com.darkos.mvu.models.MVUState

data class WithoutValidationField(
    val value: String
) : MVUState()