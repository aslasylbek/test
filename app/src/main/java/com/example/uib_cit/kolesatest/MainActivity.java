package com.example.uib_cit.kolesatest;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity implements ListenerSplash {

    private static final String TAG = "MainActivity";
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showAuth();
    }

    // TODO без addToBackStack оно не будет возвращать назад в предыдущий фрагмент
    private void showAuth() {
        AuthFragment fragment = new AuthFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.entry_container, fragment)
                .commit();
    }

    private void showMain() {
        MainFragment fragment = new MainFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.entry_container, fragment)
                .commit();
        Log.e(TAG, "showMain: " );
        // TODO(“show main fragment”)
    }

    @Override
    public void authourized() {
        showMain();
    }

    public static class AuthFragment extends Fragment {

        private ListenerSplash listenerSplash;

        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            onAuthSuccess();
            return inflater.inflate(R.layout.activity_main, container, false);
        }

        public final void onAuthSuccess() {
            listenerSplash = (ListenerSplash)getActivity();
            // TODO(“show main fragment”)
            Log.e(TAG, "onAuthSuccess: ");
            listenerSplash.authourized();
        }
    }

    public static class MainFragment extends Fragment {

    }


}

interface ListenerSplash{
    void authourized();
}
