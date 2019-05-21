package www.lenovo.com.animationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        init();
    }

    private void init() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        iv = findViewById(R.id.iv);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "hahaha", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                AlphaAnimation alpha = new AlphaAnimation(1f, 0.2f);

                alpha.setDuration(3000);
                alpha.setRepeatCount(1);
                alpha.setRepeatMode(Animation.REVERSE);

                iv.startAnimation(alpha);

                break;
            case R.id.btn2:
                RotateAnimation rotate = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(3000);
                rotate.setRepeatCount(1);
                rotate.setRepeatMode(Animation.REVERSE);
                iv.startAnimation(rotate);

                break;
            case R.id.btn3:
                ScaleAnimation scale = new ScaleAnimation(1.0f, 3.0f, 1.0f, 3.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                scale.setDuration(3000);
                scale.setRepeatCount(1);
                scale.setRepeatMode(Animation.REVERSE);
                iv.startAnimation(scale);

                break;
            case R.id.btn4:

                TranslateAnimation translate = new TranslateAnimation(Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, 0.25f, Animation.RELATIVE_TO_PARENT, 0f, Animation.RELATIVE_TO_PARENT, 0.25f);
                translate.setDuration(3000);
                translate.setRepeatCount(2);
                translate.setFillAfter(true);
                translate.setRepeatMode(Animation.REVERSE);
                iv.startAnimation(translate);

                break;
            case R.id.btn5:
//                execute();
                execute1();
                break;

        }
    }

    private void execute1() {
        AnimationSet animationSet = new AnimationSet(true);

        RotateAnimation ro = new RotateAnimation(0,360,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        ro.setDuration(3000);

        RotateAnimation ro1 = new RotateAnimation(0,3600);
        ro1.setDuration(3000);

        animationSet.addAnimation(ro);
        animationSet.addAnimation(ro1);

        iv.startAnimation(animationSet);



    }

    private void execute() {
        AnimationSet as = new AnimationSet(true);

        AlphaAnimation alpha = new AlphaAnimation(1f, 0.2f);
        alpha.setDuration(3000);
        alpha.setRepeatCount(1);
        alpha.setRepeatMode(Animation.REVERSE);

        RotateAnimation rotate = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(3000);
        rotate.setRepeatCount(1);
        rotate.setRepeatMode(Animation.REVERSE);

        ScaleAnimation scale = new ScaleAnimation(1.0f, 3.0f, 1.0f, 3.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        scale.setDuration(3000);
        scale.setRepeatCount(1);
        scale.setRepeatMode(Animation.REVERSE);

        TranslateAnimation translate = new TranslateAnimation(Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, 0.25f, Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, 0.25f);
        translate.setDuration(3000);
        translate.setRepeatCount(1);
        translate.setRepeatMode(Animation.REVERSE);

        as.addAnimation(alpha);
        as.addAnimation(rotate);
        as.addAnimation(scale);
        as.addAnimation(translate);

        iv.startAnimation(as);
    }


}
