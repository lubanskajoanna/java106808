public class People {
    public int wiek;
    public String imie;
    public String nazwisko;

    public People(int wiek , String imie , String nazwisko){
        this.wiek = wiek;
        this.nazwisko = nazwisko;
        this.imie = imie;
    }

    public String PrintInfo(){
        return "Imie: " + imie + " wiek: " + wiek + " nazwisko: " + nazwisko;
    }
}
