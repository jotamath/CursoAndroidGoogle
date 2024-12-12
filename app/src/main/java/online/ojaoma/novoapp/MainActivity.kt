package online.ojaoma.novoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign.Companion.Justify
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import online.ojaoma.novoapp.ui.theme.NovoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NovoAppTheme {
                Surface(modifier = Modifier.fillMaxSize()){
                }
            }
        }
    }
}
@Composable
fun AppDisplay(message: String?, modifier: Modifier = Modifier) {
    Column {
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
        Text(
            text = stringResource(R.string.page_title),
            fontSize = 24.sp,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
        )
        Text(
            text = stringResource(R.string.brief_description),
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = Justify
        )
        Text(
            text = stringResource(R.string.long_description),
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = Justify
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NovoAppTheme {
        AppDisplay("")
    }
}