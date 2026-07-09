package com.example.parcialfinal.ui.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
sealed class Screens : NavKey{
    @Serializable
    data object Menu : Screens()

    @Serializable
    data object Pregunta : Screens()

    @Serializable
    data object Resultado : Screens()
}
