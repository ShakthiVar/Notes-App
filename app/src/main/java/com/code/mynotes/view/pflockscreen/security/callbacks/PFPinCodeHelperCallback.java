package com.code.mynotes.view.pflockscreen.security.callbacks;

import com.code.mynotes.view.pflockscreen.security.PFResult;

public interface PFPinCodeHelperCallback<T> {
    void onResult(PFResult<T> result);
}
