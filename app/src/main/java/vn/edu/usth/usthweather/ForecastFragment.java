package vn.edu.usth.usthweather;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class ForecastFragment extends Fragment {
    //

    public ForecastFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //View n = new View(getContext());
        //n.setBackgroundColor(0x20FF0000);
        //return n;

        //TextView

        /*TextView textView = new TextView(getActivity());
        textView.setText("Thursday");
        textView.setTextSize(26);
        textView.setGravity(View.TEXT_ALIGNMENT_CENTER);

        // imageView
        ImageView icon = new ImageView(getActivity());
        icon.setImageResource(R.drawable.weather);
        icon.setScaleType(ImageView.ScaleType.CENTER);*/

        View view = inflater.inflate(R.layout.fragment_forecast, container,  false);

       /* LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.LinearLayout);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
*/
        return view;
        }

}
