package dev.fatecsp.user;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import dev.fatecsp.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ProfileFragmentListener} interface
 * to handle interaction events.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private ProfileFragmentListener mListener;

    @BindView(R.id.navigatorProfile)
    public LinearLayout navigatorProfile;

    @BindView(R.id.navigatorLegalTerms)
    public LinearLayout navigatorLegalTerms;

    @BindView(R.id.navigatorSettings)
    public LinearLayout navigatorSettings;

    @BindView(R.id.navigatorFavorite)
    public LinearLayout navigatorFavorite;

    @BindView(R.id.navigatorHelp)
    public LinearLayout navigatorHelp;

    @BindView(R.id.navigatorSuggestion)
    public LinearLayout navigatorSuggestion;


    @BindView(R.id.navigatorAbout)
    public LinearLayout navigatorAbout;

    @BindView(R.id.navigatorExit)
    public LinearLayout navigatorExit;
    
    public ProfileFragment() {
        // Required empty public constructor
    }
    
    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
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
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_profile, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        navigatorLegalTerms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.openLegalTerms();            }
        });

        navigatorSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.openSettings();            }
        });

        navigatorFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.openFavorites();            }
        });

        navigatorHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.openHelp();
            }
        });

        navigatorSuggestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.openSuggestion();            }
        });

        navigatorAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.openAbout();             }
        });

        navigatorExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.exit();             }
        });

        navigatorProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.openEditProfile();
            }
        });
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof ProfileFragmentListener) {
            mListener = (ProfileFragmentListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement PlaceFragmentListener");
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
    public interface ProfileFragmentListener {
        void openLegalTerms();
        void openSettings();
        void openFavorites();
        void openHelp();
        void openSuggestion();
        void openAbout();
        void exit();
        void openEditProfile();
    }
}
