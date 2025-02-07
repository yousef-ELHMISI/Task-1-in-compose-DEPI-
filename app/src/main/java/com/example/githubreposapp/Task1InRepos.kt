package com.example.githubreposapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Issusesscreen(modifier: Modifier = Modifier) {

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            CenterAlignedTopAppBar(
                    title = { Text( text = "issues",
                        fontWeight = FontWeight.Bold) },
                    navigationIcon = {
                        IconButton(onClick = { }) {
                            Icon(imageVector = Icons.Default.ArrowBack,
                                contentDescription = "go back"
                            )
                        }
                    }
                )
        }
    ) {values ->
        LazyColumn(
            modifier = Modifier
                .padding(values)
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.onSecondary)
        ) {
            item {
                IssueItem()
            }
        }
    }
}

@Composable
fun IssueItem(modifier: Modifier = Modifier) {
    Row (
        modifier = Modifier.fillMaxWidth()
            .padding(top = 6.dp, start = 6.dp)
            .background(
                color = MaterialTheme.colorScheme.surface,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(8.dp)
            .clickable {  }
    ) {
        Image(
            modifier = Modifier
                .size(50.dp)
                .padding(top = 8.dp, start = 8.dp)
                .clip(shape = CircleShape),
            painter = painterResource(R.drawable.ic_issues),
            contentDescription = null
        )
        Column(
            modifier = Modifier
                .padding(12.dp)
                .weight(1f)

        ) {
            Text(
                text = "Bunp pyarrow from 7 to 9 kkkkkkkkkkkkkkkkkffffffffffffffffffffffff",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "NONE",
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "Created at:",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Text(
                    text = "2025-2-22,10:00 AM"
                )

            }
        }
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = "Open",
            fontSize = 22.sp
            )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL_6_PRO
)
@Composable
private fun previewIssusesItem1() {
    MaterialTheme {
        Issusesscreen()
    }

}