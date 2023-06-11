package com.example.namecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.namecard.ui.theme.NameCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NameCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NameCardMain(
                        stringResource(id = R.string.full_name),
                        stringResource(id = R.string.title),
                        stringResource(id = R.string.contactPhone),
                        stringResource(id = R.string.contactIg),
                        stringResource(id = R.string.contactEmail)
                    )
                }
            }
        }
    }
}

@Composable
fun NameCardMain(
    fullname: String,
    title: String,
    contactig: String,
    contactphone: String,
    contactemail: String,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)
            .border(width = 1.dp, color = Color.Red)
    ) {
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.Center)
                .border(width = 1.dp, color = Color.Red)
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "",
                alignment = Alignment.Center,
                modifier = Modifier
                    .size(100.dp)
            )
            NameCardText(
                fullname = fullname,
                title = title
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 1.dp, color = Color.Red)
                .padding(
                    top = 775.dp,
                )
        ) {
            NameCardContact(
                contactphone = contactphone,
                contactig = contactig,
                contactemail = contactemail,
            )
        }
    }
}



@Composable
fun NameCardText(
    fullname: String,
    title: String,
    modifier: Modifier = Modifier
){
    Column(modifier) {
        Text(
            text = fullname,
            color = Color.White,
            fontSize = 25.sp,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = title,
            color = Color.White,
            fontSize = 17.sp,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun NameCardContact(
    contactphone: String,
    contactig: String,
    contactemail: String,
    modifier: Modifier = Modifier
) {
    Column(modifier) {
        Text(
            text = contactphone,
            color = Color.White,
            fontSize = 17.sp,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = contactig,
            color = Color.White,
            fontSize = 17.sp,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = contactemail,
            color = Color.White,
            fontSize = 17.sp,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun NameCardPreview() {
    NameCardTheme {
        NameCardMain(
            stringResource(id = R.string.full_name),
            stringResource(id = R.string.title),
            stringResource(id = R.string.contactPhone),
            stringResource(id = R.string.contactIg),
            stringResource(id = R.string.contactEmail)
        )
    }
}