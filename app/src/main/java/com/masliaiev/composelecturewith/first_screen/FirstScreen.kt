package com.masliaiev.composelecturewith.first_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.masliaiev.composelecturewith.base_components.PrimaryButton
import com.masliaiev.composelecturewith.base_components.SecondaryButton
import com.masliaiev.composelecturewith.ui.theme.ComposeLectureWithTheme

@Composable
fun FirstScreen(
    onNavigateToCounter: () -> Unit,
    onNavigateToList: () -> Unit
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        PrimaryButton(
            text = "Counter",
            isEnabled = true,
            modifier = Modifier.padding(12.dp)
        ) {
            onNavigateToCounter()
        }
        SecondaryButton(
            text = "List",
            isEnabled = true,
            modifier = Modifier.padding(12.dp)
        ) {
            onNavigateToList()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FirstScreenPreview() {
    ComposeLectureWithTheme {
        FirstScreen(
            onNavigateToCounter = {},
            onNavigateToList = {}
        )
    }
}