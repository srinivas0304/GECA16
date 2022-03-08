class VowelConsonant{
public static void main(String [] args){

	char ch='g';
	switch (ch) {
	case 'A':
	case 'a':
	case 'E':
	case 'e':
	case 'I':
	case 'i':
	case 'O':
	case 'o':
	case 'U':
	case 'u':{
	System.out.println(ch+" is Vowel");
	break;
	}
	case '0':
	case '1':
	case '2':
	case '3':
	case '4':
	case '5':
	case '6':
	case '7':
	case '8':
	case '9':{
	System.out.println(ch+" is Digit");
	}
}
}


}
