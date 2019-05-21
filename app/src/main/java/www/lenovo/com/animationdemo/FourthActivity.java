package www.lenovo.com.animationdemo;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationSet;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FourthActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        init();
    }

    private void init() {
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);

        imageView = findViewById(R.id.image);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "haha", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_1:
                ObjectAnimator alpha = ObjectAnimator.ofFloat(imageView, "alpha", 1, 0);
                alpha.setDuration(3000);
                alpha.setRepeatCount(1);
                alpha.setRepeatMode(ValueAnimator.REVERSE);
                alpha.start();


                break;
            case R.id.btn_2:
                ObjectAnimator rotation = ObjectAnimator.ofFloat(imageView, "rotationX", 0f, 360f);
                ObjectAnimator rotationY = ObjectAnimator.ofFloat(imageView, "rotationY", 0f, 360f);
                rotation.setDuration(3000);
                rotation.setRepeatCount(1);
                rotation.setRepeatMode(ValueAnimator.REVERSE);
                rotationY.setDuration(3000);
                rotationY.setRepeatCount(1);
                rotationY.setRepeatMode(ValueAnimator.REVERSE);
                rotation.start();
                rotationY.start();


                break;
            case R.id.btn_3:
                List<String> list = new ArrayList<>();
                String scalex = "scaleX";
                String scaley = "scaleY";
                list.add(scalex);
                list.add(scaley);

                ObjectAnimator scaleX = ObjectAnimator.ofFloat(imageView, list.get(0), 1f, 1.5f, 0.5f);
                ObjectAnimator scaleY = ObjectAnimator.ofFloat(imageView, list.get(1), 1f, 1.5f, 0.5f);
                scaleX.setDuration(3000);
                scaleY.setDuration(3000);
                scaleX.setRepeatCount(1);
                scaleY.setRepeatCount(1);
                scaleX.setRepeatMode(ValueAnimator.REVERSE);
                scaleY.setRepeatMode(ValueAnimator.REVERSE);
                scaleX.start();
                scaleY.start();


                break;
            case R.id.btn_4:
                float curTranslationX = imageView.getTranslationX();
                ObjectAnimator translationX = ObjectAnimator.ofFloat(imageView, "translationZ", curTranslationX, 300, curTranslationX);
                translationX.setDuration(3000);
                translationX.setRepeatMode(ValueAnimator.REVERSE);
                translationX.setRepeatCount(1);
                translationX.start();

                break;
            case R.id.btn_5:
                AnimatorSet as = new AnimatorSet();
                ObjectAnimator alpha1 = ObjectAnimator.ofFloat(imageView, "alpha", 0.5f, 1);
                ObjectAnimator rotation1 = ObjectAnimator.ofFloat(imageView, "rotationX", 0f, 360f);
                ObjectAnimator rotationY1 = ObjectAnimator.ofFloat(imageView, "rotationY", 0f, 360f);
                ObjectAnimator scaleX1 = ObjectAnimator.ofFloat(imageView,"scaleX", 1f, 1.5f, 0.5f);
                ObjectAnimator scaleY1 = ObjectAnimator.ofFloat(imageView, "scaleY", 1f, 1.5f, 0.5f);
                ObjectAnimator translationX1 = ObjectAnimator.ofFloat(imageView, "translationZ", 0, 300, 0);
                as.setTarget(imageView);
                as.playTogether(alpha1,rotation1,rotationY1,scaleX1,scaleY1,translationX1);
                as.setDuration(5000);
                as.start();


                break;


        }

    }
}
