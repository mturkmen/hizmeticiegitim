package tr.gov.eba.egitim;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends ActionBarActivity{
	TextView data;
	EditText userName;
	EditText password;
	Button kaydet;
	
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.secondary);
		
		data        = (TextView) findViewById(R.id.data);
		userName    = (EditText) findViewById(R.id.userNameEditText);
		password    = (EditText) findViewById(R.id.passwordEditText);
		kaydet      = (Button)   findViewById(R.id.kaydetbtn);
		
		
		kaydet.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				String name = userName.getText().toString();
				String pasString = password.getText().toString();
				
				data.setText("Kullanici adiniz : " + name +
						" Sifreniz : " + pasString);
				
				
				
			}
		});
		
		
		
		
	}


}
