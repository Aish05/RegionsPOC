package com.example.latesttechstackpoc

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.latesttechstackpoc.common.AddressValidator
import com.example.latesttechstackpoc.common.ColorConfig
import com.example.latesttechstackpoc.common.PaymentGatewayConfig
import com.example.latesttechstackpoc.ui.theme.LatestTechStackPocTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var paymentGatewayConfig: PaymentGatewayConfig

    @Inject
    lateinit var colorConfig: ColorConfig

    @Inject
    lateinit var addressValidator: AddressValidator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("BASE_URL",  BuildConfig.BASE_URL)
        setContent {
            LatestTechStackPocTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    MyApp()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LatestTechStackPocTheme {
        Greeting("Android")
    }
}
