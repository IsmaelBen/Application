package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting(name = "Ismael")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFBBDEFB))
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {

        Surface(
            shape = RoundedCornerShape(16.dp),
            shadowElevation = 8.dp,
            modifier = Modifier.padding(24.dp)
        ) {

            Text(
                text = "Je m'appelle $name",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF0D47A1),
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = false)
@Composable
fun GreetingPreview() {
    Greeting(name = "Ismael")
}
