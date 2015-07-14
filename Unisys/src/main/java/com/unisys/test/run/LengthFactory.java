package com.unisys.test.run;

import com.unisys.test.pojo.FairyLightLength;

/**
 * Created by dev on 14/07/15.
 */
public class LengthFactory {

    private static final int DEFAULT_LENGTH = 20;

    public static FairyLightLength create(int size) {
        return new FairyLightLength(size);
    }

    public static FairyLightLength createDefault() {
        return create(DEFAULT_LENGTH);
    }
}
