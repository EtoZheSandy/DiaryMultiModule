package su.afk.diarymultimodule

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import su.afk.diarymultimodule.navigation.Screen
import su.afk.diarymultimodule.navigation.SetupNavGraph
import su.afk.diarymultimodule.ui.theme.DiaryMultiModuleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            DiaryMultiModuleTheme {
                val navController = rememberNavController()
                SetupNavGraph(
                    startDestination = Screen.Authentication.route,
                    navController = navController
                )
            }
        }
    }
}
