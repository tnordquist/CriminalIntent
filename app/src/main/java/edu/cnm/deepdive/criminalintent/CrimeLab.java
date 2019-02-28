package edu.cnm.deepdive.criminalintent;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab {

  private static CrimeLab sCrimeLab;

  private List<Crime> crimes;

  public static CrimeLab get(Context context) {
    if (sCrimeLab == null) {
      sCrimeLab = new CrimeLab(context);
    }
    return sCrimeLab;
  }

  private CrimeLab(Context context) {
    crimes = new ArrayList<>();
    for(int i = 0;i<100; ++i){
      Crime crime = new Crime();
      crime.setTitle("Crime #" + i);
      crime.setSolved(i%2==0); // Every other one
      crimes.add(crime);
    }
  }

  public List<Crime> getCrimes() {
    return crimes;
  }

  public Crime getCrime(UUID id) {
    for (Crime crime : crimes) {
      if (crime.getId().equals(id)) {
        return crime;
      }
    }
    return null;
  }
}
