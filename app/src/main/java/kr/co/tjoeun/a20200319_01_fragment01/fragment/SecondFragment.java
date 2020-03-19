package kr.co.tjoeun.a20200319_01_fragment01.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import kr.co.tjoeun.a20200319_01_fragment01.R;
import kr.co.tjoeun.a20200319_01_fragment01.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    FragmentSecondBinding binding = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_second,container,false);
        return binding.getRoot();

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        binding.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String id = binding.idEdt.getText().toString();
                String pw = binding.pwEdt.getText().toString();

                if (id.equals("admin") && pw.equals("asdf1234")) {
                    Toast.makeText(getActivity(), "관리자 로그인!", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (id.equals("admin")) {
//                ID는 맞게 입력
                        Toast.makeText(getActivity(),"비번이 틀렸습니다.", Toast.LENGTH_SHORT).show();
                    }
//              ID 다르게 입력
                    else {
                        Toast.makeText(getActivity(),"잘못된 아이디 입니다.", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });







    }
}
