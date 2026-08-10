package com.example.lab5_11.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TabsRow(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Text(
            text = "Para ti",
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF242424)
        )

        Text(
            text = "Recetas",
            fontSize = 14.sp,
            color = Color(0xFF777777)
        )

        Text(
            text = "Consejos",
            fontSize = 14.sp,
            color = Color(0xFF777777)
        )
    }
}