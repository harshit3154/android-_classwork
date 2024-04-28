package com.example.extending_view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View

class CustomDrawing2(context: Context?): View(context) {

    lateinit var p: Paint
    var x =5

    init{
        init();
    }
    private fun init() {
        p = Paint()
    }

    override fun onDraw(canvas: Canvas) {
        if(x%2==0)
            canvas.drawColor(Color.RED)
        else
            canvas.drawColor(Color.BLACK)


        p.color=Color.BLACK
        canvas.drawOval(180f,800f,320f,1100f,p)
        canvas.drawOval(220f,800f,365f,1100f,p)

        p.color=Color.BLACK
        canvas.drawOval(120f,1200f,325f,1500f,p)
        canvas.drawOval(220f,1200f,365f,1500f,p)

        p.color = Color.GREEN
        canvas.drawArc(400f, 500f, 600f, 800f, x.toFloat(), 40f, true, p)
        canvas.drawArc(400f, 500f, 600f, 800f, (x + 90).toFloat(), 40f, true, p)
        p.color=Color.YELLOW
        canvas.drawArc(400f, 500f, 600f, 800f, (x + 180).toFloat(), 40f, true, p)
        canvas.drawArc(400f,500f,600f,800f,(x+270).toFloat(),40f,true,p)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        for (i in 0..50000) {
            when (event.action) {
                MotionEvent.ACTION_MOVE->startFan()
                MotionEvent.ACTION_DOWN->startFan()
                MotionEvent.ACTION_HOVER_ENTER->startFan()
                MotionEvent.ACTION_POINTER_DOWN->startFan()
                MotionEvent.ACTION_UP -> stopFan()
            }
        }
        return true
    }

    fun stopFan() {}
    fun startFan() {
        x += 5
        invalidate()
    }

    init {
        init()

    }
}