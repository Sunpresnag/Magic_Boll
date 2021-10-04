package com.example.magicboll;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity implements ShakeDetector.OnShakeListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(new MyDraw(this));
        ShakeDetector shakeDetector = new ShakeDetector(this);
        shakeDetector.setOnShakeListener(this);
    }
    boolean answer = false;
    public void tap(View view) {
        if(answer){
            Toast.makeText(this, "Вы уже спрашивали!", Toast.LENGTH_LONG).show();
            finish();
        }

        TextView text = (TextView) this.findViewById(R.id.message);

        Animation shake = AnimationUtils.loadAnimation(this, R.anim.shake);

        View window = this.findViewById(R.id.window);
        window.startAnimation(shake);

        Animation in = AnimationUtils.loadAnimation(this,
                android.R.anim.fade_in);
        text.startAnimation(in);

        int res = (int) (Math.random() * 3);

        /*********************************
         //TYPE YOUR MAGIC CODE HERE
         //JUST AMAZING switch & case
         //USE strings.xml's POWER
         *********************************/
        switch (res){
            case 1:
                text.setText(R.string.No);
                break;
            case 2:
                text.setText(R.string.LOL);
                break;
            case 0:
                text.setText(R.string.Yes);
                break;
        }
        answer = true;
        //text.setText(R.string.stub1);
    }

    @Override
    public void onShake() {
        tap(null);
    }
}
