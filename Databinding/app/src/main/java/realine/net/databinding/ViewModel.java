package realine.net.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;

import java.util.Random;

/**
 * Created by YangLong on 3/2/2016.
 */

public class ViewModel extends BaseObservable {
    private User user = new User("Yang", 29);

    @Bindable
    public String getUserName(){
        return user.getName();
    }

    @Bindable
    public int getUserAge(){
        return user.getAge();
    }

    @Bindable
    public boolean isUserYoung() {
        return user.isYoung();
    }

    public void onUpdateUI(View view){
        user.newAge();
        notifyChange();
    }
}
