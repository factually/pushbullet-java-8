package com.github.sheigutn.pushbullet.http.defaults.get;

import com.github.sheigutn.pushbullet.http.defaults.ListItemsRequest;
import com.github.sheigutn.pushbullet.http.Urls;

public class ListChannelsRequest extends ListItemsRequest {

    public ListChannelsRequest() {
        super(Urls.CHANNELS);
    }
}
