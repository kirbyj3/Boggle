package com.example.jacob.boggle;


import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected Button tile1Button;
    protected Button tile2Button;
    protected Button tile3Button;
    protected Button tile4Button;
    protected Button tile5Button;
    protected Button tile6Button;
    protected Button tile7Button;
    protected Button tile8Button;
    protected Button tile9Button;
    protected Button tile10Button;
    protected Button tile11Button;
    protected Button tile12Button;
    protected Button tile13Button;
    protected Button tile14Button;
    protected Button tile15Button;
    protected Button tile16Button;
    Boolean tile1ButtonPushed, tile2ButtonPushed, tile3ButtonPushed, tile4ButtonPushed, tile5ButtonPushed, tile6ButtonPushed,
            tile7ButtonPushed, tile8ButtonPushed, tile9ButtonPushed, tile10ButtonPushed, tile11ButtonPushed, tile12ButtonPushed,
            tile13ButtonPushed, tile14ButtonPushed, tile15ButtonPushed, tile16ButtonPushed;
    protected TextView letterDisplayTextView;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    //private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        letterDisplayTextView = (TextView) findViewById(R.id.letterDisplayTextView);
        letterDisplayTextView.setText("");

        tile1Button = (Button) findViewById(R.id.tile1Button);
        tile1Button.setOnClickListener(this);
        tile1ButtonPushed = false;
        tile2ButtonPushed = false;
        tile3ButtonPushed = false;
        tile4ButtonPushed = false;
        tile5ButtonPushed = false;
        tile6ButtonPushed = false;
        tile7ButtonPushed = false;
        tile8ButtonPushed = false;
        tile9ButtonPushed = false;
        tile10ButtonPushed = false;
        tile11ButtonPushed = false;
        tile12ButtonPushed = false;
        tile13ButtonPushed = false;
        tile14ButtonPushed = false;
        tile15ButtonPushed = false;
        tile16ButtonPushed = false;

        tile2Button = (Button) findViewById(R.id.tile2Button);
        tile2Button.setOnClickListener(this);

        tile3Button = (Button) findViewById(R.id.tile3Button);
        tile3Button.setOnClickListener(this);

        tile4Button = (Button) findViewById(R.id.tile4Button);
        tile4Button.setOnClickListener(this);

        tile5Button = (Button) findViewById(R.id.tile5Button);
        tile5Button.setOnClickListener(this);

        tile6Button = (Button) findViewById(R.id.tile6Button);
        tile6Button.setOnClickListener(this);

        tile7Button = (Button) findViewById(R.id.tile7Button);
        tile7Button.setOnClickListener(this);

        tile8Button = (Button) findViewById(R.id.tile8Button);
        tile8Button.setOnClickListener(this);

        tile9Button = (Button) findViewById(R.id.tile9Button);
        tile9Button.setOnClickListener(this);

        tile10Button = (Button) findViewById(R.id.tile10Button);
        tile10Button.setOnClickListener(this);

        tile11Button = (Button) findViewById(R.id.tile11Button);
        tile11Button.setOnClickListener(this);

        tile12Button = (Button) findViewById(R.id.tile12Button);
        tile12Button.setOnClickListener(this);

        tile13Button = (Button) findViewById(R.id.tile13Button);
        tile13Button.setOnClickListener(this);

        tile14Button = (Button) findViewById(R.id.tile14Button);
        tile14Button.setOnClickListener(this);

        tile15Button = (Button) findViewById(R.id.tile15Button);
        tile15Button.setOnClickListener(this);

        tile16Button = (Button) findViewById(R.id.tile16Button);
        tile16Button.setOnClickListener(this);

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
      //  client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.tile1Button && !tile1ButtonPushed) {
            //Sets background of button to black when pushed
            tile1Button.setBackgroundColor(0x86090404);
            tile1ButtonPushed = true; //button is pushed
            //Adds the letter of Button to TextView
            String tile1ButtonLetter = tile1Button.getText().toString();
            letterDisplayTextView.setText(tile1ButtonLetter);

        } else if (v.getId() == R.id.tile1Button && tile1ButtonPushed) {
            //if Button pressed again, changes background back to original background
            tile1Button.setBackgroundResource(R.drawable.wood1);
            tile1ButtonPushed = false; //the button is no longer pushed
        }

        if (v.getId() == R.id.tile2Button && !tile2ButtonPushed) {
            tile2Button.setBackgroundColor(0x86090404);
            tile2ButtonPushed = true;
        } else if (v.getId() == R.id.tile2Button && tile2ButtonPushed) {
            tile2Button.setBackgroundResource(R.drawable.wood1);
            tile2ButtonPushed = false;
        }

        if (v.getId() == R.id.tile3Button && !tile3ButtonPushed) {
            tile3Button.setBackgroundColor(0x86090404);
            tile3ButtonPushed = true;
        } else if (v.getId() == R.id.tile3Button && tile3ButtonPushed) {
            tile3Button.setBackgroundResource(R.drawable.wood1);
            tile3ButtonPushed = false;
        }


        if (v.getId() == R.id.tile4Button && !tile4ButtonPushed) {
            tile4Button.setBackgroundColor(0x86090404);
            tile4ButtonPushed = true;
        } else if (v.getId() == R.id.tile4Button && tile4ButtonPushed) {
            tile4Button.setBackgroundResource(R.drawable.wood1);
            tile4ButtonPushed = false;
        }


        if (v.getId() == R.id.tile5Button && !tile5ButtonPushed) {
            tile5Button.setBackgroundColor(0x86090404);
            tile5ButtonPushed = true;
        } else if (v.getId() == R.id.tile5Button && tile5ButtonPushed) {
            tile5Button.setBackgroundResource(R.drawable.wood1);
            tile5ButtonPushed = false;
        }


        if (v.getId() == R.id.tile6Button && !tile6ButtonPushed) {
            tile6Button.setBackgroundColor(0x86090404);
            tile6ButtonPushed = true;
        } else if (v.getId() == R.id.tile6Button && tile6ButtonPushed) {
            tile6Button.setBackgroundResource(R.drawable.wood1);
            tile6ButtonPushed = false;
        }

        if (v.getId() == R.id.tile7Button && !tile7ButtonPushed) {
            tile7Button.setBackgroundColor(0x86090404);
            tile7ButtonPushed = true;
        } else if (v.getId() == R.id.tile7Button && tile7ButtonPushed) {
            tile7Button.setBackgroundResource(R.drawable.wood1);
            tile7ButtonPushed = false;
        }

        if (v.getId() == R.id.tile8Button && !tile8ButtonPushed) {
            tile8Button.setBackgroundColor(0x86090404);
            tile8ButtonPushed = true;
        } else if (v.getId() == R.id.tile8Button && tile8ButtonPushed) {
            tile8Button.setBackgroundResource(R.drawable.wood1);
            tile8ButtonPushed = false;
        }

        if (v.getId() == R.id.tile9Button && !tile9ButtonPushed) {
            tile9Button.setBackgroundColor(0x86090404);
            tile9ButtonPushed = true;
        } else if (v.getId() == R.id.tile9Button && tile9ButtonPushed) {
            tile9Button.setBackgroundResource(R.drawable.wood1);
            tile9ButtonPushed = false;
        }

        if (v.getId() == R.id.tile10Button && !tile10ButtonPushed) {
            tile10Button.setBackgroundColor(0x86090404);
            tile10ButtonPushed = true;
        } else if (v.getId() == R.id.tile10Button && tile10ButtonPushed) {
            tile10Button.setBackgroundResource(R.drawable.wood1);
            tile10ButtonPushed = false;
        }

        if (v.getId() == R.id.tile11Button && !tile11ButtonPushed) {
            tile11Button.setBackgroundColor(0x86090404);
            tile11ButtonPushed = true;
        } else if (v.getId() == R.id.tile11Button && tile11ButtonPushed) {
            tile11Button.setBackgroundResource(R.drawable.wood1);
            tile11ButtonPushed = false;
        }

        if (v.getId() == R.id.tile12Button && !tile12ButtonPushed) {
            tile12Button.setBackgroundColor(0x86090404);
            tile12ButtonPushed = true;
        } else if (v.getId() == R.id.tile12Button && tile12ButtonPushed) {
            tile12Button.setBackgroundResource(R.drawable.wood1);
            tile12ButtonPushed = false;
        }

        if (v.getId() == R.id.tile13Button && !tile13ButtonPushed) {
            tile13Button.setBackgroundColor(0x86090404);
            tile13ButtonPushed = true;
        } else if (v.getId() == R.id.tile13Button && tile13ButtonPushed) {
            tile13Button.setBackgroundResource(R.drawable.wood1);
            tile13ButtonPushed = false;
        }

        if (v.getId() == R.id.tile14Button && !tile14ButtonPushed) {
            tile14Button.setBackgroundColor(0x86090404);
            tile14ButtonPushed = true;
        } else if (v.getId() == R.id.tile14Button && tile14ButtonPushed) {
            tile14Button.setBackgroundResource(R.drawable.wood1);
            tile14ButtonPushed = false;
        }

        if (v.getId() == R.id.tile15Button && !tile15ButtonPushed) {
            tile15Button.setBackgroundColor(0x86090404);
            tile15ButtonPushed = true;
        } else if (v.getId() == R.id.tile15Button && tile15ButtonPushed) {
            tile15Button.setBackgroundResource(R.drawable.wood1);
            tile15ButtonPushed = false;
        }

        if (v.getId() == R.id.tile16Button && !tile16ButtonPushed) {
            tile16Button.setBackgroundColor(0x86090404);
            tile16ButtonPushed = true;
        } else if (v.getId() == R.id.tile16Button && tile16ButtonPushed) {
            tile16Button.setBackgroundResource(R.drawable.wood1);
            tile16ButtonPushed = false;
        }


    }

}