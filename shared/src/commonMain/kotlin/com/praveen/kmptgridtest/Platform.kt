package com.praveen.KmpGridTest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform