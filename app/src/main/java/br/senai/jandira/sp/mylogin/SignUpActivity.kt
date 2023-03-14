package br.senai.jandira.sp.mylogin

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.jandira.sp.mylogin.ui.theme.MyLoginTheme

class SignUpActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyLoginTheme {
                // A surface container using the 'background' color from the theme

                signup()

            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun signup(){
    var userState = rememberSaveable {
        mutableStateOf("")
    }

    var phoneState = rememberSaveable {
        mutableStateOf("")
    }

    var mailState = rememberSaveable {
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
            Spacer(modifier = Modifier.height(60.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = Resources.getSystem().getString(R.string.signup),
                    color = Color(200, 6, 240),
                    fontSize = 45.sp,
                    fontWeight = FontWeight(700)
                )
                Text(
                    text = stringResource(id = R.string.signup2),
                    color = Color(160, 156, 156),
                    fontSize = 18.sp,
                    fontWeight = FontWeight(300)
                )
            }
            Spacer(modifier = Modifier.height(40.dp))
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
            ) {
                OutlinedTextField(
                    value = "", onValueChange = {
                        userState.value = it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp),
                    label = { Text(text = "Username") },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_person_24),
                            contentDescription = "",
                            tint = Color(200, 6, 240)
                        )
                    },
                    shape = RoundedCornerShape(16.dp)
                )
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    value = "", onValueChange = {
                        phoneState.value = it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp),
                    label = { Text(text = "Phone") },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_phone_android_24),
                            contentDescription = "",
                            tint = Color(200, 6, 240)
                        )
                    },
                    shape = RoundedCornerShape(16.dp)
                )
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    value = "", onValueChange = {
                        mailState.value = it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp),
                    label = { Text(text = "E-mail") },
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
                Row() {
                    Checkbox(checked = false, onCheckedChange = {} )
                    Row(modifier = Modifier.fillMaxWidth()
                        .padding(top = 14.dp)) {
                        Text(text = "Over 18?", fontSize = 15.sp)
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(200, 6, 240)),
                    modifier = Modifier.fillMaxWidth()
                        .height(50.dp),
                    shape = RoundedCornerShape(12.dp, 12.dp, 12.dp, 12.dp)
                ) {
                    Text(
                        text = "CREATE ACCOUNT",
                        color = Color(255, 255, 255),
                        fontSize = 16.sp,
                        fontWeight = FontWeight(800)
                    )
                }
                Spacer(modifier = Modifier.height(35.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        text = stringResource(id = R.string.account),
                        color = Color(160, 156, 156)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        stringResource(id = R.string.sign2_text),
                        fontWeight = FontWeight(800),
                        color = Color(200, 6, 240)
                    )
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(top = 22.dp)  ,
                horizontalArrangement = Arrangement.Start

            ) {
                Surface(
                    modifier = Modifier
                        .width(140.dp)
                        .height(50.dp),
                    color = Color(200, 6, 240),
                    shape = RoundedCornerShape(0.dp, 16.dp, 0.dp, 0.dp)
                ) {

                }
            }
        }
    }
}