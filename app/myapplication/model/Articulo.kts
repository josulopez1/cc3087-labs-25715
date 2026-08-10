#!/usr/bin/env kotlin
package com.example.lecturas.model

data class Articulo(
    val autor: String,
    val titulo: String,
    val extracto: String,
    val minutosLectura: Int,
    val fecha: String
)
