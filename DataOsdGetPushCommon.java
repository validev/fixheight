package dji.midware.data.model.P3;

import java.lang.*;

public class DataOsdGetPushCommon {

	private static int adjusted_altitude = 0;
	private static int last_sector = 0;
	
	public static int fall = 1;
	public static int faktor, cluster;
	public static String voicesample;

	public static void playHeightVoiceSample() {
		int height = adjusted_altitude / 10;
		int sector = height / 10;
		int sampleid;

		if (sector != last_sector) {
			if(sector < last_sector) {
				last_sector=sector;
				if (height >0)
					sector++;
			} else {
				last_sector=sector;
				if (height <0)
					sector++;
			}

			sampleid = 0;

			switch(sector) {
				case 1:
					sampleid = 0x7f080100;
					break;
				case 2:
					sampleid = 0x7f080101;
					break;
				case 3:
					sampleid = 0x7f080102;
					break;
				case 4:
					sampleid = 0x7f080103;
					break;
				case 5:
					sampleid = 0x7f080104;
					break;
				case 6:
					sampleid = 0x7f080105;
					break;
				case 7:
					sampleid = 0x7f080106;
					break;
				case 8:
					sampleid = 0x7f080107;
					break;
				case 9:
					sampleid = 0x7f080108;
					break;
				case 10:
					sampleid = 0x7f080109;
					break;
				case 20:
					sampleid = 0x7f08010a;
					break;
				case 30:
					sampleid = 0x7f08010b;
					break;
				case 40:
					sampleid = 0x7f08010c;
					break;
				case 50:
					sampleid = 0x7f08010d;
					break;
				case 60:
					sampleid = 0x7f08010e;
					break;
				case 70:
					sampleid = 0x7f08010f;
					break;
				case 80:
					sampleid = 0x7f080110;
					break;
				case 90:
					sampleid = 0x7f080111;
					break;
				case 100:
					sampleid = 0x7f080112;
					break;
				case 110:
					sampleid = 0x7f080113;
					break;
				case 120:
					sampleid = 0x7f080114;
					break;
				case 130:
					sampleid = 0x7f080115;
					break;
				case 140:
					sampleid = 0x7f080116;
					break;
				case 150:
					sampleid = 0x7f080117;
					break;
				case 160:
					sampleid = 0x7f080118;
					break;
				case 170:
					sampleid = 0x7f080119;
					break;
				case 180:
					sampleid = 0x7f08011a;
					break;
				case 190:
					sampleid = 0x7f08011b;
					break;
				case 200:
					sampleid = 0x7f08011c;
					break;
				case 210:
					sampleid = 0x7f08011d;
					break;
				case 220:
					sampleid = 0x7f08011e;
					break;
				case 230:
					sampleid = 0x7f08011f;
					break;
				case 240:
					sampleid = 0x7f080120;
					break;
				case 250:
					sampleid = 0x7f080121;
					break;
				case 260:
					sampleid = 0x7f080122;
					break;
				case 270:
					sampleid = 0x7f080123;
					break;
				case 280:
					sampleid = 0x7f080124;
					break;
				case 290:
					sampleid = 0x7f080125;
					break;
				case 300:
					sampleid = 0x7f080126;
					break;
				case 0:
					sampleid = 0x7f080127;
					break;
				case 15:
					sampleid = 0x7f080128;
					break;
				case 25:
					sampleid = 0x7f080129;
					break;
				case -15:
					sampleid = 0x7f08012a;
					break;
				case -25:
					sampleid = 0x7f08012b;
					break;
				case -1:
					sampleid = 0x7f080200;
					break;
				case -2:
					sampleid = 0x7f080201;
					break;
				case -3:
					sampleid = 0x7f080202;
					break;
				case -4:
					sampleid = 0x7f080203;
					break;
				case -5:
					sampleid = 0x7f080204;
					break;
				case -6:
					sampleid = 0x7f080205;
					break;
				case -7:
					sampleid = 0x7f080206;
					break;
				case -8:
					sampleid = 0x7f080207;
					break;
				case -9:
					sampleid = 0x7f080208;
					break;
				case -10:
					sampleid = 0x7f080209;
					break;
				case -20:
					sampleid = 0x7f08020a;
					break;
				case -30:
					sampleid = 0x7f08020b;
					break;
				case -40:
					sampleid = 0x7f08020c;
					break;
				case -50:
					sampleid = 0x7f08020d;
					break;
				case -60:
					sampleid = 0x7f08020e;
					break;
				case -70:
					sampleid = 0x7f08020f;
					break;
				case -80:
					sampleid = 0x7f080210;
					break;
				case -90:
					sampleid = 0x7f080211;
					break;
				case -100:
					sampleid = 0x7f080212;
					break;
				case -110:
					sampleid = 0x7f080213;
					break;
				case -120:
					sampleid = 0x7f080214;
					break;
				case -130:
					sampleid = 0x7f080215;
					break;
				case -140:
					sampleid = 0x7f080216;
					break;
				case -150:
					sampleid = 0x7f080217;
					break;
				case -160:
					sampleid = 0x7f080218;
					break;
				case -170:
					sampleid = 0x7f080219;
					break;
				case -180:
					sampleid = 0x7f08021a;
					break;
				case -190:
					sampleid = 0x7f08021b;
					break;
				case -200:
					sampleid = 0x7f08021c;
					break;
				case -210:
					sampleid = 0x7f08021d;
					break;
				case -220:
					sampleid = 0x7f08021e;
					break;
				case -230:
					sampleid = 0x7f08021f;
					break;
				case -240:
					sampleid = 0x7f080220;
					break;
				case -250:
					sampleid = 0x7f080221;
					break;
				case -260:
					sampleid = 0x7f080222;
					break;
				case -270:
					sampleid = 0x7f080223;
					break;
				case -280:
					sampleid = 0x7f080224;
					break;
				case -290:
					sampleid = 0x7f080225;
					break;
				case -300:
					sampleid = 0x7f080226;
					break;
				default:
					sampleid = 0;
					break;
			}
			if(sampleid!= 0) {
				String s = java.lang.String.format("Hoehe: %d, Sampleid: %02x\n", height, sampleid);
				System.out.println(s);
			}
		}
	}

