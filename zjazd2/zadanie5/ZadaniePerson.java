public class Student implements Person
{
	public int nrIndeksu;
	public int semestr;
  public String imie;
	public String nazwisko;
	public String wyksztalcenie;
  public int wiek;
	void zlozPodanie(String temat);
  void piszEgzamin();
}

public class Teacher implements UniversityPerson
{
  public String imie;
	public String nazwisko;
	public String wyksztalcenie;
  int wiek;
	public String pozycja = "teacher";
  public int idPracownika;
	void zrobEgzamin(String poziom);
	void sprawdzPrace();
}

public class ZadaniePerson
{	
	public static void main(String[] args)
	{
			Student magdalenaZubala = new Student();
			magdalenaZubala.nrIndeksu = 111111;
			magdalenaZubala.semestr = 5;
			magdalenaZubala.imie = "Magdalena";
			magdalenaZubala.nazwisko = "Zubala";
      magdalenaZubala.wyksztalcenie = "srednie";
			magdalenaZubala.wiek = 24;
			magdalenaZubala.zlozPodanie("Warunkowe zaliczenie roku");
			
			Teacher danutaMisztal = new Teacher();
			danutaMisztal.imie = "Danuta";
			danutaMisztal.nazwisko = "Misztal";
      danutaMisztal.wyksztalcenie = "Magister";
			danutaMisztal.wiek = 40;
			danutaMisztal.idPracownika = "123456";
      danutaMisztal.zrobEgzamin("zaawansowany");
	}
}
