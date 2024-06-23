package com.cars24.kmptgridtest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform