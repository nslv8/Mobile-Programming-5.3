/*
 * Copyright (c) 2021 The Android Open Source Project
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

package com.example.android.sports.data

import com.example.android.sports.R
import com.example.android.sports.model.Sport

/**
 * Sports data
 */
object SportsData{
    fun getSportsData(): ArrayList<Sport> {
        return arrayListOf(
            Sport(
                id = 1,
                titleResourceId = R.string.baseball,
                subTitleResourceId = R.string.baseball_subtitle,
                imageResourceId = R.drawable.mark,
                sportsImageBanner = R.drawable.mark2
            ),
            Sport(
                id = 2, titleResourceId = R.string.badminton,
                subTitleResourceId = R.string.badminton_subtitle,
                imageResourceId = R.drawable.haechan,
                sportsImageBanner = R.drawable.haechan2
            ),
            Sport(
                id = 3,
                titleResourceId = R.string.basketball,
                subTitleResourceId = R.string.basketball_subtitle,
                imageResourceId = R.drawable.jeno,
                sportsImageBanner = R.drawable.jeno2
            ),
            Sport(
                id = 4,
                titleResourceId = R.string.bowling,
                subTitleResourceId = R.string.bowling_subtitle,
                imageResourceId = R.drawable.nana,
                sportsImageBanner = R.drawable.nana2
            ),
            Sport(
                id = 5,
                titleResourceId = R.string.cycling,
                subTitleResourceId = R.string.cycling_subtitle,
                imageResourceId = R.drawable.renjun,
                sportsImageBanner = R.drawable.renjun2
            ),
            Sport(
                id = 6,
                titleResourceId = R.string.golf,
                subTitleResourceId = R.string.golf_subtitle,
                imageResourceId = R.drawable.chenle,
                sportsImageBanner = R.drawable.chenle2
            ),
            Sport(
                id = 7,
                titleResourceId = R.string.running,
                subTitleResourceId = R.string.running_subtitle,
                imageResourceId = R.drawable.jisung,
                sportsImageBanner = R.drawable.jisung2
            )

        )
    }
}
