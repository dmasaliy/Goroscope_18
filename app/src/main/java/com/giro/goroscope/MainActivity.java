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
        intent.putExtra("goroskcope", "A ram - he is a ram. Always right and niibet. It's easier to kill right away than to start arguing with him, because it is possible to argue with Aries only in one case - if he is a deaf-blind-mute armless and legless invalid (and then, there is a huge chance that even in this case he will still show you a dick). But Aries are honest. Sometimes they are so honest that they are dropping their teeth: they will answer extremely honestly if a haircut does not suit you or the dress makes you look fat. There is nothing you can do about it, you have to put up with (or kill, as mentioned above). In household chores, Aries, as a rule, is useless - he only knows how to generate brilliant ideas, and tries not to defile the soles of the ashes of life. However, if you let Aries understand that Sagittarius washes floors better than him - with bones, bitch, he will lie down, but will rosin your parquet every Saturday, because there is no thing in the world that Aries would give up to Sagittarius. It's never boring with Aries - this sign has some kind of karmic, bitch, talent to seek adventure on your beautiful ass. Easily and quickly knows how to make money, but loot as a proud and principled type hates, so he tries to get rid of it instantly. At the same time, the bitch always has some stash, which is actually much more decent for a Virgo to have. Because of the impenetrable rashness about the stash, he forgets that it is very good for Aries's heartfelt friend, especially if this friend is Gemini.");
        startActivity(intent);
    }

    public void telec() {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("goroskcope", "Taurus is fucked up and I have nothing more to say about this sign. Even more stubborn than Aries, but does not possess its enchanting carelessness. Plyushkin, capable of lovingly keeping any unnecessary shit in the house for centuries, is very surprised when they try to put all these broken transistor receivers, ball bearings, rags, waste paper and other crap in the trash. He is constant in his attachments, including to human shit, which is why he is unhappy in love, alas. Suspicious to usseru, jealous as a bitch, never an innovator, so at first glance it may seem like a dull asshole. Secret pervert. He loves fucking until he loses his pulse. Distrustful of new people, but for old friends he will tear the last calico shirt on his chest and a hair on his ass. What the fuck is a torn shirt for friends - basically not capable of thinking. Altruist, although he constantly gets punched in the face for it.");
        startActivity(intent);
    }

    public void bliznec() {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("goroskcope", "Gemini is very cool if it is one, and absolutely a paragraph, if there are at least two of them. They can fuck without stopping for at least three days and never repeat themselves, which is generally cool, but sometimes tiresome. Gemini is usually envied by everyone, because he is a reaper, a reader, and a gambler, in other words, there is a plug in every ass. But no one realizes how difficult it is for Gemini to survive and choose in this huge world of possibilities - it always seems to them that life is passing by, even if he is up to his ears in shit in events. Likes to fuck, eat and get new information - best of all at the same time. For this he is reputed to be a pervert, although in fact he just saves time. Phenomenally lazy, he unfolds ninety percent of his vigorous activity only so that they finally get fucked off of him and leave him alone. It gives the impression of pizdobol and washi in general, although in fact it is not a fool to read in the intervals between the pranks of Kant and Kierkegaard (reading is often accompanied by idiotic laughter and interjections like, which looks very nice, because Kierkegaard's humor can really find only Gemini). Sentimental as the last whore on the port, he believes in romance, although he constantly disowns it and demonstratively bares his teeth at those who talk about it. In love, he is usually unhappy (I just want to say - because he believes in romance), because only Aries is able to endure the extravaganzas of idiotic fun and cheerful idiocy constantly arranged by Gemini, and Govna is not enough for all Gemini. ");
        startActivity(intent);
    }

    public void rakc() {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("goroskcope", "Боюсь показаться предвзятой, но - гаже Рака нету знака По крайней мере, для меня. Рак - мнительное чмо, постоянно надоедает всем вопросами типа: \"а если я сяду в джакузи после Педро-Франческо-Мудозвондо, который, конечно же, дрочил под водой на мой светлый образ, не забеременю ли я?\" При этом Рака абсолютно не волнует, что у него нет джакузи и вообще он мужик. Склонен постоянно воображать конец света, пугаться собственного воображения, впадать в истерику и прибегать к Деве за утешением. Брезглив как падла, на необитаемом острове обязательно сдохнет от голода, потому что физически не способен сожрать продукт, не завернутый в полиэтилен, а валяющийся, скажем, под пальмой. Ебаться любят, но как-то без огонька. Впрочем, если захочет, может дать жару, но потом сожрет себя с говном за то, что так старался в общем-то зря. Женщины-Раки - это как раз те, кто смотрит порнуху с надеждой, что в конце все непременно поженятся. Любят долго и мрачно пиздеть на тему собственных болячек и прочих жизненных неудач, чем отпугивают от себя всех, кроме Тельцов - они еще более нудны в вопросах, касающихся собственного организма. Верные, потому что боятся хламидий и трихомоноза. Склонны к пьянству и философии, и то и другое обычно до добра Раков не доводит.");
        startActivity(intent);
    }

    public void levc() {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("goroskcope", "People are divided into two classes - the retinue, which is allowed to the body, and the lackeys, about whom the claws and teeth are sharpened. Egoist, of course, but you forgive Leo selfishness for his holy and unshakable faith in his own disgustingness. Fall on flattery, bitch, with the help of you can pull anything out of Leo. Generous and not a fool to laugh at himself. Everyone else should refrain from making fun of Leo, if there is no desire to spend the remaining hours of painful existence in intensive care with a stake in the ass. Hamovat, but elegant. Capable of trampling anyone. head over heels in poop, which sometimes does out of pure curiosity and childish ueban desire. Master in everything. The partner clearly makes it clear how fucking happiness came to him in the form of a Leo and requires an appropriate treatment. if in everyday life his name is simply the Almighty. Loyal, however, a friend, loves to give expensive and valuable gifts so that everyone once again imbued with his carelessness. Likes to devour, sleep and drink this is why he is often friends with Gemini. Unbearable in large quantities if you are Virgo, Cancer or Pisces. ");
        startActivity(intent);
    }

    public void devc() {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("goroskcope", "What can you say about the sign, when dry science has already said everything for me? Virgo is the most, bitch, cruel and inhuman sign of the zodiac. According to international statistics, most of all psychopathic maniacs grow from Virgos. This bitch is capable of smiling affectionately at you, and in my head draw a delightful picture of your intestines tied to a chandelier.I will give you a secret - all the little Virgins in childhood plan to become the Black Lords of the Planet, and when they grow up and understand that they have fucked, they become simply heartless monsters and poison with their pedantry and love of the law and order (and the roots, of course, are still from snivelling desires to seize the Universe) the existence of literally everyone who is lucky enough to live with Virgo on the same territory.The Virgo wife is the aunt who makes your bed when you get up to piss at three in the morning. Virgo is the scariest math teacher you can imagine. Control freaks, of course. Fucking on schedule because everything has to be order. He does not explain the reasons for his actions to anyone, the reason for this is, again, megalomania taken from childhood. However, she can go to the other extreme - not put herself in a penny and in general, bitch, every day pretend to be a sacrifice and a lamb, which makes those around him terribly distressed. In general, by the way, he loves to play on the nerves of loved ones and begin to suffer in public, and, the reptile, she herself usually believes in her suffering, which is why she begins to ache and wither. In everyday life, it is useful, because she knows and can do a lot of all kinds of kunshtuk (she learned it while she was planning to become the Black Sovereign). In general, you can live with her if you totally abstract yourself and remove weapons from your house. ");
        startActivity(intent);
    }

    public void vesc() {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("goroskcope", "In short - an esthete of dicks. Seven Fridays a week - and there too: Picasso, Gauguin-huyens, oh holy art, and you can't take out the trash cans behind you. Not until that. he does not find to learn how to cook or sew on buttons. Likes to dress up, while fucking everyone around, choosing between the one with mother-of-pearl buttons and that with silk stitching. that with his soul he is always faithful to the One / oh, and the body is so, the essence is fetid dust. In general, he is still a gondon. He is chasing emotional balance, which is in principle unattainable for Libra, because a fucking nature always outweighs highly spiritual ideals. indecisive fuckers, often suffers from nervous diseases like psoriasis and gastritis.Envy, but not spiteful.Is inclined to substitute the ass, and does it exclusively from masochistic l yubvi to humanity, and not in order to get something. It usually looks tender and sad, awakens a dangerous desire to caress and take it under your wing, which should not be done in any case, because the Libra's brain can endure better than all other signs combined. Is, stsuko, in a constant cognitive dissonance between reality and the desired, because a goof. ");
        startActivity(intent);
    }

    public void scorpc() {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("goroskcope", "Fucker-terrorist. When there is no one to fuck, the brain starts to fuck. As a rule, to himself. Constantly gushes with all sorts of delusional ideas, narcissistic to the shit, day after day he is ready to stare at his reflection in the mirror and with a tender smile state that the world is more beautiful No. Hysterical, and does not even hesitate to flaunt it. In life, he is interested only in fucking and himself, at the extreme - in people who are interested in him. Good-natured, if you do not try to borrow money from him. By the way, he loves money almost as much as himself and knows how to earn them. Secretive, bitch, no strength whatsoever, to get the information out of Scorpio, which he does not want to disclose, is practically as difficult as marrying a fifty-year-old virgin. In the desire and ability to break through the wall with his forehead can only be compared with Aries, often chooses the same stupid goals, but does not give up on the principle. Stoically transfers the whole ass, which is perm Nentno happens to him, because he knows - he deserves it. On the whole, he gives the impression of a jabberwock - scary, loud, stsuko, formidable - but in his heart is a true shushpanchik. ");
        startActivity(intent);
    }

    public void strelc() {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("goroskcope", "Sagittarius is another zodiac pedestrian. Sagittarius's personal opinion must become the ultimate truth for everyone who happens to be nearby. He expresses it willingly, often and even when he is strongly advised not to do so and is generally threatened to break a litso for it. In general, a bitch is a very lucky sign in life, which somewhat compensates for the constant lack of money in him. Sagittarius, despite his tendency to accusatory verbal diarrhea, usually has many friends who feed him, the poor, and And all because he deftly knows how to pretend to be puska, especially when his mouth is busy with grub. The main drawback is that he cannot shut up, telling everyone the truth about everyone, therefore he is able to do too much, for which, again, there is often a beat. drug addiction, bitch, as well as religious fanaticism, which is essentially the same thing. Good, but fuck it right away. ");
        startActivity(intent);
    }

    public void kozc() {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("goroskcope", "At first glance - sad shit (s). Capricorn's motto is: no matter how bad it is today, tomorrow it will probably be even worse. Disguises itself, bitch, under a peppy, so as not to get fucked for a gloomy expression, but still rakes. Happiness Capricorn comprehends in only one way - he fucks like a cursed. Lazy Capricorn is a dead Capricorn. Do you need it? At first it seems meek and even tame, but at the first convenient opportunity the podzhopyr will give you his gnarled horns, with special pleasure he will do it if you are Gemini or Leo - he hates these signs for inappropriate playfulness. but not always. Best of all he feels in an embrace with a money bag. Likes to pull up, cannot even stop when the situation gets tense, but he does it so skillfully that he himself It eats when it comes out dry from water. In general, he is not a dirty trick, although he looks like that. In choosing partners, he is guided mainly by common sense and calculation, therefore, in family life, a dog is happy like no one else. ");
        startActivity(intent);
    }

    public void vodc() {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("goroskcope", "Special signs - everyone, well, absolutely every bastard likes it, like the notorious gold piece. In terms of pissing, it competes with the Gemini, to communicate, even in an unfamiliar company he is torn like a long-distance sailor in the red light district. A light veil of fucking gives Aquarius an inexplicable charm, which attracts stupid enthusiastic fonnats to them. - a great criminal. Always a swindler, even if only in dreams. There is no Aquarius without criminality in the dark past, the law breaks completely without remorse and even, I'm not afraid of this word, with pleasure. At the same time, the bitch understands perfectly, unlike those the same Gemini that acts non-kosher, but put on it. Externally they look like a cross between the Mad Hatter and Marilyn Monroe. ");
        startActivity(intent);
    }

    public void rubc() {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("goroskcope", "There are two kinds of fish: the fiends of hell, who are disgraced in their own unscrupulousness, and the angels who are faithful, truly kind, with unshakable morality. Moreover, vile Pisces, as a rule, are forgiven in life, fucking, while angel-like Fish-martyrs annoy the inhabitants with unattainable holiness. can in a terrible way, and catching a Fish on slut or making her confess it is more difficult than seeing a wrinkled dung. Until the last you will look into her honest eyes full of tears and believe, believe. Soulless condom, no moral principles. -black, and even when it seems that there is no need to catch up with fog and generally mislead people, but you cannot be offended at Pisces, hellish pangs of conscience are a common thing for them, and sometimes they suffer to a heap and for something that is not They tend to idealize people, and then take offense at them because they turned out to be assholes. we are in our illusions, and even when they turn out to be bitches and bastards, you still involuntarily forgive them for their global inability to live in our material world. ");
        startActivity(intent);
    }

}