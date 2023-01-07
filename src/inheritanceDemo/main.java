package inheritanceDemo;

public class main {

	public static void main(String[] args) {

		//TarımKrediManager tarımkredimanager=new TarımKrediManager();
		//tarımkredimanager.hesapla();
		
		KrediUI krediUI=new KrediUI();
		krediUI.krediHesapla(new OgretmenKrediManager()); // burada aslında 
		
	}

}
