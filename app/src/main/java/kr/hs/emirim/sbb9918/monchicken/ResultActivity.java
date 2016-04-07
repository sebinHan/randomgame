package kr.hs.emirim.sbb9918.monchicken;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by appcreate35 on 2016. 3. 28..
 */
public class ResultActivity extends AppCompatActivity {

    static String TAG = "ResultActivity";
    TextView mResult;
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Log.d(TAG, "세빈이 결과 엑티비티 뀨우~?");

        mResult = (TextView) findViewById( R.id.result);
        mImageView = (ImageView) findViewById( R.id.imageView);
        Log.d(TAG, "세빈이 텍스트뷰, 이미지뷰 연결 뀨우~?");

        Random r = new Random();
        int result = r.nextInt(4);
        Log.d(TAG, "세빈이 랜덤값 생성 뀨우~?"+result);

        mImageView.setImageResource(R.drawable.chicken1 + result);

        Intent intent = getIntent();//MainActivity에서 호출한 intent 가져옴
        String name = intent.getStringExtra("name");
        Log.d(TAG, "세빈이 인텐트값 읽기<name> 뀨우~?"+name);

        int age = intent.getIntExtra("age",-1);
        Log.d(TAG, "세빈이 인텐트값 읽기<age> 뀨우~?"+age);

        mResult.setText(name+"님 안녕하세여 <3");
    }
}
