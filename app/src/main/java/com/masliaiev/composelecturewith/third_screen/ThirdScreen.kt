package com.masliaiev.composelecturewith.third_screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.masliaiev.composelecturewith.ui.theme.ComposeLectureWithTheme

@Composable
fun ThirdScreen() {

    val names by remember { mutableStateOf(nameItems) }

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(names) { name ->
            Greeting(name = name)
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        style = MaterialTheme.typography.h5
    )
}

@Preview(showBackground = true)
@Composable
fun SecondScreenPreview() {
    ComposeLectureWithTheme {
        ThirdScreen()
    }
}

private val nameItems = listOf(
    "Steve",
    "Alex",
    "Mike",
    "Suzan",
    "John",
    "Ros",
    "Ann",
    "Steve",
    "Alex",
    "Mike",
    "Suzan",
    "John",
    "Ros",
    "Ann",
    "Steve",
    "Alex",
    "Mike",
    "Suzan",
    "John",
    "Ros",
    "Ann",
    "Steve",
    "Alex",
    "Mike",
    "Suzan",
    "John",
    "Ros",
    "Ann",
    "Steve",
    "Alex",
    "Mike",
    "Suzan",
    "John",
    "Ros",
    "Ann"
)