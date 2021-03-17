package com.example.swwplinewheeljoinerview

import android.view.View
import android.view.MotionEvent
import android.app.Activity
import android.content.Context
import android.graphics.Paint
import android.graphics.Color
import android.graphics.RectF
import android.graphics.Canvas

val colors : Array<Int> = arrayOf(
    "#f44336",
    "#673AB7",
    "#009688",
    "#01579B",
    "#00E676"
).map {
    Color.parseColor(it)
}.toTypedArray()
val backColor : Int = Color.parseColor("#BDBDBD")
val parts : Int = 4
val scGap : Float = 0.02f / parts
val strokeFactor : Float = 90f
val r1Factor : Float = 6.6f
val r2Factor : Float = 3.2f
val gapFactor : Float = 2.9f
val delay : Long = 20

