package activity.lifecycle.android.vogella.com.lifecycleapps;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

/**
 * Created by edmundophie on 2/7/15.
 */
public class SecondActivity extends TracerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
