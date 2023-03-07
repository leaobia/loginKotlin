package br.senai.jandira.sp.mylogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.jandira.sp.mylogin.ui.theme.MyLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyLoginTheme {
                // A surface container using the 'background' color from the theme

                login()

            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun login() {

    var emailState = rememberSaveable {
        mutableStateOf("")
    }

    var lockState = rememberSaveable {
        mutableStateOf("")
    }
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Surface(
                    modifier = Modifier
                        .width(140.dp)
                        .height(50.dp),
                    color = Color(200, 6, 240),
                    shape = RoundedCornerShape(0.dp, 0.dp, 0.dp, 16.dp)
                ) {

                }
            }
            Spacer(modifier = Modifier.height(155.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 18.dp),
            ) {
                Text(
                    text = stringResource(id = R.string.login),
                    color = Color(200, 6, 240),
                    fontSize = 50.sp,
                    fontWeight = FontWeight(700)
                )
                Text(
                    text = stringResource(id = R.string.login_text),
                    color = Color(160, 156, 156),
                    fontSize = 16.sp,
                    fontWeight = FontWeight(400)
                )
            }
            Spacer(modifier = Modifier.height(70.dp))
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(horizontal = 18.dp)
            ) {
                OutlinedTextField(
                    value = "", onValueChange = {
                        emailState.value = it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp),
                    label = { Text(text = "Email") },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_email_24),
                            contentDescription = "",
                            tint = Color(200, 6, 240)
                        )
                    },
                    shape = RoundedCornerShape(16.dp)
                )
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    value = "", onValueChange = {
                        lockState.value = it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp),
                    label = { Text(text = "Password") },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_lock_24),
                            contentDescription = "",
                            tint = Color(200, 6, 240)
                        )
                    },
                    shape = RoundedCornerShape(16.dp)
                )
                Spacer(modifier = Modifier.height(23.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color(200, 6, 240)),
                        modifier = Modifier
                            .width(120.dp)
                            .height(50.dp),
                        shape = RoundedCornerShape(12.dp, 12.dp, 12.dp, 12.dp)
                        ) {
                        Text(text = "SIGN IN",
                        color = Color(255,255,255),
                        fontWeight = FontWeight(800))
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_arrow_forward_24),
                            contentDescription = "",
                            tint = Color(255,255,255)
                        )
                    }
                }

            }

        }
    }
}