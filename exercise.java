public class exercise{
    public static void main(String[]args){
        // 1.  int, char, String

        // 2. // prints -4
        int x = 3, p = 5, y = -8;
        switch (x) {
            case 2:
                p++;
            case 3:
            case 4:
                y += (--p); 
                break;
            case 5:
                y += (p++); 
        }
        System.out.println(y);  

        // 3. 
        char myChar = 'G';
        int y2 = 0;
        switch (myChar) {
            case 'G':
            case 'g':
                y2++;
                break;
            case 'M':
            case 'm':
                y2--;
                break;
            default:
                y2 += 100;
        }
        System.out.println(y2);

        // 4. // prints 3
        String s = "Green";
        int q = 0;
        switch (s) {
            case "Red":
                q++;
            case "Green":
                q++;
            case "Blue":
                q++;
            case "Yellow":
                q++;
            default:
                q++;
        }
        System.out.println(--q); 

        // 5. 
        char chr = 'z';

        // 6. 
        // The sum is 1012
        // The sum is 22
        int x2 = 10, y3 = 12;
        System.out.println("The sum is " + x2 + y3);   
        System.out.println("The sum is " + (x2 + y3)); 
        
        // 7. 
        int speed = 70;
        switch (speed) {
            case 75:
                System.out.println("Exceeding speed limit");
                break;
            case 69:
            case 70:
                System.out.println("Getting close");
                break;
            case 65:
                System.out.println("Cruising");
                break;
            default:
                System.out.println("Very slow");
        }

        // 8.  No

        // 9. // prints 'X'
        String s2 = "X";
        char chr2 = s2.charAt(0);
        System.out.println(chr2); 
    }
}