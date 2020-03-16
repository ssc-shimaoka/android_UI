package com.example.android_ui.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.android_ui.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    ListView listview;
    private static final String[] foods = {"りんご","みかん"};

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        return root;
    }

    // Viewが生成し終わった時に呼ばれるメソッド
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        listview = (ListView) view.findViewById(R.id.listview);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this.getContext(), android.R.layout.simple_list_item_1, foods);
        listview.setAdapter(arrayAdapter);
    }

}
