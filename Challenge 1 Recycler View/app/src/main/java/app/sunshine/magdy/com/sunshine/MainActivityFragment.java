package app.sunshine.magdy.com.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;
import java.util.Arrays;



import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    ArrayAdapter<String> mforecastAdapter;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public MainActivityFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        String[] forecastArray = new String[]{
                "tody - sunny - 29 / 15 ", "Tomorrow - foggy - 78/85", "weds - Cloudy - 35/65",
                "tody - sunny - 29 / 15 ", "Tomorrow - foggy - 78/85", "weds - Cloudy - 35/65",
                "tody - sunny - 29 / 15 ", "Tomorrow - foggy - 78/85", "weds - Cloudy - 35/65",
                "tody - sunny - 29 / 15 ", "Tomorrow - foggy - 78/85", "weds - Cloudy - 35/65",
                "tody - sunny - 29 / 15 ", "Tomorrow - foggy - 78/85", "weds - Cloudy - 35/65",
                "tody - sunny - 29 / 15 ", "Tomorrow - foggy - 78/85", "weds - Cloudy - 35/65",
                "tody - sunny - 29 / 15 ", "Tomorrow - foggy - 78/85", "weds - Cloudy - 35/65",
                "tody - sunny - 29 / 15 ", "Tomorrow - foggy - 78/85", "weds - Cloudy - 35/65"
        };
     //   List<String> weekForCast =new ArrayList<String>(
      //          Arrays.asList(forecastArray));

     //   );
     //  mforecastAdapter = new ArrayAdapter<String>(
    //   getActivity(),R.layout.list_item_forecast,R.id.list_item_forecast_textview,weekForCast
//);

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

       // ListView mylist =(ListView)rootView.findViewById(R.id.listview_forcast);
      //  mylist.setAdapter(mforecastAdapter);



        mRecyclerView = (RecyclerView)rootView.findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MyAdapter(forecastArray);
        mRecyclerView.setAdapter(mAdapter);
        return rootView;




    }
}
