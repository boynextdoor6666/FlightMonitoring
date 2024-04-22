import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Calendar;

public class test {
	
	public static ArrayList<Flight> flights = new ArrayList<Flight>();
	public static ArrayList<Capital> capitals = new ArrayList<Capital>();
	
	public static void main(String args[]) {
		

		int ctrl = 0;
		if(ctrl == 0) {
			Capital istanbul = new Capital("Turkey, Istanbul");
			Capital newyork = new Capital("USA, New York");
			Capital sydney = new Capital("Australia, Sydney");
			Capital paris = new Capital("France, Paris");
			Capital tokyo = new Capital("Japan, Tokyo");
			Capital moscow = new Capital("Russia, Moscow");
			Capital berlin = new Capital("Germany, Berlin");
			Capital rome = new Capital("Italy, Rome");
			Capital london = new Capital ("United Kingdom, London");
			Capital dublin = new Capital("Ireland, Dublin");
			Capital prague = new Capital("Czech Republic, Prague");
			Capital seoul = new Capital("South Korea, Seoul");
			Capital vien = new Capital("Austria, Vien");
			Capital warsaw = new Capital("Poland, Warsaw");
			Capital newdeli = new Capital("India, New Delhi");
			Capital madrid = new Capital("Spain, Madrid");
			Capital ottawa = new Capital("Canada, Ottawa");
			Capital budapest = new Capital("Hungary, Budapest");
			Capital athen = new Capital("Greece, Athen");
			Capital washingtondc = new Capital("USA, Washington DC");
			Capital canberra = new Capital("Australia, Canberra");
			Capital montevideo = new Capital("Uruguay, Montevideo");
			Capital beijing = new Capital("China, Beijing");
			Capital edinburgh = new Capital("Scotland, Edinburgh");
			Capital baghdad = new Capital("Iran, Baghdad");
			Capital brasilia = new Capital("Brazil, Brasilia");
			Capital buenosaires = new Capital("Argentina, Buenos Aires");
			Capital oslo = new Capital("Norway, Oslo");
			Capital stockholm = new Capital("Sweden, Stockholm");
			Capital helsinki = new Capital("Finland, Helsinki");
			Capital copenhagen = new Capital("Denmark, Copenhagen");
			Capital zagreb = new Capital("Croatia, Zagreb");
			Capital belgrade = new Capital("Belgrade, Serbia");
			Capital mexicocity = new Capital("Mexico, Mexico City");
			Capital wellington = new Capital("New Zealand, Wellington");
			Capital kiev = new Capital("Ukraine, Kiev");
			Capital bratislava = new Capital("Slovakia, Bratislava");
			Capital minsk = new Capital("Belarus, Minsk");
			Capital ljubljana = new Capital("Slovenia, Ljubljana");
			Capital capetown = new Capital("South Africa, Cape Town");
			Capital bishkek = new Capital("Kyrgyzstan, Bishkek");
			Capital astana = new Capital("Kazakhstan, Astana");
			Capital ulanbatur = new Capital("Mongolia, Ulan Batur");
			Capital santiago = new Capital("Chili, Santiago");
			Capital sanjuan = new Capital("Puerto Rico, San Juan");
			Capital taipei = new Capital("Taiwan, Taipei");
			Capital tashkent = new Capital("Uzbekistan, Tashkent");
			Capital edinburg = new Capital("Scotland, Edinburg");
			Capital chisinau = new Capital("Moldova, Chisinau");
			Capital bucharest = new Capital("Romania, Bucharest");
			Capital saraevo = new Capital("Bosnia and Herzegovina");
			Capital amsterdam = new Capital("Netherlands, Amsterdam");
			Capital islamabad = new Capital("Pakistan, Islamabad");
			Capital damascus = new Capital("Sirya, Damascus");
			Capital pyongyang = new Capital("North Korea, Pyongyang");
			Capital baku = new Capital("Azerbaijan, Baku");
			Capital dushanbe = new Capital("Tajikistan, Dushanbe");
			Capital yerevan = new Capital("Armenia, Yerevan");
			Capital Vilnius = new Capital("Litva, Vilnius");
			Capital riga = new Capital("Latvia, Riga");
			Capital florence = new Capital("Italy, Florence");
			Capital venice = new Capital("Italy, Venice");
			Capital toscana = new Capital("Italy, Toskana");
			Capital naples = new Capital("Italy, Naples");
			Capital lisbon = new Capital("Portugal, Lisbon");



			
			capitals.add(istanbul);
			capitals.add(newyork);
			capitals.add(sydney);
			capitals.add(paris);
			capitals.add(tokyo);
			capitals.add(moscow);
			capitals.add(berlin);
			capitals.add(rome);
			capitals.add(london);
			capitals.add(dublin);
			capitals.add(prague);
			capitals.add(seoul);
			capitals.add(vien);
			capitals.add(warsaw);
			capitals.add(newdeli);
			capitals.add(madrid);
			capitals.add(ottawa);
			capitals.add(budapest);
			capitals.add(athen);
			capitals.add(washingtondc);
			capitals.add(canberra);
			capitals.add(montevideo);
			capitals.add(beijing);
			capitals.add(edinburgh);
			capitals.add(baghdad);
			capitals.add(brasilia);
			capitals.add(buenosaires);
			capitals.add(oslo);
			capitals.add(stockholm);
			capitals.add(helsinki);
			capitals.add(copenhagen);
			capitals.add(zagreb);
			capitals.add(belgrade);
			capitals.add(mexicocity);


		
			ArrayList<String> weekdays = new ArrayList<String>(7);
			weekdays.add("Monday");
			weekdays.add("Tuesday");
			weekdays.add("Wednesday");
			weekdays.add("Thursday");
			weekdays.add("Friday");
			weekdays.add("Saturday");
			weekdays.add("Sunday");
			
			Flight flight1 = new Flight(setCalendar(0,15,0), setCalendar(0,5,0), weekdays, "1001", "THY", paris, tokyo, setCalendar(0,10,0));
			Flight flight2 = new Flight(setCalendar(0,20,0), setCalendar(0,10,0), weekdays, "1002", "American", brasilia, budapest,  setCalendar(0,10,0));
			Flight flight3 = new Flight(setCalendar(0,18,0), setCalendar(0,13,0), weekdays, "1003", "Delta", buenosaires, copenhagen, setCalendar(0,5,0));
			Flight flight4 = new Flight(setCalendar(0,25,0), setCalendar(0,15,0), weekdays, "1004", "Southwest", beijing, moscow, setCalendar(0,10,0));
			Flight flight5 = new Flight(setCalendar(0,30,0), setCalendar(0,28,0), weekdays, "1005", "THY", edinburgh, vien, setCalendar(0,2,0));
			Flight flight6 = new Flight(setCalendar(0,22,0), setCalendar(0,12,0), weekdays, "1006", "EasyJet", paris, berlin, setCalendar(0,10,0));
			Flight flight7 = new Flight(setCalendar(0,20,0), setCalendar(0,14,0), weekdays, "1007", "AirChina", tokyo, sydney, setCalendar(0,6,0));
			Flight flight8 = new Flight(setCalendar(1,10,0), setCalendar(1,0,0), weekdays, "1008", "THY", sydney, helsinki, setCalendar(0,10,0));
			Flight flight9 = new Flight(setCalendar(1,35,0), setCalendar(1,15,0), weekdays, "1009", "Delta", newyork, istanbul, setCalendar(0,20,0));
			Flight flight10 = new Flight(setCalendar(2,10,0), setCalendar(2,0,0), weekdays, "1010", "American", madrid, paris, setCalendar(0,10,0));
			Flight flight11 = new Flight(setCalendar(2,20,0), setCalendar(3,33,0), weekdays, "1011", "Qatar Airlines", berlin, newdeli, setCalendar(0,7,0));
			Flight flight12 = new Flight(setCalendar(2,41,0), setCalendar(3,50, 0), weekdays,"1012","Albawings", athen, zagreb, setCalendar(0,3,0));
			Flight flight13 = new Flight(setCalendar(2, 11,0), setCalendar(4, 10,0), weekdays,"1013", "People's Air", stockholm, dublin, setCalendar(0, 5, 0));
			Flight flight14 = new Flight(setCalendar(3,56,0), setCalendar(3,45,0),weekdays, "1014", "SUN_AIR of Scandinavia", helsinki,oslo, setCalendar(0,25,0) );
			
			flights.add(flight1);
			flights.add(flight2);
			flights.add(flight3);
			flights.add(flight4);
			flights.add(flight5);
			flights.add(flight6);
			flights.add(flight7);
			flights.add(flight8);
			flights.add(flight9);
			flights.add(flight10);
			flights.add(flight11);
			flights.add(flight12);
			flights.add(flight13);
			flights.add(flight14);





			
			Flight_Track gui = new Flight_Track(flights, capitals);
			gui.writeFileCapital(capitals);
			gui.writeFile(flights);
			gui.fillTable();
			gui.setVisible(true);
		}
		else {
			
			createFlightsFromFile();
			createCapitalsFromFile();
			Flight_Track gui = new Flight_Track(flights, capitals);
			gui.fillTable();
			gui.setVisible(true);
		}
		
	}
	

	@SuppressWarnings("unchecked")
	public static void createFlightsFromFile() {
		String fileName = "src/flights.dat";
    	ObjectInputStream reader;
		try {
			reader = new ObjectInputStream(new FileInputStream(fileName));
			flights = (ArrayList<Flight>)reader.readObject();
	    	reader.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public static void createCapitalsFromFile() {
		String fileName = "src/capitals.dat";
    	ObjectInputStream reader;
		try {
			reader = new ObjectInputStream(new FileInputStream(fileName));
			capitals = (ArrayList<Capital>)reader.readObject();
	    	reader.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	

		public static Calendar setCalendar(int h, int m, int s) {
			Calendar tmp = Calendar.getInstance();
			tmp.set(Calendar.HOUR_OF_DAY, h);
			tmp.set(Calendar.MINUTE, m);
			tmp.set(Calendar.SECOND, s);
			
			return tmp;
		}
		
}


