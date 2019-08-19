import java.lang.*;

public class fixheight {

	public static int g_real_height = 0;
	public static int fall = 1;

public static int faktor, cluster;

	public static int fix_height_bug(int height_reading) {
	  int height = 0; // d16@1

	  if ( g_real_height < (32767-2000) )
	  {
			fall=1;
			height = height_reading;
			g_real_height = height_reading;
	  } else
	  if ( g_real_height < (2*32767-2000) )
	  {
			fall=2;
	    height = height_reading;
	    if ( height_reading < 0 )
	      height = height + 2*32767;
	    g_real_height = height;
	  } else
	  if ( g_real_height < (3*32767-2000) )
	  {
			fall=3;
	    height = height_reading + 2*32767;
	    g_real_height = height;
	  } else
	  if ( g_real_height < (4*32767-2000) )
	  {
			fall=4;
	    height = height_reading + 2*32767;
	    if ( height_reading < 0 )
	      height = height_reading + 4*32767;
	    g_real_height = height;
	  } else
		if ( g_real_height < (5*32767-2000) )
	  {
			fall=5;
	    height = height_reading + 4*32767;
	    g_real_height = height;
		} else
		if ( g_real_height < (6*32767-2000) )
	  {
			fall=6;
	    height = height_reading + 4*32767;
	    if ( height_reading < 0 )
	      height = height_reading + 6*32767;
	    g_real_height = height;
		} else
		if ( g_real_height < (7*32767-2000) )
	  {
			fall=7;
	    height = height_reading + 6*32767;
	    g_real_height = height;
		}



	  return height;
	}


 public static int fix_height_bug_2( int height_reading ) {
	 int height = 0; // d16@1

	 faktor = (g_real_height / java.lang.Short.MAX_VALUE);
	 cluster = faktor % 2;

	 if(true){
 		 for (int i = 1; i < 11; i++) {
			 if(g_real_height >= 0 && g_real_height < (i*java.lang.Short.MAX_VALUE)-5000) {
 				 fall = i;
 				 if((fall%2==0) && height_reading < 0)
 				 	height = height_reading + (fall * java.lang.Short.MAX_VALUE);
				else
					height = height_reading + (((fall-1) - ((fall-1)%2)) * java.lang.Short.MAX_VALUE);
 				 g_real_height = height;
 				 break;
 			 } else
			 if(g_real_height < 0 && g_real_height > (i*java.lang.Short.MIN_VALUE)+5000) {
 				 fall = i;
 				 if((fall%2==0) && height_reading > 0)
 				 	height = height_reading + (fall * java.lang.Short.MIN_VALUE);
				else
					height = height_reading + (((fall-1) - ((fall-1)%2)) * java.lang.Short.MIN_VALUE);
				 g_real_height = height;
 				 break;
 			 }
 		 }
 	 }

	 if(false){
	 if ( g_real_height < (1*32767-2000) )
	 {
		 fall=1; // faktor = 0, cluster = 0
		 height = height_reading + 0*32767; // (faktor - cluster) * 32767
		 g_real_height = height;
	 } else
	 if ( g_real_height < (2*32767-2000) )
	 {
		 fall=2; // faktor = 1, cluster = 1
		 height = height_reading + (0 * 32767); // (faktor - cluster) * 32767
		 if ( cluster == 1 && height_reading < 0 )
			 height = height_reading + 2*32767; // fall * 32767
		 g_real_height = height;
	 } else
	 if ( g_real_height < (3*32767-2000) )
	 {
		 fall=3; // faktor = 2, cluster = 0
		 height = height_reading + 2*32767; // (faktor - cluster) * 32767
		 g_real_height = height;
	 } else
	 if ( g_real_height < (4*32767-2000) )
	 {
		 fall=4; // faktor = 3, cluster = 1
		 height = height_reading + 2*32767; // (faktor - cluster) * 32767
		 if ( cluster == 1 && height_reading < 0 )
			 height = height_reading + 2*32767 + 2*32767; // fall * 32767
		 g_real_height = height;
	 } else
	 if ( g_real_height < (5*32767-2000) )
	 {
		 fall=5; // faktor = 4, cluster = 0
		 height = height_reading + 2*32767 + 2*32767; // (faktor - cluster) * 32767
		 g_real_height = height;
	 } else
	 if ( g_real_height < (6*32767-2000) )
	 {
		 fall=6; // faktor = 5, cluster = 1
		 height = height_reading + 2*32767 + 2*32767; // (faktor - cluster) *  32767
		 if ( cluster == 1 && height_reading < 0 )
			 height = height_reading + 2*32767 + 2*32767 + 2*32767; // fall * 32767
		 g_real_height = height;
	 } else
	 if ( g_real_height < (7*32767-2000) )
	 {
		 fall=7; // faktor = 6, cluster = 0
		 height = height_reading + 2*32767 + 2*32767 + 2*32767; // (faktor - cluster) * 32767
		 g_real_height = height;
	 }
 }

	 return height;
 }


	public static void main(String[] args) {

			int height;
			int new_height;
			short height_reading=0;
			int height_increment=1000;
			double d = 0 ;

			for(int i = 0; i < 40000; i++) {
				d = fix_height_bug_2(height_reading)/10.0;
				if( height_reading % height_increment == 0)
					System.out.println(height_reading/10.0 + ": " + d + " Fall "+fall);
				height_reading++;
			}

			for(int i = 0; i < 80000; i++) {
				d = fix_height_bug_2(height_reading)/10.0;
				if( height_reading % height_increment == 0)
					System.out.println(height_reading/10.0 + ": " + d + " Fall "+fall);
				height_reading--;
			}

			for(int i = 0; i < 80000; i++) {
				d = fix_height_bug_2(height_reading)/10.0;
				if( height_reading % height_increment == 0)
					System.out.println(height_reading/10.0 + ": " + d + " Fall "+fall);
				height_reading++;
			}

		}
}

