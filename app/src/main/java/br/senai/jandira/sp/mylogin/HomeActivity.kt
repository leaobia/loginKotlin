package br.senai.jandira.sp.mylogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.jandira.sp.mylogin.ui.theme.MyLoginTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyLoginTheme {
                    Home()
                }
            }
        }
    }

@Composable
@Preview(showSystemUi = true)
fun Home() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(210.dp)
            ){
                Image(painter = painterResource(id = R.drawable.paris),
                    contentDescription = "" )
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)) {
                    Column(modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp), horizontalAlignment = Alignment.End) {
                        Image(painter = painterResource(id = R.drawable.susanna_profile), contentDescription = "", modifier = Modifier
                            .clip(
                                RoundedCornerShape(200.dp)
                            )
                            .height(61.dp))
                        Text(
                            text = "Susanna Hoffs",
                            color = Color(255,255,255,255)
                        )
                    }
                    Column(modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 0.dp)) {
                        Row() {
                            Icon(
                                painter = painterResource(id = R.drawable.baseline_location_on_24),
                                contentDescription = "",
                                tint = Color(255, 255, 255)
                            )
                            Text(
                                text = "You're in Paris",
                                color = Color(255,255,255,255)
                            )
                        }
                        Row(modifier = Modifier.padding(start = 5.dp)) {
                            Text(
                                text = "My Trips",
                                fontSize = 32.sp,
                                color = Color(255,255,255,255),
                                fontWeight = FontWeight(800)
                            )
                        }


                    }
                    }

        }
    }

    }
}