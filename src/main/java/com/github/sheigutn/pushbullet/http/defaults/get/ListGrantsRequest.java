package com.github.sheigutn.pushbullet.http.defaults.get;

import com.github.sheigutn.pushbullet.http.defaults.ListItemsRequest;
import com.github.sheigutn.pushbullet.http.Urls;

public class ListGrantsRequest extends ListItemsRequest {

    public ListGrantsRequest() {
        super(Urls.GRANTS);
    }
}
