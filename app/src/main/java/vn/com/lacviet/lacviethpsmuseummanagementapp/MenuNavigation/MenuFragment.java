package vn.com.lacviet.lacviethpsmuseummanagementapp.MenuNavigation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jaeger.library.StatusBarUtil;

import vn.com.lacviet.lacviethpsmuseummanagementapp.R;

public class MenuFragment extends Fragment {
    public MenuFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_navigation,container,false);
    }
}