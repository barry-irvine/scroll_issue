package com.example.scrollissue

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.scrollissue.ui.NoHorizontalScroll
import com.example.scrollissue.ui.NoVerticalScroll
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Box {
                var page by remember { mutableStateOf(Page.NO_HORIZONTAL_SCROLL_PAGER)}
                when (page) {
                    Page.NO_HORIZONTAL_SCROLL_PAGER -> NoHorizontalScroll()
                    Page.NO_VERTICAL_SCROLL_PAGER -> NoVerticalScroll()
                }
                Button(onClick = {
                    page = when (page) {
                        Page.NO_HORIZONTAL_SCROLL_PAGER -> Page.NO_VERTICAL_SCROLL_PAGER
                        Page.NO_VERTICAL_SCROLL_PAGER -> Page.NO_HORIZONTAL_SCROLL_PAGER
                    }
                }, modifier = Modifier.align(Alignment.BottomCenter).padding(16.dp)) {
                    Text("Change example")
                }

            }
        }
    }
}

enum class Page {
    NO_VERTICAL_SCROLL_PAGER,
    NO_HORIZONTAL_SCROLL_PAGER
}
