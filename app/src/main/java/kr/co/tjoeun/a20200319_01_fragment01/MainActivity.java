package kr.co.tjoeun.a20200319_01_fragment01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import kr.co.tjoeun.a20200319_01_fragment01.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setupEvents();
        setupValues();
    }

    @Override
    public void setupEvents() {
        binding.firstFragCallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                첫 프래그먼트 호출 버튼이 눌리면?
//                firstFrag 보이게 => firstFrag자체는 기능이 별로 없다.
//                firstFrag를 감싸는 레이아웃을 추가 => 얘를 보이게.
                binding.firstFragLayout.setVisibility(View.VISIBLE);
//                secondFrag 숨김.
                binding.secondFragLayout.setVisibility(View.GONE);

            }
        });

        binding.secondFragCallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                첫 프래그 : 숨겨줌
                binding.firstFragLayout.setVisibility(View.GONE);
//                둘째 프래그 : 나타냄
                binding.secondFragLayout.setVisibility((View.VISIBLE));

            }
        });

    }

    @Override
    public void setupValues() {

    }
}
