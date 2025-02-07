package com.example.githubreposapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RepoItem1(modifier: Modifier = Modifier) {
    Row(
        Modifier.fillMaxWidth()
            .padding(horizontal = 8.dp)
            .padding(top = 8.dp)
            .background(
                color = colorResource(R.color.white) ,
                shape = RoundedCornerShape(12.dp)
                )
            .clickable {

            }
    ) {
        Image(
            modifier = Modifier
                .size(60.dp)
                .padding(top = 8.dp, start = 8.dp)
                .clip(shape = CircleShape),
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = null
        )

        Column(
            Modifier.padding(12.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier.weight(1f),
                    text = "repo name"
                )
                Text(text = "2000")
                Spacer(Modifier.width(8.dp))
                Image(
                    modifier = Modifier.size(40.dp),
                    painter = painterResource(R.drawable.ic_launcher_foreground),
                    contentDescription = null
                )
            }
            Spacer(Modifier.height(8.dp))
            Text(text = "owner name ")
            Spacer(Modifier.height(12.dp))
            Text(
                text = "description of the repo description of the repo description of the repo description of the repo ",
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }

    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL_6_PRO
)
@Composable
private fun RepoItem1Preview() {
    MaterialTheme {
        RepoItem1()
    }
}