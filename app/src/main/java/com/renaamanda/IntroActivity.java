package com.renaamanda;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;
import com.renaamanda.Fragment.Intro1;
import com.renaamanda.Fragment.Intro2;
import com.renaamanda.Fragment.Intro3;

public class IntroActivity extends AppIntro {

    Intro1 intro1 = new Intro1();
    Intro2 intro2 = new Intro2();
    Intro3 intro3 = new Intro3();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        addSlide(AppIntroFragment.newInstance("SELAMAT DATANG", "Saya siap menjadi Android Developer!", R.drawable.uangkas1, getResources().getColor(R.color.design_default_color_primary)));
        addSlide(AppIntroFragment.newInstance("UANGKAS v.2", "Belajar Membuat Aplikasi Manajemen Keuangan Dengan Android Studio, PHP & MySQL",
                R.drawable.uangkas2, getResources().getColor(R.color.design_default_color_primary)));
        addSlide(AppIntroFragment.newInstance("", "",
                R.drawable.uangkas3, getResources().getColor(R.color.design_default_color_primary)));

                setBarColor(getResources().getColor(R.color.design_default_color_primary));
                setSeparatorColor(getResources().getColor(R.color.circle_background));

                // Hide Skip/Done button.
                showSkipButton(true);
                setProgressButtonEnabled(true);

                // Turn vibration on and set intensity.
                // NOTE: you will probably need to ask VIBRATE permission in Manifest.
                setVibrate(true);
                setVibrateIntensity(30);
        }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        // Do something when users tap on Skip button.
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Do something when users tap on Done button.
        finish();
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
        // Do something when the slide changes.
    }
}
