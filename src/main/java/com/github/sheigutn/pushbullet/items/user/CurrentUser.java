package com.github.sheigutn.pushbullet.items.user;

import com.github.sheigutn.pushbullet.http.defaults.post.UpdatePreferencesRequest;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CurrentUser extends User {

    /**
     * The google user info of this user
     */
    @SerializedName("google_userinfo")
    private GoogleUserInfo googleUserInfo;

    /**
     * The preferences of this user
     */
    private JsonObject preferences;

    /**
     * The maximum allowed upload size for files allowed to this user
     */
    @SerializedName("max_upload_size")
    private Number maxUploadSize;

    /**
     * Used to update the preferences of this user
     * @param preferences The preferences object
     */
    public void updatePreferences(JsonObject preferences) {
        getPushbullet().executeRequest(new UpdatePreferencesRequest(preferences));
        this.preferences = preferences;
    }

    @Override
    public void block() {
        throw new UnsupportedOperationException();
    }

    @Data
    public class GoogleUserInfo {

        /**
         * The google name of this user
         */
        private String name;
    }
}
