package com.example.parcialfinal.data.api.user

import com.example.parcialfinal.data.model.Option
import kotlinx.serialization.Serializable

@Serializable
data class RankeUCADTO(
    val id : String,
    val question : String,
    val options : List<Option>
)
)
