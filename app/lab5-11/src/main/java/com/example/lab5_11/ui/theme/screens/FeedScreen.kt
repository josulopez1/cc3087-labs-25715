package com.example.lab5_11.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab5_11.data.articulos
import com.example.lab5_11.model.Articulo
import com.example.lab5_11.ui.components.ArticuloItem
import com.example.lab5_11.ui.components.Separador
import com.example.lab5_11.ui.components.TabsRow
import com.example.lab5_11.ui.components.TopBar

/*
Ruta B

1. Al quitar el weight de la columna del artículo, el texto deja de ocupar
únicamente el espacio disponible y la distribución con la miniatura cambia.
Con weight, la columna toma el espacio sobrante mientras la miniatura conserva
su tamaño fijo.

2. El componente recibe un Modifier para que la pantalla que lo utiliza pueda
decidir su espaciado. Si el margen estuviera fijado dentro del componente,
sería más difícil reutilizarlo en otra pantalla que necesite otro espaciado.
*/

@Composable
fun FeedScreen(
    articulos: List<Articulo>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {

        TopBar(
            nombre = "Sazón"
        )

        TabsRow(
            modifier = Modifier.padding(vertical = 16.dp)
        )

        Separador()

        Column(
            verticalArrangement = Arrangement.spacedBy(0.dp)
        ) {
            articulos.forEach { articulo ->
                ArticuloItem(
                    articulo = articulo,
                    modifier = Modifier.padding(vertical = 16.dp)
                )

                Separador()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FeedScreenPreview() {
    FeedScreen(
        articulos = articulos
    )
}