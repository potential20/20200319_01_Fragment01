package kr.co.tjoeun.a20200319_01_fragment01.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import kr.co.tjoeun.a20200319_01_fragment01.R;

public class FirstFragments extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        액티비티의 onCreate에 대응되는 메쏘드.

        setupEvents();
        setValues();
    }

    private void setValues() {
    }

    void setupEvents() {

    }
}
