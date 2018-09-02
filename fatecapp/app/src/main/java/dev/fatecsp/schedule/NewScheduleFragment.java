package dev.fatecsp.schedule;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;

import dev.fatecsp.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link NewScheduleFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link NewScheduleFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NewScheduleFragment extends Fragment {
    protected java.util.logging.Logger log = java.util.logging.Logger.getLogger(getClass().getName());

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public NewScheduleFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NewScheduleFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NewScheduleFragment newInstance(String param1, String param2) {
        NewScheduleFragment fragment = new NewScheduleFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_schedule, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final AutoCompleteTextView weekday = view.findViewById(R.id.weekday);
        final ListView weekdayList = view.findViewById(R.id.weekdayList);
        weekdayList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,int position, long arg3) {
                String selected = String.valueOf(weekdayList.getItemAtPosition(position));
                weekday.setText(selected);
                weekdayList.setVisibility(View.GONE);
            }
        });

        weekday.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                log.info("onTextChanged");
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                log.info("beforeTextChanged");
                weekdayList.setVisibility(View.VISIBLE);
            }

            @Override
            public void afterTextChanged(Editable s) {
                log.info("afterTextChanged");
            }
        });


        final AutoCompleteTextView course = view.findViewById(R.id.course);
        final ListView courseList = view.findViewById(R.id.courseList);

        courseList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,int position, long arg3) {
                String selected = String.valueOf(courseList.getItemAtPosition(position));
                course.setText(selected);
                courseList.setVisibility(View.GONE);
            }
        });

        course.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                log.info("onTextChanged");
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                log.info("beforeTextChanged");
                courseList.setVisibility(View.VISIBLE);
            }

            @Override
            public void afterTextChanged(Editable s) {
                log.info("afterTextChanged");
            }
        });



        final AutoCompleteTextView subject = view.findViewById(R.id.subject);
        final ListView subjectList = view.findViewById(R.id.subjectList);

        subjectList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,int position, long arg3) {
                String selected = String.valueOf(subjectList.getItemAtPosition(position));
                subject.setText(selected);
                subjectList.setVisibility(View.GONE);
            }
        });

        subject.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                log.info("onTextChanged");
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                log.info("beforeTextChanged");
                subjectList.setVisibility(View.VISIBLE);
            }

            @Override
            public void afterTextChanged(Editable s) {
                log.info("afterTextChanged");
            }
        });


        final AutoCompleteTextView time = view.findViewById(R.id.time);
        final ListView timeList = view.findViewById(R.id.timeList);

        timeList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,int position, long arg3) {
                String selected = String.valueOf(timeList.getItemAtPosition(position));
                time.setText(selected);
                timeList.setVisibility(View.GONE);
            }
        });

        time.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                log.info("onTextChanged");
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                log.info("beforeTextChanged");
                timeList.setVisibility(View.VISIBLE);
            }

            @Override
            public void afterTextChanged(Editable s) {
                log.info("afterTextChanged");
            }
        });




    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {

        void search();
    }
}
