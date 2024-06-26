package su.afk.diarymultimodule.navigation

import su.afk.diarymultimodule.util.Constants.WRITE_SCREEN_ARG_KEY

sealed class Screen(val route: String) {
    object Authentication : Screen("authentication_screen")
    object Home : Screen("home_screen")
    object Write : Screen("write_screen?$WRITE_SCREEN_ARG_KEY={diaryId}") {
        fun passDiaryId(diaryId: String) = "write_screen?$WRITE_SCREEN_ARG_KEY=$diaryId"
    }
}