	public static int getHeight() {

		playHeightVoiceSample();

		return adjusted_altitude;
	}

	public static int getHeight1() {
		int height = adjusted_altitude / 10;
		int sector;
		java.lang.String voicesample = null;

		sector = height / 10;
		if (sector != last_sector) {
			if(sector < last_sector) {
				last_sector=sector;
				if (height >0)
					sector++;
			} else {
				last_sector=sector;
				if (height <0)
					sector++;
			}

			switch(sector) {
				case -1:
					voicesample = "-10";
					break;
				case -2:
					voicesample = "-20";
					break;
				case -3:
					voicesample = "-30";
					break;
				case -4:
					voicesample = "-40";
					break;
				case -5:
					voicesample = "-50";
					break;
				case -6:
					voicesample = "-60";
					break;
				case -7:
					voicesample = "-70";
					break;
				case -8:
					voicesample = "-80";
					break;
				case -9:
					voicesample = "-90";
					break;
				case -10:
					voicesample = "-100";
					break;
				case -20:
					voicesample = "-200";
					break;
				case -30:
					voicesample = "-300";
					break;
				case -40:
					voicesample = "-400";
					break;
				case -50:
					voicesample = "-500";
					break;
				case -60:
					voicesample = "-600";
					break;
				case -70:
					voicesample = "-700";
					break;
				case -80:
					voicesample = "-800";
					break;
				case -90:
					voicesample = "-900";
					break;
				case -100:
					voicesample = "-1000";
					break;
				case -110:
					voicesample = "-1100";
					break;
				case -120:
					voicesample = "-1200";
					break;
				case -130:
					voicesample = "-1300";
					break;
				case -140:
					voicesample = "-1400";
					break;
				case -150:
					voicesample = "-1500";
					break;
				case -160:
					voicesample = "-1600";
					break;
				case -170:
					voicesample = "-1700";
					break;
				case -180:
					voicesample = "-1800";
					break;
				case -190:
					voicesample = "-1900";
					break;
				case -200:
					voicesample = "-2000";
					break;
				case -210:
					voicesample = "-2100";
					break;
				case -220:
					voicesample = "-2200";
					break;
				case -230:
					voicesample = "-2300";
					break;
				case -240:
					voicesample = "-2400";
					break;
				case -250:
					voicesample = "-2500";
					break;
				case -260:
					voicesample = "-2600";
					break;
				case -270:
					voicesample = "-2700";
					break;
				case -280:
					voicesample = "-2800";
					break;
				case -290:
					voicesample = "-2900";
					break;
				case -300:
					voicesample = "-3000";
					break;
				case 1:
					voicesample = "10";
					break;
				case 2:
					voicesample = "20";
					break;
				case 3:
					voicesample = "30";
					break;
				case 4:
					voicesample = "40";
					break;
				case 5:
					voicesample = "50";
					break;
				case 6:
					voicesample = "60";
					break;
				case 7:
					voicesample = "70";
					break;
				case 8:
					voicesample = "80";
					break;
				case 9:
					voicesample = "90";
					break;
				case 10:
					voicesample = "100";
					break;
				case 20:
					voicesample = "200";
					break;
				case 30:
					voicesample = "300";
					break;
				case 40:
					voicesample = "400";
					break;
				case 50:
					voicesample = "500";
					break;
				case 60:
					voicesample = "600";
					break;
				case 70:
					voicesample = "700";
					break;
				case 80:
					voicesample = "800";
					break;
				case 90:
					voicesample = "900";
					break;
				case 100:
					voicesample = "1000";
					break;
				case 110:
					voicesample = "1100";
					break;
				case 120:
					voicesample = "1200";
					break;
				case 130:
					voicesample = "1300";
					break;
				case 140:
					voicesample = "1400";
					break;
				case 150:
					voicesample = "1500";
					break;
				case 160:
					voicesample = "1600";
					break;
				case 170:
					voicesample = "1700";
					break;
				case 180:
					voicesample = "1800";
					break;
				case 190:
					voicesample = "1900";
					break;
				case 200:
					voicesample = "2000";
					break;
				case 210:
					voicesample = "2100";
					break;
				case 220:
					voicesample = "2200";
					break;
				case 230:
					voicesample = "2300";
					break;
				case 240:
					voicesample = "2400";
					break;
				case 250:
					voicesample = "2500";
					break;
				case 260:
					voicesample = "2600";
					break;
				case 270:
					voicesample = "2700";
					break;
				case 280:
					voicesample = "2800";
					break;
				case 290:
					voicesample = "2900";
					break;
				case 300:
					voicesample = "3000";
					break;
				default:
					voicesample = null;
					break;
			}
			if(voicesample!= null) {
				System.out.printf("Hoehe: %s Meter\n", voicesample);
			}
		}

		return adjusted_altitude;
	}

