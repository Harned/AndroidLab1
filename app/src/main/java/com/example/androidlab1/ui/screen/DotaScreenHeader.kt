package com.example.androidlab1.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidlab1.R
import com.example.androidlab1.components.GameHeading
import com.example.androidlab1.ui.theme.ThemeSettings

@Composable
fun DotaScreenHeader(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .height(369.dp)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.dota_header),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .height(327.dp)
                .fillMaxWidth()
        )
        DotaLogo(Modifier.offset(21.dp, 265.dp))
        GameHeading(
            name = stringResource(id = R.string.dota_2),
            downloads = stringResource(id = R.string.downloads),
            modifier = Modifier.offset(124.dp, 298.dp)
        )
    }
}

@Composable
private fun DotaLogo(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.size(88.dp, 95.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(88.dp)
                .clip(RoundedCornerShape(13.54.dp))
                .border(
                    width = 2.dp,
                    color = ThemeSettings.BgColors.border,
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
    Surface(
        color = ThemeSettings.BgColors.primary
    ) {
        DotaScreenHeader()
    }
}