package com.hq.ximalaya.interfaces;

import com.ximalaya.ting.android.opensdk.model.track.Track;

import java.util.List;

public interface IHistoryCallback {
    void onHistoryLoaded(List<Track> tracks);


}