	public static int fix_height_bug(int height_reading) {
	  int height = 0; // d16@1

	  if ( adjusted_altitude < (32767-2000) )
	  {
			fall=1;
			height = height_reading;
			adjusted_altitude = height_reading;
	  } else
	  if ( adjusted_altitude < (2*32767-2000) )
	  {
			fall=2;
	    height = height_reading;
	    if ( height_reading < 0 )
	      height = height + 2*32767;
	    adjusted_altitude = height;
	  } else
	  if ( adjusted_altitude < (3*32767-2000) )
	  {
			fall=3;
	    height = height_reading + 2*32767;
	    adjusted_altitude = height;
	  } else
	  if ( adjusted_altitude < (4*32767-2000) )
	  {
			fall=4;
	    height = height_reading + 2*32767;
	    if ( height_reading < 0 )
	      height = height_reading + 4*32767;
	    adjusted_altitude = height;
	  } else
		if ( adjusted_altitude < (5*32767-2000) )
	  {
			fall=5;
	    height = height_reading + 4*32767;
	    adjusted_altitude = height;
		} else
		if ( adjusted_altitude < (6*32767-2000) )
	  {
			fall=6;
	    height = height_reading + 4*32767;
	    if ( height_reading < 0 )
	      height = height_reading + 6*32767;
	    adjusted_altitude = height;
		} else
		if ( adjusted_altitude < (7*32767-2000) )
	  {
			fall=7;
	    height = height_reading + 6*32767;
	    adjusted_altitude = height;
		}



	  return height;
	}


