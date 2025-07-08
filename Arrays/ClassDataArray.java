public class ClassDataArray {

  private Person [] persones;
  private int nElm;

  public ClassDataArray(int max){
    persones = new Person[max];
    nElm = 0;
  }

  public Person find(String lastN){
    int j;
    for(j= 0 ; j < nElm ; j++){
      if(persones[j].getLast().equals(lastN)) break;
    }
    if(j == nElm) return null;
    else return persones[j];
  }

  public void put(String last, String first , int age){
    Person p = new Person(first, last, age);
    persones[nElm] = p;
    nElm++ ;
  }

  public boolean delete(String searchingName){
    int j;
    for(j = 0; j < nElm; j++){
      if(persones[j].getLast().equals(searchingName)) break;
    }
    if(j == nElm) return false;
    else {
      for(int k = j; k < nElm - 1; k++){
        persones[k] = persones[k+1];
      }
      nElm -- ;  // decrement size bye one !!!
      return true;
    }
  }

  public void displayA(){
    for(int j=0; j<nElm; j++){
      persones[j].displayPerson();
    }
}

}
