package www.minchoba.com.calculation.Listener;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.eclipsesource.v8.V8;


/**
 * Created by minchoba on 2017. 1. 17..
 */
public class OnBtnClickListener implements View.OnClickListener { // 1. class를 이용해 간결히 만들자.
    public static final int BTN_AC = -1;
    public static final int BTN_DIV = -2;
    public static final int BTN_SUM = -3;
    public static final int BTN_SUB = -4;
    public static final int BTN_TIMES = -5;
    public static final int BTN_EQUAL = -6; // 상수를 선언하여 키워드 생성 (가동성 up)

    private Context context;
    private TextView resTextView;
    private static StringBuilder sb;  // String을 여러개 연결.

    public OnBtnClickListener(Context context, TextView resTextView) { // findViewById는 activity에서만 사용 가능 하므로
                                                                //TextView 인자를 생성해서 main으로 넘겨준다.

        this.context = context; // 현 화면의 문맥, 상태를 가져 올 것이야
        this.resTextView = resTextView;
        this.sb = new StringBuilder();
        sb.append(resTextView.getText());

    }

    @Override
    public void onClick(View view) {
        Button btn = (Button) view;

        switch ((int) btn.getTag()) {
            case BTN_AC:
//                resTextView.setText("0");

                sb = new StringBuilder(); //  case 별로 String Builder 객체 가져와야?..
                sb.append("0");
                break;
            case BTN_DIV:
                sb.append("/");
                break;
            case BTN_SUM:
                sb.append("+");
                break;
            case BTN_SUB:
                sb.append("-");
                break;
            case BTN_TIMES:
                sb.append("*");
                break;
            case BTN_EQUAL:
                Toast.makeText(context,"equal",Toast.LENGTH_SHORT).show();

                V8 runtime = V8.createV8Runtime(); // gradle에서 complie한 V8 오픈 소스를 가져와 쓴다.
                int result = runtime.executeIntegerScript("eval("+ sb.toString() +")");
                                                //eval () : 괄호 내 수식을 계산해 뽑아주는 함수.
                runtime.release();

                sb = new StringBuilder();
                sb.append(String.valueOf(result));

                break;

            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                if(resTextView.getText().equals("0")){ // 만약 resTextView의 숫자가 0이었다면,
                    sb = new StringBuilder();
                    sb.append(String.valueOf(btn.getTag()));
//                    resTextView.setText(String.valueOf(btn.getTag())); // resTextView의 text를
//                                                                // 눌린 btn의 태그값을 String형으로 가져와서 바꾸어 setting.
                }
                else{
                    sb.append(String.valueOf(btn.getTag()));
//                    resTextView.setText(resTextView.getText() + String.valueOf(btn.getTag()));
//                                                                // 0이 아니었다면, resTextView의 text를 resTextView의 text에 이어
//                                                                // btn의 태그값을 String형으로 가져와 setting.
                }

                break;

        }
        resTextView.setText(sb.toString()); // resTextView에 띄워줄 sb 내용을 String으로 변환해서 set
    }
}