 public static int fix_height_bug_2( int height_reading ) {
	 int height = 0; // d16@1

	 // faktor = (adjusted_altitude / java.lang.Short.MAX_VALUE);
	 //cluster = faktor % 2;

	 if(true){
	 if ( adjusted_altitude < (1*32767-2000) )
	 {
		 fall=1; // faktor = 0, cluster = 0
		 height = height_reading + 0*32767; // (faktor - cluster) * 32767
		 adjusted_altitude = height;
	 } else
	 if ( adjusted_altitude < (2*32767-2000) )
	 {
		 fall=2; // faktor = 1, cluster = 1
		 height = height_reading + (0 * 32767); // (faktor - cluster) * 32767
		 if ( cluster == 1 && height_reading < 0 )
			 height = height_reading + 2*32767; // fall * 32767
		 adjusted_altitude = height;
	 } else
	 if ( adjusted_altitude < (3*32767-2000) )
	 {
		 fall=3; // faktor = 2, cluster = 0
		 height = height_reading + 2*32767; // (faktor - cluster) * 32767
		 adjusted_altitude = height;
	 } else
	 if ( adjusted_altitude < (4*32767-2000) )
	 {
		 fall=4; // faktor = 3, cluster = 1
		 height = height_reading + 2*32767; // (faktor - cluster) * 32767
		 if ( cluster == 1 && height_reading < 0 )
			 height = height_reading + 2*32767 + 2*32767; // fall * 32767
		 adjusted_altitude = height;
	 } else
	 if ( adjusted_altitude < (5*32767-2000) )
	 {
		 fall=5; // faktor = 4, cluster = 0
		 height = height_reading + 2*32767 + 2*32767; // (faktor - cluster) * 32767
		 adjusted_altitude = height;
	 } else
	 if ( adjusted_altitude < (6*32767-2000) )
	 {
		 fall=6; // faktor = 5, cluster = 1
		 height = height_reading + 2*32767 + 2*32767; // (faktor - cluster) *  32767
		 if ( cluster == 1 && height_reading < 0 )
			 height = height_reading + 2*32767 + 2*32767 + 2*32767; // fall * 32767
		 adjusted_altitude = height;
	 } else
	 if ( adjusted_altitude < (7*32767-2000) )
	 {
		 fall=7; // faktor = 6, cluster = 0
		 height = height_reading + 2*32767 + 2*32767 + 2*32767; // (faktor - cluster) * 32767
		 adjusted_altitude = height;
	 }
 }

	 return height;
 }

public static int fix_height_bug_3(int height_reading) {
	int height = 0;

	// height_reading kommt vom AC und wird in dm (Decimeter) angegeben

	// adjusted_altitude ist globale Variable und speichert die tatsächliche Höhe in dm (Dezimeter)

	// maximal anzeigbare Höhe: 5*Short.MAX_VALUE-margin = ca. 15600m
	int j = 6;
	// Sicherheitsbereich, nach dem der Algorithmus in den nächst höheren Fall wechselt
	// 5000dm = 500m vor
	int margin = 5000;

	for (int i = 1; i < j; i++) {
		if(adjusted_altitude >= 0 && adjusted_altitude < (i*java.lang.Short.MAX_VALUE)-margin) {
			if((i%2==0) && height_reading < 0)
			 height = height_reading + (i * java.lang.Short.MAX_VALUE);
		 else
			 height = height_reading + (((i-1) - ((i-1)%2)) * java.lang.Short.MAX_VALUE);
			adjusted_altitude = height;
			break;
		} else
		if(adjusted_altitude < 0 && adjusted_altitude > (i*java.lang.Short.MIN_VALUE)+margin) {
			if((i%2==0) && height_reading > 0)
			 height = height_reading + (i * java.lang.Short.MIN_VALUE);
		 else
			 height = height_reading + (((i-1) - ((i-1)%2)) * java.lang.Short.MIN_VALUE);
			adjusted_altitude = height;
			break;
		} else {
			if(i==j-1) {
				adjusted_altitude=height_reading;
				height=height_reading;
				break;
			}
		}
	}

return height;
}



public static int adjust_altitude(int height_reading) {

	// Rückgabewert
	int l_result = 0;

	// Alte tatsächliche Höhe in lokale Variable ablegen
	// adjusted_altitude ist globale Variable und speichert die tatsächliche Höhe in dm (Dezimeter)
	int l_real_height = adjusted_altitude;

	// Lokale Variable von Parameter der Funktion anlegen
	// height_reading kommt vom AC und wird in dm (Decimeter) angegeben
	int l_height_reading = height_reading;

	// maximal anzeigbare Höhe: 5*Short.MAX_VALUE-margin = ca. 15600m
	int l_short_segments = 6;
	// Sicherheitsbereich, nach dem der Algorithmus in den nächst höheren Fall wechselt
	// 5000dm = 500m vor
	int l_margin = 5000;


	for (int l_counter = 1; l_counter < l_short_segments; l_counter++) {
		if(l_real_height >= 0 && l_real_height < (l_counter*java.lang.Short.MAX_VALUE)-l_margin) {
			if((l_counter%2==0) && l_height_reading < 0)
			 l_result = l_height_reading + (l_counter * java.lang.Short.MAX_VALUE);
		 else
			 l_result = l_height_reading + (((l_counter-1) - ((l_counter-1)%2)) * java.lang.Short.MAX_VALUE);
			break;
		} else

		if(l_real_height < 0 && l_real_height > (l_counter*java.lang.Short.MIN_VALUE)+l_margin) {
			if((l_counter%2==0) && l_height_reading > 0)
			 l_result = l_height_reading + (l_counter * java.lang.Short.MIN_VALUE);
		 else
			 l_result = l_height_reading + (((l_counter-1) - ((l_counter-1)%2)) * java.lang.Short.MIN_VALUE);
			break;
		} else {

			// Überlauf: wenn die Höhe außerhalb des abgedeckten Bereichs kommt, wird sie auf height_reading gesetzt
			if(l_counter==l_short_segments-1) {
				l_result=l_height_reading;
				// eigentlich überflüssig, da wir sowieso bereits im letzten Schleifendurchlauf sind.
				break;
			}

		}
	}

adjusted_altitude = l_result;

return l_result;
}


