package com.yassineabou.clock.ui

import androidx.navigation.NavDeepLink
import androidx.navigation.navDeepLink

sealed class Screen(val route: String) {
    object AlarmsList : Screen("AlarmsList")
    object CreateAlarm : Screen("CreateAlarm")
    object Clock : Screen("Clock")

    companion object {
        val alarmListDeepLink: List<NavDeepLink> = listOf(
            navDeepLink {
                uriPattern = "https://www.clock.com/AlarmsList"
            },
        )
    }
}
