package zapsolutions.zap.lnurl.pay;

import java.io.Serializable;

/**
 * Please refer to the following references:
 * https://github.com/fiatjaf/lnurl-rfc/blob/luds/09.md
 * https://github.com/fiatjaf/lnurl-rfc/blob/luds/10.md
 */
public class LnUrlPaySuccessAction implements Serializable {

    public static final String TAG_URL = "url";
    public static final String TAG_MESSAGE = "message";
    public static final String TAG_AES = "aes";

    private String tag;
    private String ciphertext;
    private String iv;
    private String message;
    private String description;
    private String url;

    public String getTag() {
        return tag;
    }


    public boolean isMessage() {
        return tag != null && tag.equals(LnUrlPaySuccessAction.TAG_MESSAGE);
    }

    public boolean isUrl() {
        return tag != null && tag.equals(LnUrlPaySuccessAction.TAG_URL);
    }

    public boolean isAes() {
        return tag != null && tag.equals(LnUrlPaySuccessAction.TAG_AES);
    }

    public String getCiphertext() {
        return ciphertext;
    }

    public String getIv() {
        return iv;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }
}
