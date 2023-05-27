package jp.kaleidot725.adbpad.utils

enum class LogLevel {
    DEBUG,
    INFO,
    WARN,
    ERROR,
    ;

    override fun toString(): String = name.lowercase()
}

fun logWithLineInfo(showCaller: Boolean = false, level: LogLevel, message: String) {
    val stackTrace = Thread.currentThread().stackTrace
    val caller = if (showCaller) stackTrace[5] else stackTrace[4]
    val lineNumber = caller.lineNumber
    val methodName = caller.methodName
    val fileName = caller.fileName

    var logMessage = "${caller.className}.$methodName() [(${fileName}:$lineNumber)]$message"

    when (level) {
        LogLevel.DEBUG -> println("[DEBUG] $logMessage")
        LogLevel.INFO -> println("[INFO] $logMessage")
        LogLevel.WARN -> println("[WARN] $logMessage")
        LogLevel.ERROR -> println("[ERROR] $logMessage")
    }
}

object LogUtils {

    @JvmStatic
    fun LOGD(message: String) = logWithLineInfo(level = LogLevel.DEBUG, message = message)

    @JvmStatic
    fun LOGDCaller(message: String) = logWithLineInfo(true, LogLevel.DEBUG, message)

    @JvmStatic
    fun LOGI(message: String) = logWithLineInfo(level = LogLevel.INFO, message = message)

    @JvmStatic
    fun LOGW(message: String) = logWithLineInfo(level = LogLevel.WARN, message = message)

    @JvmStatic
    fun LOGE(message: String) = logWithLineInfo(level = LogLevel.ERROR, message = message)

}