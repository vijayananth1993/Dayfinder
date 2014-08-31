 package com.example.date;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   final DatePicker datepic=(DatePicker)findViewById(R.id.datePicker);
   Button find=(Button)findViewById(R.id.findButton);
   final TextView res=(TextView)findViewById(R.id.resultTextView);
   find.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public boolean onClick(View arg0, MotionEvent arg1) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
	int day=datepic.getDayOfMonth();//
	int month=datepic.getMonth();//
	int year=datepic.getYear();//
	int y=year%100;//last two digits 14
	int x=year/100;//first two digits 20 
	  
	//res.setText(day+"/"+month+"/"+year+"="+x+"="+y);
	int ans=day+y;//step 1
	y=y/4;//
	ans=ans+y;// step 2
	x=x%4;//
	switch(x)
	{
	case 0:
		ans=ans+6;
		break;
	case 1:	
		ans=ans+4;
		break;
	case 2:
		ans=ans+2;
		break;
	case 3:	
		ans=ans+0;
		break;
	}
	switch(month)
	{
	case 0:
		ans=ans+0;
		break;
	case 1:
		ans=ans+3;
		break;
	case 2:
		ans=ans+3;
		break;
	case 3:
		ans=ans+6;
		break;

	case 4:
		ans=ans+1;
		break;
	case 5:
		ans=ans+4;
		break;
	case 6:
		ans=ans+6;
		break;
	case 7:
		ans=ans+2;
		break;
	case 8:
		ans=ans+5;
		break;
	case 9:
		ans=ans+0;
		break;
	case 10:
		ans=ans+3;
		break;
	case 11:
		ans=ans+5;
		break;

	}
	
	ans=ans%7;
	if((year%4!=0))
	{
		
	switch(ans)
	{
	case 0:
		res.setText("Sunday");
		break;
	case 1:
		res.setText("Monday");
		break;
	case 2:
		res.setText("Tuesday");
		break;
	case 3:
		res.setText("Wednesday");
		break;
	case 4:
		res.setText("Thursday");
		break;
	case 5:
		res.setText("Friday");
		break;
	case 6:
		res.setText("Saturday");
		break;
	}
	}
	else
	{
		switch(ans)
		{
		case 1:
			res.setText("Sunday");
			break;
		case 2:
			res.setText("Monday");
			break;
		case 3:
			res.setText("Tuesday");
			break;
		case 4:
			res.setText("Wednesday");
			break;
		case 5:
			res.setText("Thursday");
			break;
		case 6:
			res.setText("Friday");
			break;
		case 0:
			res.setText("Saturday");
			break;
		}	
	}
	return false;
	}
});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
