package com.example.sun_project_10_7.network

import com.squareup.moshi.Json

data class MarsPhoto (
    val id: String, @Json(name = "img_src") val imgSrcUrl: String
)