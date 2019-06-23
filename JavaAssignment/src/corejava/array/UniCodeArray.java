package corejava.array;

import java.util.Scanner;

public class UniCodeArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Start value in Unicode Hex:"); // Format is 0000 to FFFF
        //int a = Integer.toHexString();
        int a = sc.nextInt(16);
        char c = (char)a;
        System.out.println(a +" " + c );
        System.out.println("Enter the End value in Unicode Hex:"); // Format is 0000 to FFFF
        int b = sc.nextInt(16);
        char e = (char)b;
        System.out.println(b +" " + e );
        int d = b - a ;
        System.out.println(d + " characters");
        // create a table for Unicode Character

        for (int i = c ; i <= b ; i++ ){
            System.out.print("\t" + (char)i);
        }


    }
}
/* Enter the Start value in Unicode Hex:
0021
33 !
Enter the End value in Unicode Hex:
005a
90 Z
57
	!	"	#	$	%	&	'	(	)	*	+	,	-	.	/	0	1	2	3	4	5
	6	7	8	9	:	;	<	=	>	?	@	A	B	C
	D	E	F	G	H	I	J	K	L	M	N	O	P	Q	R	S	T	U	V	W	X	Y	Z
 */