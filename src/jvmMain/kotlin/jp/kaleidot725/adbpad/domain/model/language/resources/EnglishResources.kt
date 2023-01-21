package jp.kaleidot725.adbpad.domain.model.language.resources

object EnglishResources : StringResources {
    override val VERSION = "v1.0.0"
    override val WINDOW_TITLE = "AdbPad($VERSION)"

    override val NOT_FOUND_DEVICE = "Not found device"
    override val NOT_FOUND_COMMAND = "Not found command"
    override val NOT_FOUND_INPUT_TEXT = "Not found input text"
    override val NOT_FOUND_SCREEN_SHOT = "Not found screenshot"

    override val EXECUTE = "Run"
    override val SAVE = "Save"
    override val DELETE = "Delete"
    override val SEND = "Send"
    override val CANCEL = "Cancel"
    override val TARGET_DEVICE = "Devices"
    override val TOOL = "Tools"
    override val SETTING = "Setting"
    override val DARK = "Dark"
    override val LIGHT = "Light"
    override val SYSTEM = "System"

    override val SCREENSHOT_TAKE_BY_CURRENT_THEME = "Take by current theme"
    override val SCREENSHOT_TAKE_BY_DARK_THEME = "Take by dark theme"
    override val SCREENSHOT_TAKE_BY_LIGHT_THEME = "Take by light theme"
    override val SCREENSHOT_TAKE_BY_BOTH_THEME = "Take by both theme"

    override val COMMAND_START_EVENT_FORMAT = "Start sending command 「%s」"
    override val COMMAND_END_EVENT_FORMAT = "End sending command 「%s」"
    override val COMMAND_ERROR_EVENT_FORMAT = "Error sending command 「%s」"

    override val COMMAND_LAYOUT_BORDER_ON_TITLE = "Show layout bounds: ON"
    override val COMMAND_LAYOUT_BORDER_ON_DETAILS = "Enable showing clip bounds, margins, etc."
    override val COMMAND_LAYOUT_BORDER_OFF_TITLE = "Show layout bonds: OFF"
    override val COMMAND_LAYOUT_BORDER_OFF_DETAILS = "Disable showing clip bounds, margins, etc."
    override val COMMAND_TAP_EFFECT_ON_TITLE = "Show taps: ON"
    override val COMMAND_TAP_EFFECT_ON_DETAILS = "Enable showing visual feedback for taps."
    override val COMMAND_TAP_EFFECT_OFF_TITLE = "Show taps: OFF"
    override val COMMAND_TAP_EFFECT_OFF_DETAILS = "Disable showing visual feedback for taps."
    override val COMMAND_SLEEP_MODE_ON_TITLE = "Sleep mode: ON"
    override val COMMAND_SLEEP_MODE_ON_DETAILS = "Enable sleep mode and device go into sleep."
    override val COMMAND_SLEEP_MODE_OFF_TITLE = "Sleep mode: OFF"
    override val COMMAND_SLEEP_MODE_OFF_DETAILS = "Disable sleep mode and device doesn't go into sleep."
    override val COMMAND_DARK_THEME_ON_TITLE = "Dark theme: ON"
    override val COMMAND_DARK_THEME_ON_DETAILS = "Enable dark theme."
    override val COMMAND_DARK_THEME_OFF_TITLE = "Dark theme: OFF"
    override val COMMAND_DARK_THEME_OFF_DETAILS = "Disable dark theme."
    override val COMMAND_WIFI_ON_TITLE = "Wi-Fi: ON"
    override val COMMAND_WIFI_ON_DETAILS = "Enable Wi-Fi communication."
    override val COMMAND_WIFI_OFF_TITLE = "Wi-Fi: OFF"
    override val COMMAND_WIFI_OFF_DETAILS = "Disable Wi-Fi communication."
    override val COMMAND_DATA_ON_TITLE = "Cellular: ON"
    override val COMMAND_DATA_ON_DETAILS = "Enable cellular communication."
    override val COMMAND_DATA_OFF_TITLE = "Cellular: OFF"
    override val COMMAND_DATA_OFF_DETAILS = "Disable cellular communication."
    override val COMMAND_WIFI_AND_DATA_ON_TITLE = "Wi-Fi and cellular: ON"
    override val COMMAND_WIFI_AND_DATA_ON_DETAILS = "Enable Wi-Fi and cellular communication."
    override val COMMAND_WIFI_AND_DATA_OFF_TITLE = "Wi-Fi and cellular: OFF"
    override val COMMAND_WIFI_AND_DATA_OFF_DETAILS = "Disable Wi-Fi and cellular communication."
    override val COMMAND_SCREEN_PINNING_OFF_TITLE = "Screen pinning: OFF"
    override val COMMAND_SCREEN_PINNING_OFF_DETAILS = "Disable screen pinning."

    override val TEXT_COMMAND_START_EVENT_FORMAT = "Start sending text「%s」"
    override val TEXT_COMMAND_END_EVENT_FORMAT = "End sending text「%s」"
    override val TEXT_COMMAND_ERROR_EVENT_FORMAT = "Error sending text「%s」"

    override val SCREENSHOT_COMMAND_START_EVENT_FORMAT = "Start taking screenshot"
    override val SCREENSHOT_COMMAND_END_EVENT_FORMAT = "End taking screenshot"
    override val SCREENSHOT_COMMAND_ERROR_EVENT_FORMAT = "Error taking screenshot"

    override val MENU_COMMAND_TITLE = "Command"
    override val MENU_INPUT_TEXT_TITLE = "Send Text"
    override val MENU_SCREENSHOT = "Screenshot"

    override val SETTING_LANGUAGE_HEADER = "Language"
    override val SETTING_LANGUAGE_ENGLISH = "English"
    override val SETTING_LANGUAGE_JAPANESE = "Japanese(日本語)"

    override val SETTING_APPEARANCE_HEADER = "Appearance"
    override val SETTING_ADB_HEADER = "ADB"
    override val SETTING_ADB_DIRECTORY_PATH_TITLE = "Binary Path"
    override val SETTING_ADB_PORT_NUMBER_TITLE = "Server Port"
    override val SETTING_ANDROID_SDK_HEADER = "Android SDK"
    override val SETTING_ANDROID_SDK_DIRECTORY_PATH_TITLE = "Directory Path"

    override val ADB_ERROR_TITLE = "Adb Error"
    override val ADB_ERROR_MESSAGE = "Can't start adb server, Please change adb setting."
    override val ADB_ERROR_OPEN_SETTING = "Open Setting"
}
