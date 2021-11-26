package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Main6Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
    }
}
public class MainActivity extends AppCompartActivity Runnable,SensorEventListener{
    Ball ball;
    Obstacle obstacle;
    Hole hole;
    Handler handler;

    int width,height;

    float[] mgValues = new flort[3];
    float[] acValues = new float[3];
    float[] attitude = new float[3];
    SensorManager mSensorManager;
    Sensor mAccelerometer, mMagFiled;

    int MAX_V = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        WindowManager windowManager = (WindowManager)getSystemService(WINDOW_SERVICE);
        Display display = windowManager.getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        width = point.x;
        height = point.y;

        RelativeLayout relativeLAyout
    }
}