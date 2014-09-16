package faeworks.resist;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;
import android.view.View;
import android.widget.AdapterView;

public class MyActivity extends ActionBarActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        addListenerOnSpinnerItemSelection();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        return id == R.id.action_settings || super.onOptionsItemSelected(item);
    }


    public Spinner spinner,spinner1,spinner2,spinner3;
public TextView t,t1,t2,t3;

    public void addListenerOnSpinnerItemSelection() {
        spinner = (Spinner) findViewById(R.id.ResistSpinner);
        t=(TextView) findViewById(R.id.Digit1View);
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View view, int position, long id) {
                t.setText(Integer.toString(position));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
             //do nothing
            }
        });

        spinner1 = (Spinner) findViewById(R.id.ResistSpinner1);
        t1=(TextView) findViewById(R.id.Digit2View);
        spinner1.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View view, int position, long id) {
                t1.setText(Integer.toString(position));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                //do nothing
            }
        });

        spinner2 = (Spinner) findViewById(R.id.ResistSpinner2);
        t2=(TextView) findViewById(R.id.multView);
        spinner2.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View view, int position, long id) {
                t2.setText("");
                for(int i=0;i<position;i++)
                {
                t2.append("0");
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                //do nothing
            }
        });

        spinner3 = (Spinner) findViewById(R.id.ResistSpinner3);
        t3=(TextView) findViewById(R.id.TolerateView);
        spinner3.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View view, int position, long id) {

                String selectedVal = getResources().getStringArray(R.array.ToleranceValues)[position];
                t3.setText(selectedVal);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                //do nothing
            }
        });


    }


   // public int digit1,digit2,mult,tolerance;








}
