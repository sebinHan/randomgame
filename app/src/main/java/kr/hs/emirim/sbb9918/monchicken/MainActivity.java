package kr.hs.emirim.sbb9918.monchicken;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mName;
    Button mButton;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText) findViewById(R.id.name);
        mButton = (Button) findViewById(R.id.btn_show_me_the_chicken);
        mButton.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mName.setText("");
    }

    @Override
    public void onClick(View v) {

        String name = mName.getText().toString();
        /*if (name == null){
            Toast.makeText(this,"이름을 입력해 주세용", Toast.LENGTH_LONG).show();

        }else{
            Toast.makeText(this,name+ "씨 배고파요!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, ResultActivity.class);
            startActivity(intent);
        }*/

        try {
            Toast.makeText(this,name+ "씨 배고파요!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, ResultActivity.class);
            startActivity(intent);

        }catch (NullPointerException e){
            Toast.makeText(this,"이름을 입력해 주세용", Toast.LENGTH_LONG).show();
        }catch (Exception e) {
            Toast.makeText(this,"뭔지 모르겠지만 잘 안돼네여", Toast.LENGTH_LONG).show();
        }

    }
}
