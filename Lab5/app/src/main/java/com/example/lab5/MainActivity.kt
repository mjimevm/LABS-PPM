package com.example.lab5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab5.ui.theme.Lab5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab5Theme {
                Pantalla()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Pantalla (
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.White,
                    titleContentColor = Color.Black
                )
            )
        },
        modifier = modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(64.dp)
                    .background(color = Color(0xFFe1f3f9))
                    .padding(horizontal = 16.dp, vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box (
                    modifier = Modifier
                        .size(40.dp)
                        .background(color = Color(0xFF21a3d3), CircleShape),
                    contentAlignment = Alignment.Center


                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_update),
                        contentDescription = "Update",
                        tint = Color.White,
                        modifier = Modifier
                            .size(24.dp)
                    )
                }
                Spacer (modifier = Modifier.width(12.dp))
                Text (
                    text = "Actualización disponible",
                    fontSize = 16.sp,
                    color = Color(0xFF333333),
                    modifier = Modifier.weight(1f),

                )
                Spacer (modifier = Modifier.width(32.dp))
                Text(
                    text = "Descargar",
                    color = Color(0xFF21A3D3),
                    fontSize = 16.sp,
                    modifier = Modifier.clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = null
                    ) {
                    }
                )
            }

            Row (
                modifier = Modifier
                    .height(112.dp)
                    .fillMaxWidth()
                    .padding(24.dp,16.dp),
                horizontalArrangement = Arrangement.Start
            ) {
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text (
                        text = "Martes",
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF4d4d4d)
                    )
                    Text (
                        text = "1 de septiembre",
                        fontSize = 20.sp,
                        color = Color(0xFF4d4d4d),
                        modifier = Modifier.weight(1f).padding(0.dp,4.dp,0.dp,0.dp),
                    )
                }
                OutlinedButton(
                    onClick = {},
                    shape = RoundedCornerShape(8.dp),
                    border = BorderStroke(1.dp, Color(0xFF888888)),
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                    modifier = Modifier.align(Alignment.Bottom)
                ) {
                    Text(
                        text = "Terminar jornada",
                        color = Color(0xFF6200EE),
                        fontWeight = FontWeight.W400,
                        fontSize = 16.sp,
                    )
                }
            }
            Box (
                modifier = Modifier
            ) {

            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Lab5Theme {
        Pantalla()
    }
}