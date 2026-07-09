package com.example.parcialfinal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.parcialfinal.ui.navigation.Screens
import com.example.parcialfinal.ui.screens.PantallaMenu
import com.example.parcialfinal.ui.screens.PantallaPregunta
import com.example.parcialfinal.ui.screens.PantallaResultado
import com.example.parcialfinal.ui.theme.ParcialFinalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ParcialFinalTheme {
                val backStack = rememberNavBackStack(Screens.Menu)

                NavDisplay(
                    backStack = backStack,
                    entryProvider = entryProvider{
                        entry<Screens.Menu> {
                            PantallaMenu(backStack)
                        }
                        entry<Screens.Pregunta> {
                            PantallaPregunta(backStack)
                        }
                        entry<Screens.Resultado> {
                            PantallaResultado(backStack)
                        }
                    },
                )
            }
        }
    }
}

