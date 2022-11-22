package com.tukoreatp.wepstudying;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Builder
@RequiredArgsConstructor
public class DemoModel {

    @NotNull
    private String id;
}
