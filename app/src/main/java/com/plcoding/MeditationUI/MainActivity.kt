package com.plcoding.MeditationUI

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import com.plcoding.MeditationUI.ui.HomeScreen
import com.plcoding.MeditationUI.ui.theme.MeditationUIYouTubeTheme

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationUIYouTubeTheme {
                HomeScreen()
            }
        }
    }
}