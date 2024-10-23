package com.example.marvelheroesapp

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Fill

@Composable
fun CustomBackground() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        // Рисуем черный фон
        drawRect(
            color = Color.Black,
            size = size
        )

        // Рисуем красный треугольник
        val path = Path().apply {
            moveTo(size.width, size.height) // Нижний правый угол
            lineTo(size.width * 0.5f, size.height) // Центр по горизонтали снизу
            lineTo(size.width, size.height * 0.5f) // Центр по вертикали справа
            close() // Замыкаем треугольник
        }

        drawPath(
            path = path,
            color = Color.Red,
            style = Fill
        )
    }
}
