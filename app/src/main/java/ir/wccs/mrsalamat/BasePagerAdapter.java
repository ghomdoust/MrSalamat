package ir.wccs.mrsalamat;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class BasePagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public BasePagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return MedicalFragment.instance();
            case 1:
                return TourismFragment.instance();
            case 2:
                return TravelFragment.instance();
            default:
                return MedicalFragment.instance();

        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return "پزشکی";
            case 1:
                return "گردشگری";
            case 2:
                return "مسافرتی";
            default:
                return "پزشکی";

    }


    }
}
