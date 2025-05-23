package com.yaabelozerov.superfinancer.common.util

import android.content.Context
import com.yaabelozerov.superfinancer.common.R
import java.time.LocalDateTime
import java.time.temporal.ChronoUnit

fun Double.toString(precision: Int) = "%.${precision}f".format(this)

fun Double.smartRound(precision: Int) = when {
    (this > 0.0) && (this < 1.0) -> "<1"
    else -> toString(precision)
}
fun Float.smartRound(precision: Int) = toDouble().smartRound(precision)

fun LocalDateTime.format(context: Context, withTime: Boolean = true): String {
    val time = hour.toString().padStart(2, '0') + ":" + minute.toString().padStart(2, '0')
    val date = dayOfMonth.toString().padStart(2, '0') + "/" + monthValue.toString()
        .padStart(2, '0') + "/" + year
    val daysBetween = ChronoUnit.DAYS.between(LocalDateTime.now(), this)
    val formattedDate = when (daysBetween) {
        -1L -> context.getString(R.string.yesterday)
        0L -> context.getString(R.string.today)
        1L -> context.getString(R.string.tomorrow)
        else -> date
    }
    return formattedDate + if (withTime) " at $time" else ""
}

