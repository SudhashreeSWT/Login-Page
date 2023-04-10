package com.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class nextPageafterlogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
//        if (!isOnline())
//        {
//            Dialog dialog=new Dialog(MainActivity.this,R.style.NoInternetDialog);
//            dialog.setContentView(R.layout.new_internet_dialog);
//            TextView retry;
//            retry=dialog.findViewById(R.id.retry);
//            retry.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v)
//                {
//                    finishAffinity();
//                }
//            });
//            dialog.show();
//        }
    }

//    public boolean isOnline()
//    {
//        ConnectivityManager connectivityManager=(ConnectivityManager )getApplicationContext().getSystemService(CONNECTIVITY_SERVICE);
//        NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();
//
//        if (networkInfo==null || !networkInfo.isConnected() || !networkInfo.isAvailable())
//        {
//            return false;
//        }
//
//       return true;
//    }
}