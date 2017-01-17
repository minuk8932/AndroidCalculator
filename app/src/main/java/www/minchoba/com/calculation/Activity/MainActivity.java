package www.minchoba.com.calculation.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import www.minchoba.com.calculation.Listener.OnBtnClickListener; // Listener를 가져와서 연결.

import www.minchoba.com.calculation.R;

public class MainActivity extends AppCompatActivity {

    private Button acBtn;
    private Button divBtn;
    private Button sumBtn;
    private Button subBtn;
    private Button timesBtn;
    private Button equalBtn;
    private Button zeroBtn;
    private Button oneBtn;
    private Button twoBtn;
    private Button threeBtn;
    private Button fourBtn;
    private Button fiveBtn;
    private Button sixBtn;
    private Button sevenBtn;
    private Button eightBtn;
    private Button nineBtn;
    private TextView resTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) { // android's main
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // 이를 지정안하면 app이 죽는다.

        resTextView = (TextView) findViewById(R.id.main_result_textview);

        acBtn = (Button) findViewById(R.id.main_btn_ac); // button을 객체생성해서 xml의 button을 가져옴.
        acBtn.setTag(OnBtnClickListener.BTN_AC);
        acBtn.setOnClickListener(new OnBtnClickListener(getBaseContext(),resTextView)); // Listener Pack 1.에서 만든 class 객체 생성.
                                                            // outline style로 main을 간결하게, 그리고 유지보수하기 편하게 생성

        divBtn = (Button) findViewById(R.id.main_btn_div);
        divBtn.setTag(OnBtnClickListener.BTN_DIV);
        divBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this,resTextView)); //getBaseContext() = MainActivity.this

        sumBtn = (Button) findViewById(R.id.main_btn_sum);
        sumBtn.setTag(OnBtnClickListener.BTN_SUM);
        sumBtn.setOnClickListener(new OnBtnClickListener(getBaseContext(),resTextView)); // main에서 인자를 1개더 받는모습

        subBtn = (Button) findViewById(R.id.main_btn_sub);
        subBtn.setTag(OnBtnClickListener.BTN_SUB);
        subBtn.setOnClickListener(new OnBtnClickListener(getBaseContext(),resTextView));

        timesBtn = (Button) findViewById(R.id.main_btn_times);
        timesBtn.setTag(OnBtnClickListener.BTN_TIMES);
        timesBtn.setOnClickListener(new OnBtnClickListener(getBaseContext(),resTextView));

        equalBtn = (Button) findViewById(R.id.main_btn_equal);
        equalBtn.setTag(OnBtnClickListener.BTN_EQUAL); // OnBtnClickListener에서 pulbic 선언된 상수를 가져와서 가독성을 풀어준다.
        equalBtn.setOnClickListener(new OnBtnClickListener(getBaseContext(),resTextView));

        zeroBtn = (Button) findViewById(R.id.main_btn_0);
        zeroBtn.setTag(0);
        zeroBtn.setOnClickListener(new OnBtnClickListener(getBaseContext(),resTextView));

        oneBtn = (Button) findViewById(R.id.main_btn_1);
        oneBtn.setTag(1);
        oneBtn.setOnClickListener(new OnBtnClickListener(getBaseContext(),resTextView));

        twoBtn = (Button) findViewById(R.id.main_btn_2);
        twoBtn.setTag(2);
        twoBtn.setOnClickListener(new OnBtnClickListener(getBaseContext(),resTextView));

        threeBtn = (Button) findViewById(R.id.main_btn_3);
        threeBtn.setTag(3);
        threeBtn.setOnClickListener(new OnBtnClickListener(getBaseContext(),resTextView));

        fourBtn = (Button) findViewById(R.id.main_btn_4);
        fourBtn.setTag(4);
        fourBtn.setOnClickListener(new OnBtnClickListener(getBaseContext(),resTextView));

        fiveBtn = (Button) findViewById(R.id.main_btn_5);
        fiveBtn.setTag(5);
        fiveBtn.setOnClickListener(new OnBtnClickListener(getBaseContext(),resTextView));

        sixBtn = (Button) findViewById(R.id.main_btn_6);
        sixBtn.setTag(6);
        sixBtn.setOnClickListener(new OnBtnClickListener(getBaseContext(),resTextView));

        sevenBtn = (Button) findViewById(R.id.main_btn_7);
        sevenBtn.setTag(7);
        sevenBtn.setOnClickListener(new OnBtnClickListener(getBaseContext(),resTextView));

        eightBtn = (Button) findViewById(R.id.main_btn_8);
        eightBtn.setTag(8);
        eightBtn.setOnClickListener(new OnBtnClickListener(getBaseContext(),resTextView));

        nineBtn = (Button) findViewById(R.id.main_btn_9);
        nineBtn.setTag(9);
        nineBtn.setOnClickListener(new OnBtnClickListener(getBaseContext(),resTextView));
    }

}
