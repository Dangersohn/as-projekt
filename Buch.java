public class Buch  {
  
  private int isbn;
  private int anzahl;
  private String titel;
  
  public Buch() {
    this.isbn = 0;
    this.anzahl = 0;
    this.titel = ""; 
  }
  
  public Buch(int isbn,int anzahl,String titel) {
    this.isbn = isbn;
    this.anzahl = anzahl;
    this.titel = titel;    
  }
  
  public void veraendereAnzahl(int anzahl) {
    if ( (this.anzahl + anzahl) >= 0) {
      this.anzahl = this.anzahl + anzahl;
    }  
    else {
      System.out.println("Ver�nderung des Bestands f�hrt zu negativen Best�nden"); 
    } 
  }
  
  public void setAnzahl(int anzahl) {
    if (anzahl >= 0) {
      this.anzahl = anzahl;
    }
    else {
      System.out.println("Bitte Anzahl B�cher gr��er oder gleich 0"); 
    } 
  }
  
  
  public int getAnzahl() {
    return this.anzahl;    
  }
  
  public void setIsbn(int isbn) {
    this.isbn = isbn;    
  }
  
  public int getIsbn() {
    return this.isbn;
  }
  
  public void setTitel(String titel) {
    this.titel = titel;  
  }
  
  public String getTitel() {
    return this.titel;
    
    }
  }
    
