package jp.kaleidot725.adbpad.view.template

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ScreenLayout(
    leftPane: @Composable () -> Unit,
    rightPane: @Composable () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(modifier) {
        Row {
            leftPane()
            rightPane()
        }
    }
}

@Preview
@Composable
private fun ScreenLayout_Preview() {
    ScreenLayout(
        leftPane = {
            Box(Modifier.width(200.dp).fillMaxHeight().background(Color.Red))
        },
        rightPane = {
            Box(Modifier.fillMaxSize().background(Color.Blue))
        },
        modifier = Modifier.fillMaxSize()
    )
}

@Preview
@Composable
private fun AppTemplateDialog_Preview() {
    ScreenLayout(
        leftPane = {
            Box(Modifier.width(200.dp).fillMaxHeight().background(Color.LightGray))
        },
        rightPane = {
            Box(Modifier.fillMaxSize().background(Color.White))
        },
        modifier = Modifier.fillMaxSize()
    )
}