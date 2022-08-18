// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import jp.kaleidot725.adbpad.model.AutoFillText
import jp.kaleidot725.adbpad.model.Command
import jp.kaleidot725.adbpad.model.Menu
import jp.kaleidot725.adbpad.view.component.menu.MenuPane
import jp.kaleidot725.adbpad.view.dialog.SettingDialog
import jp.kaleidot725.adbpad.view.layout.AppLayout
import jp.kaleidot725.adbpad.view.page.AutoFillPane
import jp.kaleidot725.adbpad.view.page.CommandPane
import jp.kaleidot725.adbpad.view.page.ScreenShotPane
import jp.kaleidot725.adbpad.view.resource.AppTheme
import jp.kaleidot725.adbpad.view.resource.WINDOW_TITLE

@Composable
@Preview
fun App() {
    AppTheme(useDarkTheme = false) {
        Surface {
            var enableSetting by remember { mutableStateOf(false) }

            val devices by remember { mutableStateOf(listOf("端末A", "端末B", "端末C")) }
            var selectedDevice by remember { mutableStateOf(devices.first()) }

            val menus by remember { mutableStateOf(Menu.values().toList()) }
            var selectedMenu by remember { mutableStateOf(Menu.values().first()) }

            val commands by remember { mutableStateOf(Command.values().toList()) }
            val texts by remember {
                mutableStateOf(
                    listOf(
                        AutoFillText("ID入力", "いろはにほへと"),
                        AutoFillText("ID入力", "いろはにほへと"),
                        AutoFillText("ID入力", "いろはにほへと"),
                        AutoFillText("ID入力", "いろはにほへと"),
                        AutoFillText("ID入力", "いろはにほへと"),
                        AutoFillText("ID入力", "いろはにほへと"),
                        AutoFillText("ID入力", "いろはにほへと"),
                    )
                )
            }

            Box {
                AppLayout(
                    leftPane = {
                        Surface {
                            MenuPane(
                                devices = devices,
                                selectedDevice = selectedDevice,
                                onSelectDevice = { selectedDevice = it },
                                menus = menus,
                                selectedMenu = selectedMenu,
                                onSelectMenu = { selectedMenu = it },
                                modifier = Modifier
                                    .width(250.dp)
                                    .fillMaxHeight()
                                    .padding(horizontal = 12.dp, vertical = 16.dp)
                            )
                        }
                    },
                    rightPane = {
                        Surface(color = Color.LightGray) {
                            when (selectedMenu) {
                                Menu.COMMAND_MENU -> CommandPane(
                                    commands = commands,
                                    onExecute = { /** TODO */ }
                                )

                                Menu.AUTOFILL_MENU -> AutoFillPane(
                                    texts = texts,
                                    onExecute = { /** TODO */ }
                                )

                                Menu.SCREENSHOT_MENU -> ScreenShotPane(
                                    image1 = "TEST1",
                                    image2 = "TEST2",
                                    onTakeScreenShot = {},
                                    onTakeThemeScreenshot = {}
                                )
                            }
                        }
                    },
                    dialog = {
                        SettingDialog(onClose = { enableSetting = false })
                    },
                    enableDialog = enableSetting,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}

fun main() = application {
    Window(
        title = WINDOW_TITLE,
        onCloseRequest = ::exitApplication
    ) {
        App()
    }
}