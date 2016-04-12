package kr.hs.emirim.sbb9918.monchicken;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();//splash와 타이머 등등 가능
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                //시작시킬 엑티비티의 intent
                startActivity(intent);
                overridePendingTransition(0,R.anim.zoom_exit);//splash엑티비티로 들어갈때, 나갈때를 매개변수로
                finish();//현재 activity를 마감
                //안하면 바로 intro로 넘어감
            }

        },3000);

    }

}
