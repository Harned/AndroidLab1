package com.example.androidlab1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DotaScreenHeader(
    modifier: Modifier = Modifier,
) {
    Box {
        Image(
            painter = painterResource(id = R.drawable.dota_header),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.size(375.dp, 327.dp)
        )
        Box(
            modifier = Modifier.offset(21.dp, 265.dp)
        ) {
            DotaLogo()
        }
    }

}

@Composable
private fun DotaLogo(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier.size(88.dp, 95.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(88.dp)
                .clip(RoundedCornerShape(13.54.dp))
                .border(
                    width = 1.935.dp,
                    color = Color(0xFF1F2430),
                    shape = RoundedCornerShape(13.54.dp)
                )
                .background(color = Color.Black)
        ) {
            Image(
                painter = painterResource(id = R.drawable.doka2_logo),
                contentDescription = null,
                modifier = Modifier.size(54.dp),
            )
        }
    }
}

@Composable
@Preview(
    showBackground = true,
    showSystemUi = true
)
fun DotaScreenHeaderPreview() {
    Surface {
        DotaScreenHeader()
    }
}