	public static void main(String[] args) {

			int height;
			int new_height;
			short height_reading=0;
			int height_increment=1000;
			double d = 0 ;

			java.util.Random wuerfel = new java.util.Random();

			System.out.println("Aufstieg");
			for(int i = 0; i < 25000; i++) {
				d = adjust_altitude(height_reading)/10.0;
				if(height_reading % height_increment == 0) {
					//System.out.println(height_reading/10.0 + ": " + d + " Fall "+fall+ (d*10!=adjusted_altitude ? " "+adjusted_altitude : ""));
					//System.out.printf("%8.1f: %8.1f Fall %d %s\n", height_reading/10.0, d, fall,  (d*10!=adjusted_altitude ? " "+adjusted_altitude : ""));
					System.out.printf("%8.1f: %8.1f  %s\n", height_reading/10.0, d, (d*10!=adjusted_altitude ? " "+adjusted_altitude : ""));
				}
				height_reading += 1+wuerfel.nextInt(10);
				getHeight();
			}


			System.out.println("Abstieg");
			for(int i = 0; i < 50000; i++) {
				d = adjust_altitude(height_reading)/10.0;
				if( height_reading % height_increment == 0)
					System.out.printf("%8.1f: %8.1f  %s\n", height_reading/10.0, d, (d*10!=adjusted_altitude ? " "+adjusted_altitude : ""));
				height_reading-=1+wuerfel.nextInt(10);
				getHeight();
			}


				System.out.println("Aufstieg");
				for(int i = 0; i < 50000; i++) {
				d = adjust_altitude(height_reading)/10.0;
				if( height_reading % height_increment == 0)
					System.out.printf("%8.1f: %8.1f  %s\n", height_reading/10.0, d, (d*10!=adjusted_altitude ? " "+adjusted_altitude : ""));
				height_reading+=1+wuerfel.nextInt(10);
				getHeight();
			}

		}
}

