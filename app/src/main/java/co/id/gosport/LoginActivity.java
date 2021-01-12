package co.id.gosport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import co.id.gosport.callback.FingerprintSecureCallback;
import co.id.gosport.callback.PasswordCallback;
import co.id.gosport.dialog.PasswordDialog;
import co.id.gosport.utils.FingerprintToken;
import co.id.gosport.view.Fingerprint;

public class LoginActivity extends AppCompatActivity implements FingerprintSecureCallback, PasswordCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Fingerprint fingerprint = findViewById(R.id.activity_view_example_fingerprint);
        fingerprint.callback(this, "KeyName2")
                .circleScanningColor(android.R.color.black)
                .fingerprintScanningColor(R.color.colorAccent)
                .authenticate();
    }

    @Override
    public void onAuthenticationSucceeded() {
        Intent pindah = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(pindah);
    }

    @Override
    public void onAuthenticationFailed() {

    }

    @Override
    public void onNewFingerprintEnrolled(FingerprintToken token) {
        PasswordDialog.initialize(this, token)
                .title(R.string.password_title)
                .message(R.string.password_message)
                .callback(this)
                .passwordType(PasswordDialog.PASSWORD_TYPE_TEXT)
                .show();
    }

    @Override
    public void onAuthenticationError(int errorCode, String error) {

    }

    @Override
    public void onPasswordSucceeded() {

    }

    @Override
    public boolean onPasswordCheck(String password) {
        return password.equals("password");
    }

    @Override
    public void onPasswordCancel() {

    }
}