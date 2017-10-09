package com.amirzayev.remindme.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.amirzayev.remindme.fragment.AbstarctTabFragment;
import com.amirzayev.remindme.fragment.BirthdaysFragment;
import com.amirzayev.remindme.fragment.HistoryFragment;
import com.amirzayev.remindme.fragment.IdeasFragment;
import com.amirzayev.remindme.fragment.TodoFragment;

import java.util.HashMap;
import java.util.Map;

public class TabsFragmentAdapter extends FragmentPagerAdapter {

    private Map<Integer, AbstarctTabFragment> tabs;
    private Context context;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;

        initTabsMap(context);

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabsMap(Context context) {
        tabs = new HashMap<>();

        tabs.put(0, HistoryFragment.getInstans(context));
        tabs.put(1, IdeasFragment.getInstans(context));
        tabs.put(2, TodoFragment.getInstans(context));
        tabs.put(3, BirthdaysFragment.getInstans(context));
    }
}
