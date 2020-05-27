package com.sanelee.vue.result;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sanelee
 * @date 2020/5/27
 **/
@Data
public class Result {
    private int code;

    public Result(int code) {
        this.code = code;
    }
}
