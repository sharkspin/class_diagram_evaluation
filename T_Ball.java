class Student { 
  String name; 
}       

interface Hitter { 
  void swing(); 
}   

class AtBatRecord { }

class Bat { }

class Ball { 
  void flyAway() { 
    System.out.println("공이 홈런 담장을 넘어갑니다!"); 
  } 
}

class Batter extends Student implements Hitter {    
  private AtBatRecord record; 
  private Bat bat;            

  public Batter() {
        this.record = new AtBatRecord();
  }

  public void grabBat(Bat schoolBat) { 
    this.bat = schoolBat;         
  }

  public void hit(Ball ball) { 
    System.out.println("딱!");
    ball.flyAway();               
  }

  public void swing()
  { 
    System.out.println("규칙에 맞게 올바른 폼으로 스윙합니다!"); 
  }
}
