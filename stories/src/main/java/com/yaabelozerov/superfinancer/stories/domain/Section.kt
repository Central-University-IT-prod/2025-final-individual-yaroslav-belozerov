package com.yaabelozerov.superfinancer.stories.domain

import kotlinx.serialization.Serializable

@Serializable
internal data class Section(
    val name: String,
    val key: String
)
