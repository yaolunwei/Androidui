package com.bigoat.ui.vtablayout.adapter;


import android.view.View;

import com.bigoat.ui.vtablayout.widget.TabView;

/**
 * @author chqiu
 *         Email:qstumn@163.com
 */
public interface TabAdapter {
    int getCount();

    TabView.TabBadge getBadge(int position);

    TabView.TabIcon getIcon(int position);

    TabView.TabTitle getTitle(int position);

    View getDividerView(int position);

    int getBackground(int position);
}
