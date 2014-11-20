package com.instahipsta.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instahipsta.R;

/**
 * @author Vladislove
 * @since 16.11.2014
 */
public class Object2  extends Fragment {
    public static final String ARG_OBJECT = "object";

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // The last two arguments ensure LayoutParams are inflated
        // properly.
        View rootView = inflater.inflate(
                R.layout.fragment3, container, false);
        Bundle args = getArguments();
        ((TextView) rootView.findViewById(R.id.fragmentNumber2)).setText(
                Integer.toString(args.getInt(ARG_OBJECT)));
        return rootView;
    }
}
