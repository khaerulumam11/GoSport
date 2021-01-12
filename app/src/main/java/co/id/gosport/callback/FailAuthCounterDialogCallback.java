package co.id.gosport.callback;


import co.id.gosport.dialog.FingerprintDialog;

public interface FailAuthCounterDialogCallback {
    void onTryLimitReached(FingerprintDialog fingerprintDialog);
}
