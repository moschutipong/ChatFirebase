package com.example.leomossi.chatfirebase.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.leomossi.chatfirebase.R;
import com.example.leomossi.chatfirebase.fragment.PublicFragment;

public class PublicRoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public_room);

        init();
    }

    private void init() {

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_public_room, PublicFragment.newInstance())
                .commit();

        String nameGroup = getIntent().getExtras().get("nameGroup").toString();
        setTitle(nameGroup);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
