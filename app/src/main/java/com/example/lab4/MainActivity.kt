package com.example.lab4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab4.ui.theme.Lab4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab4Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Caratula(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                            .background(color = Color(0xFF297029))
                            .padding(8.dp)
                    )
                }
            }
        }
    }
}
@Composable
fun Caratula(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier
            .fillMaxSize()

    )
    {
        Column (
            modifier = modifier
                .fillMaxSize()
                .background(color = Color.White)
                .paint(
                    painter = painterResource(id = R.drawable.uvg_logo),
                    contentScale = ContentScale.FillWidth,
                    alpha = 0.3f
                )
                .align(Alignment.Center),
            verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Text (
                text = "Universidad del Valle\nde Guatemala",
                color = Color.Black,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                lineHeight = 32.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text (
                text = "Programación de plataformas \nmóviles, Sección 20",
                color = Color.Black,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                lineHeight = 32.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            Row (
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier
                        .height(80.dp)
                        .weight(0.5f)

                )
                {
                    Text (
                        text = "INTEGRANTES",
                        color = Color.Black,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
                Box(
                    modifier = Modifier.height(80.dp).weight(0.5f)
                )
                {
                    Text (
                        text = "Jimena Vásquez \nAlejandro Sagastume \nAndres Pineda",
                        color = Color.Black,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.align(Alignment.Center)
                    )
                }

            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier
                        .height(80.dp)
                        .weight(0.5f)

                )
                {
                    Text (
                        text = "CATEDRÁTICO",
                        color = Color.Black,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
                Box(
                    modifier = Modifier.height(80.dp).weight(0.5f)
                )
                {
                    Text (
                        text = "Juan Carlos Durini",
                        color = Color.Black,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.align(Alignment.Center)
                    )
                }

            }
            Box(
                modifier = Modifier.fillMaxWidth()
            )
            {
                Text (
                    text = "María Jimena Vásquez \n25092",
                    color = Color.Black,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.align(Alignment.Center)
                )
            }

        }
    }


}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab4Theme {
        Caratula(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFF297029))
                .padding(8.dp)

        )
    }
}