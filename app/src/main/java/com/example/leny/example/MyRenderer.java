package com.example.leny.example;

import static android.opengl.GLES20.GL_COLOR_BUFFER_BIT;
import static android.opengl.GLES20.glClear;
import static android.opengl.GLES20.glClearColor;
import static android.opengl.GLES20.glViewport;
import android.opengl.GLSurfaceView.Renderer;



import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by Leny on 01.03.2016.
 */

public class MyRenderer implements Renderer {
    private static final int POSITION_COMPONENT_COUNT = 2;

    float[] tableVertices = {
            0f, 0f, 0f,
            9f, 14f, 0f,
            0f, 14f, 0f,

            0f, 0f, 0f,
            9f, 0f, 0f,
            9f, 14f, 0f
    };


    @Override
    public void onSurfaceCreated(GL10 glUnused, EGLConfig config) {
        glClearColor(1.0f, 0.0f, 0.0f, 0.0f);


    }

    @Override
    public void onSurfaceChanged(GL10 glUnused, int width, int height) {
        glViewport(0, 0, width, height);
    }

    @Override
    public void onDrawFrame(GL10 glUnused) {
        glClear(GL_COLOR_BUFFER_BIT);

    }
}