package com.giro.goroscope;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView oven;
    ImageView bliz;
    ImageView dev;
    ImageView koz;
    ImageView lev;
    ImageView rak;
    ImageView rub;
    ImageView scorp;
    ImageView strel;
    ImageView tel;
    ImageView ves;
    ImageView vod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        oven = findViewById(R.id.ovn);
        bliz = findViewById(R.id.bliz);
        dev = findViewById(R.id.dev);
        koz = findViewById(R.id.koz);
        lev = findViewById(R.id.lev);
        rak = findViewById(R.id.rak);
        rub = findViewById(R.id.rub);
        scorp = findViewById(R.id.scorp);
        strel = findViewById(R.id.strel);
        tel = findViewById(R.id.tel);
        ves = findViewById(R.id.ves);
        vod = findViewById(R.id.vod);

        oven.setClickable(true);
        bliz.setClickable(true);
        dev.setClickable(true);
        koz.setClickable(true);
        lev.setClickable(true);
        rak.setClickable(true);
        rub.setClickable(true);
        scorp.setClickable(true);
        strel.setClickable(true);
        tel.setClickable(true);
        ves.setClickable(true);
        vod.setClickable(true);

        oven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ovenc();
            }
        });

        bliz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bliznec();
            }
        });
        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                devc();
            }
        });
        koz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kozc();
            }
        });
        lev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                levc();
            }
        });
        rak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rakc();
            }
        });
        rub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rubc();
            }
        });
        scorp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scorpc();
            }
        });
        strel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strelc();
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                telec();
            }
        });
        ves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vesc();
            }
        });
        vod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vodc();
            }
        });


    }

    private void ovenc() {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("goroskcope", "Electrical or plumbing problems with your house might come up. Call a professional, Aries. Don't try to fix it yourself, because you could make it worse. Friends might want to visit but tell them to wait until another day. Discussions could quickly deteriorate into arguments today. This is a great day to work quietly alone on whatever interests you the most.");
        startActivity(intent);
    }

    public void telec() {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("goroskcope", "Taurus is the second sign of the Zodiac and Taurus is to do with desire for material things, and emotions. People born in Taurus are calm, patient, reliable, loyal, affectionate, and ambitious. There is also something about their appearance, which makes people excited, which makes them comfortable to be with.");
        startActivity(intent);
    }

    public void bliznec() {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("goroskcope", "Money matters might take a turn for the worse today. Don't fly off the handle because of this, Gemini. Use every bit of financial savvy you have to put things straight. Try to remain calm and collected when dealing with stubborn people. Don't be drawn into arguments. You will be able to pull everything together again, but only by your ingenuity. Don't depend on others.");
        startActivity(intent);
    }

    public void rakc() {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("goroskcope", "Cancer, check your house to make certain everything is in working order. There are indications that small hazards could exist that need correcting. Tension might run high among family members, and quarrels could result. Don't waste time trying to mediate. They will have to work it out for themselves. This is a great day for study and solitude since your mind is especially sharp.");
        startActivity(intent);
    }

    public void levc() {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("goroskcope", " Short visits in your neighborhood could catapult you into some negative situations, Leo. It's best to stay close to home if you can. An angry letter or call could put you in a shaky mood. This isn't a day to socialize. Days like this are best spent keeping to yourself and throwing your energy into taking care of whatever you're working on.");
        startActivity(intent);
    }

    public void devc() {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("goroskcope", "Today you might be a bit worried about your financial affairs, Virgo. A past mistake could have led to some rather upsetting consequences. Now you need to harness every bit of skill you have in order to set things straight. Your knowledge of modern technology could help. A friend might try to pick a quarrel with you, but it's best to stay cool, neutral, and out of the discussion.");
        startActivity(intent);
    }

    public void vesc() {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("goroskcope", "Your physical energy is very high today, Libra. You're likely to want to get out and exercise, perhaps jog through the park or attend a virtual aerobics class. Be careful! You might not be as fit as you think and trying too hard could cause minor injuries. Someone you know professionally might not be in a great mood. You could get swept up in their anger. Try to stay out of it.");
        startActivity(intent);
    }

    public void scorpc() {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("goroskcope", "Uncertainty about spiritual matters and doubt about your insights might have you down in the dumps today. Don't try to force any solutions - it won't work. This isn't a good day to be out and about, because travel of any kind could pose problems. This is also a bad day to plan or start a vacation. Stay close to home and take care of practicalities, Scorpio. That way you will be calm by evening.");
        startActivity(intent);
    }

    public void strelc() {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("goroskcope", "If a friend or acquaintance gives you advice about money or investments today, don't take it. To follow this unknowledgeable person's lead might prove to be disastrous. Participation in group activities also isn't advisable. They could get out of hand, and you could find end up in the middle of an angry crowd. This is a great day to stay home, Sagittarius. Work on your own project.");
        startActivity(intent);
    }

    public void kozc() {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("goroskcope", "Gossip and bad feelings among co-workers or in a group could occur today, and there might be some political shenanigans that it would be in your best interests to avoid. This isn't a good day to go to lunch with co-workers. Get away by yourself. Don't believe anything you hear. Chances are it isn't true. Keep to yourself and don't offer any opinions, Capricorn. To do so might be unfortunate.");
        startActivity(intent);
    }

    public void vodc() {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("goroskcope", "Too much running around might have you feeling exhausted and under the weather today, Aquarius. You may have been exercising a little too much. Therefore, this is a good day to avoid exercise and get some rest. Don't push yourself too hard! This isn't a good day to plan or start a vacation. Wait a few days, as trips planned at this time could be fraught with glitches.");
        startActivity(intent);
    }

    public void rubc() {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("goroskcope", "You could feel extremely passionate today, Pisces. You might want to connect with a love partner but be prevented by circumstances. You might be attracted to racier novels or movies. Repressed anger could bubble up from your subconscious and seek an outlet. This is a great day to channel that anger into some artistic activity. Don't be surprised if you use a lot of red!");
        startActivity(intent);
    }

}