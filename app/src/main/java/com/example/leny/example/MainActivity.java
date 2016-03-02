package com.example.leny.example;

import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private GLSurfaceView mGLSurfaceView;
    private boolean rendererSet=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mGLSurfaceView = new GLSurfaceView(this);
        mGLSurfaceView.setEGLContextClientVersion(2);
        mGLSurfaceView.setRenderer(new MyRenderer(this));
        rendererSet = true;
        setContentView(mGLSurfaceView);
    }

        protected void onPause(){
        super.onPause();
        if(rendererSet){
            mGLSurfaceView.onPause();
        }
    }

        protected void onResume(){
            super.onResume();
            if(rendererSet){
                mGLSurfaceView.onResume();
            }
        }
    }

