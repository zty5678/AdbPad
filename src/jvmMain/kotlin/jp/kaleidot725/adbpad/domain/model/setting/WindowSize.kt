package jp.kaleidot725.adbpad.domain.model.setting

import androidx.compose.ui.window.FrameWindowScope
import kotlinx.serialization.Serializable

@Serializable
data class WindowSize(
    val width: Int,
    val height: Int
) {
    companion object {
        val UNKNOWN = WindowSize(-1, -1)
        val DEFAULT = WindowSize(1400, 800)
    }
}

fun FrameWindowScope.getWindowSize(): WindowSize {
    return WindowSize(
        this.window.width,
        this.window.height
    )
}
