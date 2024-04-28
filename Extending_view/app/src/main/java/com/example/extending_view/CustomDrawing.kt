package com.example.extending_view

import android.animation.ObjectAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.view.animation.LinearInterpolator
import androidx.core.animation.doOnEnd

class CustomDrawing(context: Context?): View(context) {
    lateinit var p: Paint
    var t: Float = 700f
    var l: Float = 90f
    var r: Float = 1000f
    var b: Float = 1800f
    private var rotationangle = 0f

    init {
        init()
    }

    private fun init() {
        p = Paint()
    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawColor(Color.GREEN)

        p.setColor(Color.GRAY)
        canvas.drawArc(-90f, 9f, 1180f, 800f, 45f, 90f, true, p)
        p.setColor(Color.BLACK)
        canvas.drawArc(-90f, 140f, 1180f, 800f, 45f, 90f, true, p)
        p.setColor(Color.BLUE)
        canvas.drawArc(-90f, 240f, 1180f, 800f, 45f, 90f, true, p)
        p.color = Color.RED
        for (i in 1..6) {
            canvas.drawRect(
                l,
                t + (i * 10).toFloat(),
                r + (i * 10).toFloat(),
                b - (i * 10).toFloat(),
                p
            )
        }
        p.setColor(Color.WHITE)
        canvas.drawRect(400f, 1300f, 700f, 1800f, p)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        if (event != null) {
            when (event.action) {
                MotionEvent.ACTION_MOVE -> clear();
            }
        }
        invalidate()
        return true;
    }

    fun clear(){

    }
}