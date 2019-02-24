package edu.cnm.deepdive.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CrimeActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_crime); // inflates the view

    FragmentManager fm = getSupportFragmentManager();
    Fragment fragment = fm.findFragmentById(R.id.fragment_container);

    if (fragment == null) {
      fragment = new CrimeFragment();
      /*
      The following code says, "Create a new fragment transaction, include one
      add operation it, and then commit it.
       */
      fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        /* .add ... line of code creates and commits a fragment transaction.
        Fragment transactions are used to add, remove, attach, detach, or
        replace fragments in the fragment list.  They are the heart of how you
        use fragments to compose and recompose screens at runtime. The Fragment-
        Transaction class uses a fluent interface and returns a FragmentTrans-
        action so that the fragments can be chained together.
        */
    }
  }
}
