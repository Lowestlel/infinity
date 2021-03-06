/*
 * ∞ (infinity) - 8chan browser for Android - https://github.com/xvdiff/infinity
 * Copyright (c) 2014 xvdiff
 *
 * This program is distributed as free software: You are free to redistribute
 * and/or modify it under the terms of the Apache License v2.0
 *
 * You should have received a copy of the Apache License Version 2.0, January 2004
 * along with this program.  If not, see <http://www.apache.org/licenses/LICENSE-2.0/>.
 *
 */
package com.xvdiff.infinity.ui.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Spinner;

import com.xvdiff.infinity.persistence.Board;
import com.xvdiff.infinity.core.repositories.BoardRepository;
import com.xvdiff.infinity.utils.Guard;

import java.util.List;

public class BoardsAdapter extends BaseAdapter {

    private static final int TYPE_ITEM = 0;
    private static final int TYPE_SEPARATOR = 1;

    private LayoutInflater _layoutInflater;

    private int _lastSelectedPosition = 0;
    private Spinner _spinner;

    public BoardsAdapter(Context context) {
        _layoutInflater = (LayoutInflater) context
                                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public View getView(int id, View view, ViewGroup viewGroup) {
       
    }

    @Override
    public Object getItem(int id) {
        return id;
    }

    @Override
    public long getItemId(int id) {
        return 0;
    }

}
