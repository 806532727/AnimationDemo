package www.lenovo.com.animationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        getSupportActionBar().hide();
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

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.myalpha);
                iv.startAnimation(alpha);

                break;
            case R.id.btn2:
                Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.myrotate);
                iv.startAnimation(rotate);

                break;
            case R.id.btn3:
                Animation myscale = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.myscale);
                iv.startAnimation(myscale);

                break;
            case R.id.btn4:
                Animation mytranslate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.mytranslate);
                iv.startAnimation(mytranslate);

                break;
            case R.id.btn5:
                Animation myset = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.myset);
                iv.startAnimation(myset);

                break;

        }
    }

}
