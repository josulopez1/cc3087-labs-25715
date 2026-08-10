package com.example.lab5_11.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab5_11.model.Articulo

@Composable
fun ArticuloItem(
    articulo: Articulo,
    modifier: Modifier = Modifier
) {
    // Row 1: artículo completo
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Column(
            modifier = Modifier
                .weight(1f)
                .padding(end = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            // Row 2: autor
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(20.dp)
                        .clip(CircleShape)
                        .background(Color(0xFFD9895B))
                )

                Text(
                    text = articulo.autor,
                    modifier = Modifier.padding(start = 8.dp),
                    fontSize = 12.sp,
                    color = Color(0xFF555555)
                )
            }

            Text(
                text = articulo.titulo,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF242424)
            )

            Text(
                text = articulo.extracto,
                fontSize = 14.sp,
                color = Color(0xFF666666)
            )

            // Row 3: metadata
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "${articulo.minutosLectura} min de lectura",
                    fontSize = 12.sp,
                    color = Color(0xFF777777)
                )

                Text(
                    text = " · ",
                    fontSize = 12.sp,
                    color = Color(0xFF777777)
                )

                Text(
                    text = articulo.fecha,
                    fontSize = 12.sp,
                    color = Color(0xFF777777)
                )
            }
        }

        // Miniatura
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(Color(0xFFE8B17D))
        )
    }
}