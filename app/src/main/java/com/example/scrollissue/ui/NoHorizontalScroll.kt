package com.example.scrollissue.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState

@ExperimentalPagerApi
@Composable
fun NoHorizontalScroll() {
    val pagerState = rememberPagerState()
    val scrollState = rememberScrollState()
    val pagerHeight = 200.dp
    Box {
        MyPager(pagerState, scrollState.value, pagerHeight)
        Column(
            Modifier
                .verticalScroll(scrollState)
                .padding(top = pagerHeight)
        ) {
            ScrollableContent("You can scroll the whole screen up including within the pager section but you can't scroll left and right within the pager. \n\n E.g. you can't change page")
        }
    }
}
