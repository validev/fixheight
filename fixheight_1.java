import java.lang.*;

public class fixheight {

	public static int g_real_height = 0;


	public static int fix_height_bug(int a1) {
	  int v1; // d16@1
	  int v2; // d16@10
	  int v3; // d19@10
	  int v4; // d16@14
	  int v5; // d17@14

	  v1 = g_real_height;
	  if ( g_real_height < 30000 )
	  {
	    g_real_height = a1;
	  }
	  if ( v1 >= 30000 && v1 < 60000 )
	  {
	    v1 = a1;
	    if ( a1 < 0 )
	      v1 = v1 + 32767 + 32767;
	    g_real_height = v1;
	  }
	  if ( v1 >= 60000 && v1 < 90000 )
	  {
	    v2 = a1;
	    v3 = v2 + 32767;
	    v1 = v2 + 65534;
	    if ( a1 < 0 )
	      v1 = v3 + 32767;
	    g_real_height = v1;
	  }
	  if ( v1 >= 90000 )
	  {
	    v4 = a1;
	    v5 = v4 + 131068;
	    v1 = v4 + 65534;
	    if ( a1 < 0 )
	      v1 = v5;
	    g_real_height = v1;
	  }
	  return v1;
	}


	public static void main(String[] args) {

			int height;
			int new_height;

			for(height=0; height < 32767; height=height+1000) {

				new_height = fix_height_bug(height);

				System.out.println(height/10.0 + " - " + new_height/10.0);

			}

			for(height=-32767; height < 32767; height=height+1000) {

				new_height = fix_height_bug(height);

				System.out.println(height/10.0 + " - " + new_height/10.0);

			}

			for(height=-32767; height < 32767; height=height+1000) {

				new_height = fix_height_bug(height);

				System.out.println(height/10.0 + " - " + new_height/10.0);

			}

			for(height=-32767; height < 32767; height=height+1000) {

				new_height = fix_height_bug(height);

				System.out.println(height/10.0 + " - " + new_height/10.0);

			}


	}
}

