/*App idea maker 1.0 alpha
 * By: Noah Levine & Jonah Stegman
 *
 * "Awesome","Queen","King","Cow","Plum","Pear","Orange","Apple","Musical","Music","Electric","TV","Football","Desk","Soccer","Basketball","Science", "Math","Teacher","School","Money","Movie","Light Saber","Light","Garbage","Sassy","Wall","Hat","Pants","Shirt","Fruit", "Horse" , "Monkey", "Computer", "Tablet", "Phone", "Dog", "Cat", "Banana", "Hair", "Mouse", "Alien" };
   {"","Painter","Trivia","Robber","Suggestor","Collector","Clock","Pass","Brawl","Randomizer","Rater","Destroyer" ,"Fight", "Attack", "Distracter", "Enhancer", "Social media app", "Mystery", "Identifiyer", "Ripeness", "Compare", "Measurer", "Translator"};
*/
package noahlevine.infinity4;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;



public class MyActivity extends ActionBarActivity {

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        final TextView firstTextView = (TextView) findViewById(R.id.textView);


        final ImageButton firstButton = (ImageButton) findViewById(R.id.firstButton);

   final String[] firstWords = getResources().getStringArray(R.array.randy);
   final String[] secondWords = getResources().getStringArray(R.array.rando);

    firstButton.setOnClickListener(new View.OnClickListener() {
             @Override
            final public void onClick(View view) {


                    //first set of random words

                    String random = firstWords[new Random ().nextInt(firstWords.length -1)];
                    //second set of randomized words

                    String randomer = secondWords[new Random ().nextInt(firstWords.length -1)];

                    firstTextView.setText(random + " " + randomer);

                }



        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    //@Override
    //public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    // int id = item.getItemId();
    //  if (id == R.id.action_settings) {
    //    return true;
    //  }
    //  return super.onOptionsItemSelected(item);
    //}
}



