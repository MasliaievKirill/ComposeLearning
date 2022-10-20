package com.masliaiev.composelecturewith.second_screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.masliaiev.composelecturewith.base_components.CircleButton
import com.masliaiev.composelecturewith.ui.theme.ComposeLectureWithTheme

@Composable
fun SecondScreen() {

    var count by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = count.toString(),
            style = MaterialTheme.typography.h5
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            CircleButton(
                icon = {
                    Icon(
                        imageVector = Icons.Filled.KeyboardArrowLeft,
                        contentDescription = "Remove"
                    )
                },
                modifier = Modifier.padding(12.dp)
            ) { count-- }
            CircleButton(
                icon = {
                    Icon(
                        imageVector = Icons.Filled.KeyboardArrowRight,
                        contentDescription = "Add"
                    )
                },
                modifier = Modifier.padding(12.dp)
            ) { count++ }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SecondScreenPreview() {
    ComposeLectureWithTheme {
        SecondScreen()
    }
}