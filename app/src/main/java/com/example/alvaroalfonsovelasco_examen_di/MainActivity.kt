package com.example.alvaroalfonsovelasco_examen_di

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TarjetaPerfil()
        }
    }
}

@Composable
fun TarjetaPerfil() {
    var contador by rememberSaveable { mutableStateOf(0) }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Alvaro", fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Alfonso Velasco", fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Row(modifier = Modifier.padding(top = 10.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.pulsar),
                    contentDescription = "icono clickable",
                    modifier = Modifier.clickable { contador++ }
                )
                Text(
                    text = "Número de clicks: $contador",
                    color = Color.Black,
                    modifier = Modifier.padding(16.dp)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Column(modifier = Modifier.padding(16.dp)) {
                Row() {
                    Image(
                        painter = painterResource(id = R.drawable.escudorm),
                        contentDescription = "Real madrid",
                        modifier = Modifier
                            .size(130.dp)
                            .clip(CircleShape)
                            .background(Color.LightGray),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "Real Madrid",
                        color = Color.Black,
                        modifier = Modifier.padding(16.dp)
                    )
                }
                Row(modifier = Modifier.padding(top = 16.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.escudojuve),
                        contentDescription = "Juventus",
                        modifier = Modifier
                            .size(120.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "Real Madrid",
                        color = Color.Black,
                        modifier = Modifier.padding(16.dp)
                    )
                }
                Row(modifier = Modifier.padding(top = 16.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.escudobetis),
                        contentDescription = "Betis",
                        modifier = Modifier
                            .size(120.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "Betis",
                        color = Color.Black,
                        modifier = Modifier.padding(16.dp)
                    )
                }
                Row(modifier = Modifier.padding(top = 16.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.escudobayern),
                        contentDescription = "Bayern Munich",
                        modifier = Modifier
                            .size(120.dp)
                            .clip(CircleShape)
                            .background(Color.LightGray),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "Bayern Munich",
                        color = Color.Black,
                        modifier = Modifier.padding(16.dp)
                    )
                }
                LazyRow(modifier = Modifier.padding(top = 16.dp)){
                    item{
                        Image(
                            painter = painterResource(id = R.drawable.logochampions),
                            contentDescription = "Bayern Munich",
                            modifier = Modifier
                                .size(120.dp)
                                .clip(CircleShape),
                            contentScale = ContentScale.Crop
                        )
                        Image(
                            painter = painterResource(id = R.drawable.logochampions),
                            contentDescription = "Bayern Munich",
                            modifier = Modifier
                                .size(120.dp)
                                .clip(CircleShape),
                            contentScale = ContentScale.Crop
                        )
                        Image(
                            painter = painterResource(id = R.drawable.logochampions),
                            contentDescription = "Bayern Munich",
                            modifier = Modifier
                                .size(120.dp)
                                .clip(CircleShape),
                            contentScale = ContentScale.Crop
                        )
                        Image(
                            painter = painterResource(id = R.drawable.logochampions),
                            contentDescription = "Bayern Munich",
                            modifier = Modifier
                                .size(120.dp)
                                .clip(CircleShape),
                            contentScale = ContentScale.Crop
                        )
                        Image(
                            painter = painterResource(id = R.drawable.logochampions),
                            contentDescription = "Bayern Munich",
                            modifier = Modifier
                                .size(120.dp)
                                .clip(CircleShape),
                            contentScale = ContentScale.Crop
                        )
                        Image(
                            painter = painterResource(id = R.drawable.logochampions),
                            contentDescription = "Bayern Munich",
                            modifier = Modifier
                                .size(120.dp)
                                .clip(CircleShape),
                            contentScale = ContentScale.Crop
                        )
                    }
                }
            }
        }
    }
    }

    /*LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Spacer(modifier = Modifier.height(40.dp))

            Image(
                painter = painterResource(id = R.drawable.escudorm),
                contentDescription = "Foto de perfil",
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .background(Color.LightGray),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Álvaro Alfonso Velasco",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            Text(text = "Desarrollador de Aplicaciones Multiplataforma", fontSize = 14.sp, color = Color.Gray)

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text="Edad: 23")
                Text(text="Ciudad: Valladolid")
                Text(text="Curso: 2º DAM")
            }

            Spacer(modifier = Modifier.height(20.dp))

            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "📍 Dirección: Calle", modifier = Modifier.padding(vertical = 4.dp))
                Text(text = "📞 Teléfono: 123 456 789", modifier = Modifier.padding(vertical = 4.dp))
                Text(text = "📧 Email: alvaro@gmail.com", modifier = Modifier.padding(vertical = 4.dp))
            }

            Spacer(modifier = Modifier.height(30.dp))

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "¡Dale un Like!", fontWeight = FontWeight.Medium)

                Image(
                    painter = painterResource(id = android.R.drawable.btn_star_big_on),
                    contentDescription = "Botón Like",
                    modifier = Modifier
                        .size(60.dp)
                        .clickable { contador++ }
                        .padding(8.dp)
                )

                Text(
                    text = "Total de Likes: $contador",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Red
                )
            }
        }
    }*/


@Preview(showBackground = true)
@Composable
fun PreviewTarjeta() {
    TarjetaPerfil()
}