package com.praveen.kmptgridtest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform