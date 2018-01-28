package worldcup.zain.android.worldcup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView;
    private TextView mTextView;
    private Button mButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView=(ImageView)findViewById(R.id.imageView);
        mTextView=(TextView)findViewById(R.id.countryName);
        mButton=(Button)findViewById(R.id.randomButton);

        showRandomCountry();

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRandomCountry();
            }
        });

    }

    public void showRandomCountry(){
        shuffleCountries();
        mImageView.setImageResource(countryNamesArray[0].getmImage());
        mTextView.setText(countryNamesArray[0].getmCountryName());
    }

    countryNames c01=new countryNames(R.drawable.argentina,"Argentina");
    countryNames c02=new countryNames(R.drawable.australia,"Australia");
    countryNames c03=new countryNames(R.drawable.belgium,"Belgium");
    countryNames c04=new countryNames(R.drawable.brazil,"Brazil");
    countryNames c05=new countryNames(R.drawable.colombia,"Colombia");
    countryNames c06=new countryNames(R.drawable.costarica,"Costa Rica");
    countryNames c07=new countryNames(R.drawable.croatia,"Croatia");
    countryNames c08=new countryNames(R.drawable.denmark,"Denmark");
    countryNames c09=new countryNames(R.drawable.egypt,"Egypt");
    countryNames c10=new countryNames(R.drawable.england,"England");
    countryNames c11=new countryNames(R.drawable.france,"France");
    countryNames c12=new countryNames(R.drawable.germany,"Germany");
    countryNames c13=new countryNames(R.drawable.iceland,"Iceland");
    countryNames c14=new countryNames(R.drawable.iran,"Iran");
    countryNames c15=new countryNames(R.drawable.japan,"Japan");
    countryNames c16=new countryNames(R.drawable.mexico,"Mexico");
    countryNames c17=new countryNames(R.drawable.morroco,"Morocco");
    countryNames c18=new countryNames(R.drawable.nigeria,"Nigeria");
    countryNames c19=new countryNames(R.drawable.panama,"Panama");
    countryNames c20=new countryNames(R.drawable.peru,"Peru");
    countryNames c21=new countryNames(R.drawable.poland,"Poland");
    countryNames c22=new countryNames(R.drawable.portugal,"Portugal");
    countryNames c23=new countryNames(R.drawable.russia,"Russia");
    countryNames c24=new countryNames(R.drawable.saudiarabia,"Saudi Arabia");
    countryNames c25=new countryNames(R.drawable.senegal,"Senegal");
    countryNames c26=new countryNames(R.drawable.serbia,"Serbia");
    countryNames c27=new countryNames(R.drawable.spain, "Spain");
    countryNames c28=new countryNames(R.drawable.sweden,"Sweden");
    countryNames c29=new countryNames(R.drawable.switzerland,"Switzerland");
    countryNames c30=new countryNames(R.drawable.southkorea,"South Korea");
    countryNames c31=new countryNames(R.drawable.tunisia,"Tunisia");
    countryNames c32=new countryNames(R.drawable.uruguay,"Uruguay");

    countryNames[]countryNamesArray=new countryNames[]{
 c01, c02, c03, c04, c05, c06, c07, c08, c09, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20,
            c21, c22, c23, c24, c25, c26, c27, c28, c29, c30, c31, c32
    };

    public void shuffleCountries(){
        Collections.shuffle(Arrays.asList(countryNamesArray));

    }




}
