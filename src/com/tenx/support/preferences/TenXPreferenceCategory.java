/*
 * Copyright (C) 2020-2022, TenX-OS
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tenx.support.preferences;

import android.content.Context;
import com.tenx.support.R;
import android.util.AttributeSet;
import android.view.View;

import androidx.preference.PreferenceCategory;

public class TenXPreferenceCategory extends PreferenceCategory {

    public TenXPreferenceCategory(Context context, AttributeSet attrs) {
        super(context, attrs);

        setLayoutResource(R.layout.tenx_preference_category);
    }

    public TenXPreferenceCategory(Context context, View view) {
        super(context);
    }
}